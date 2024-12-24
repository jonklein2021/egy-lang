/** Based on Asa grammar from Compiler Design (CSE 302/402) @ Lehigh University */
grammar Egy;

/****************************
            Types
****************************/

type
  : array_type
  | discrete_type
  | set_type
  ;

array_type
  : type LBRACKET ( integerLiteral )? RBRACKET
  ;

discrete_type
  : CHAR
  | SHORT
  | INT
  | LONG
  | LONGER
  | FLOAT
  | DOUBLE
  | STRING
  | FUNCTION
  ;

set_type
  : type LBRACE ( integerLiteral )? RBRACE
  ;

/****************************
          Literals
****************************/

literal
  : array_literal
  | discrete_literal
  | string_literal
  | set_literal
  ;

array_literal
  : LBRACE literal ( COMMA literal )* RBRACE
  ;

discrete_literal
  : char_literal
  | boolean_literal
  | function_definition
  | numeric_literal
  ;

boolean_literal
  : 'true'
  | 'false'
  ;

/*
  ex:

  (a: int, b: int) -> int
    if a > b
      return a
    else
      return b

  succ(n: long) -> long
    return n+1;
*/
function_definition
  : LPAREN ( id COLON type ( COMMA id COLON type )* )? RPAREN RIGHTARROW type statement
  ;

numeric_literal
  : BINARYLITERAL
  | DECIMALLITERAL
  | OCTALLITERAL
  | HEXADECIMALLITERAL
  ;  

set_literal
  : LBRACKET literal ( COMMA literal )* RBRACKET
  ;

/***************************
         Statements
****************************/

statement
  : assignment_statement
  | const_initialization_statement
  | declaration_statement
  | compound_statement
  | if_statement
  | do_while_statement
  | while_statement
  | repeat_statement
  | for_statement
  | print_statement
  ;

assignment_statement
  : lhs_reference ASSIGN logical_expression SEMICOLON
  ;

const_initialization_statement
  : CONST lhs_reference ( COLON type )? ASSIGN logical_expression SEMICOLON
  ;

declaration_statement
  : LET lhs_reference COLON type SEMICOLON
  ;

initialization_statement
  : LET lhs_reference ( COLON type )? ASSIGN logical_expression SEMICOLON
  ;

lhs_reference
  : id ( LBRACKET simple_expression RBRACKET )?
  ;

rhs_value
  : id ( LBRACKET simple_expression RBRACKET )?
  ;

compound_statement
  : LBRACE statement* RBRACE
  ;

do_while_statement
  : DO statement WHILE logical_expression
  ;

while_statement
  : WHILE logical_expression statement
  ;

repeat_statement
  : REPEAT statement UNTIL logical_expression SEMICOLON
  ;

for_statement
  : FOR id IN for_iterable statement
  ;

for_iterable
  : array_literal
  | char_literal DOTDOT char_literal
  | numeric_literal DOTDOT numeric_literal
  | id
  | set_literal
  ;

if_statement
  : IF logical_expression statement ( ELSE statement )?
  ;

print_statement
  : PRINT LPAREN simple_expression ( COMMA simple_expression )* RPAREN SEMICOLON
  ;

/*************************
        Expressions
*************************/

logical_expression
  : relational_expression (op=(AND | OR) relational_expression )?
  ;

relational_expression
  : simple_expression (op=(EQUALS | NOTEQUALTO | LESSTHAN | LESSTHANOREQUALTO | GREATERTHAN | GREATERTHANOREQUALTO | IN) simple_expression )?
  ;

simple_expression
  : term (op+=(PLUS | MINUS) term)*
  ;

term
  : factor (op+=(TIMES | DIVIDE | MOD | LSHIFT | RSHIFT) factor)*
  ;

factor
  : LPAREN fle=logical_expression RPAREN
  | fl=literal
  | fi=rhs_value
  | fn=negation
  ;

negation
  : NOT factor
  ;

/********************
     Lexical Defs
*********************/

AND
  : 'and'
  ;

ASSIGN
  : '='
  ;

COLON
  : ':'
  ;

COMMA
  : ','
  ;

CONST
  : 'const'
  ;

DIVIDE 
  : '/'
  ;

DO
  : 'do'
  ;

DOTDOT
  : '..'
  ;

DOUBLE
  : 'double'
  ;

INT
  : 'int'
  ;

ELSE
  : 'else'
  ;

EQUALS
  : '=='
  ;

FLOAT
  : 'float'
  ;

FOR
  : 'for'
  ;

FUNCTION
  : 'func'
  ;

GREATERTHAN
  : '>'
  ;

GREATERTHANOREQUALTO
  : '>='
  ;

IF
  : 'if'
  ;

IN
  : 'in'
  ;

LBRACE
  : '{'
  ;

LESSTHAN
  : '<'
  ;

LBRACKET
  : '['
  ;

LESSTHANOREQUALTO
  : '<='
  ;

LET
  : 'let'
  ;

LONG
  : 'long'
  ;

LONGER
  : 'longer'
  ;

LPAREN
  : '('
  ;

LSHIFT
  : '<<'
  ;

MINUS
  : '-'
  ;

MOD 
  : 'mod'
  ;

NOTEQUALTO
  : '!='
  ;

OR
  : 'or'
  ;

NOT
  : '!'
  ;

PLUS
  : '+'
  ;

PRINT
  : 'print'
  ;

RBRACE
  : '}'
  ;

RBRACKET
  : ']'
  ;

REPEAT
  : 'repeat'
  ;

RIGHTARROW
  : '->'
  ;

RPAREN
  : ')'
  ;

RSHIFT
  : '>>'
  ;

SEMICOLON
  : ';'
  ;

SET
  : 'set'
  ;

SHORT
  : 'short'
  ;

STRING
  : 'string'
  ;

TIMES 
  : '*'
  ;

UNTIL
  : 'until'
  ;

VOID
  : 'void'
  ;

WHILE
  : 'while'
  ;

/* ex: hello, jimmy_7, _unused */
id
  : [a-zA-Z_][a-zA-Z0-9_]*
  ;

/* ex: 0b1010 */
BINARYLITERAL
  : '0'[bB][01]+
  ;

/* ex: 123 */
DECIMALLITERAL
  : [1-9][0-9]*
  ;

/* ex: 0567 */
OCTALLITERAL
  : '0'[0-7]+
  ;

/* ex: 0x123 */
HEXADECIMALLITERAL
  : '0'[xX][a-fA-F0-9]+
  ;

/* ex: '\b', 'a', '\r', '\f' */
char_literal
  :	'\'' SingleCharacter '\''
  |	'\'' EscapeSequence '\''
  ;

fragment 
SingleCharacter
  :	~['\\\r\n]
  ;

fragment 
EscapeSequence
  : '\\' [btnfr"'\\]
  ;

string_literal
  : '"' (~["\\\r\n] | '\\' (. | EOF))* '"'
  ;

COMMENT
  : '//' ~[\r\n]* -> skip                // Single-line comment
  | '/*' .*? '*/' -> skip                // Multi-line comment
  ;


WS
  : [ \r\n\t]+ -> skip
  ;