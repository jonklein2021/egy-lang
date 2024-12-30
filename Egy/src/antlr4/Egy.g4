/** Based on Asa grammar from Compiler Design (CSE 302/402) @ Lehigh University */
grammar Egy;

/****************************
            Types
****************************/

type
  : discrete_type type_suffix*
  ;

type_suffix
  : LBRACKET numeric_literal? RBRACKET       // Array type
  | LBRACE numeric_literal? RBRACE           // Set type
  ;

discrete_type
  : CHAR
  | NUMBER
  | STRING
  | function_type
  ;

function_type
  : FUNCTION COLON LPAREN parameter_types? RPAREN RIGHTARROW return_type
  ;

parameter_types
  : type ( COMMA type )*
  ;

return_type
  : type
  | VOID
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
  : LBRACKET literal ( COMMA literal )* RBRACKET
  ;

discrete_literal
  : char_literal
  | boolean_literal
  | function_definition
  | numeric_literal
  ;

boolean_literal
  : TRUE
  | FALSE
  ;

/*
  ex:

  (a: int, b: int) -> int
    if a > b
      return a
    else
      return b

  (n: long) -> long
    return n+1;
*/
function_definition
  : LPAREN ( ID COLON type ( COMMA ID COLON type )* )? RPAREN RIGHTARROW type statement
  ;

numeric_literal
  : BINARYLITERAL
  | DECIMALLITERAL ( PERIOD DECIMALLITERAL? )?
  | OCTALLITERAL
  | HEXADECIMALLITERAL
  ;  

set_literal
  : LBRACE literal ( COMMA literal )* RBRACE
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
  | return_statement
  ;

assignment_statement
  : lvalue ASSIGN logical_expression ( COMMA lvalue ASSIGN logical_expression )* SEMICOLON
  ;

const_initialization_statement
  : CONST lvalue ( COLON type )? ASSIGN logical_expression ( COMMA lvalue ( COLON type )? ASSIGN logical_expression )* SEMICOLON
  ;

declaration_statement
  : LET lvalue COLON type ( COMMA lvalue ( COLON type )? )* SEMICOLON
  ;

initialization_statement
  : LET lvalue ( COLON type )? ASSIGN logical_expression ( COMMA lvalue ( COLON type )? ASSIGN logical_expression )* SEMICOLON
  ;

lvalue
  : function_call                                         // Function call
  | ID ( LBRACKET simple_expression RBRACKET )*           // Array access
  ;

/*
  ex:

  add(x, 1*2)
  foo(a, b, c)
  arrayReturner()[0]
  functionReturner()()
  crazy(0)[10]()()[a+b](1)
*/
rvalue
  : function_call                                         // Function call
  | ID ( LBRACKET simple_expression RBRACKET )*           // Array access
  ;

function_call
  : ID LPAREN argument_list? RPAREN ( LBRACKET simple_expression RBRACKET )* function_call_suffix*
  ;

function_call_suffix
  : LPAREN argument_list? RPAREN                          // Additional function call (e.g., `()`)
  | LBRACKET simple_expression RBRACKET                   // Array indexing (e.g., `[i]`)
  ;

argument_list
  : simple_expression ( COMMA simple_expression )*            // A list of expressions (comma-separated)
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
  : FOR ID IN for_iterable statement
  ;

for_iterable
  : ID
  | set_literal
  | simple_expression
  ;

if_statement
  : IF logical_expression statement ( ELSE statement )?
  ;

print_statement
  : PRINT LPAREN simple_expression ( COMMA simple_expression )* RPAREN SEMICOLON
  ;

return_statement
  : RETURN logical_expression SEMICOLON
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
  : base (op=POW base)*
  ;

base
  : LPAREN fle=logical_expression RPAREN
  | fl=literal
  | fi=rvalue
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

DOUBLEQUOTE
  : '"'
  ;

ELSE
  : 'else'
  ;

EQUALS
  : '=='
  ;

FALSE
  : 'false'
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

NUMBER
  : 'num'
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

POW
  : '**'
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

RETURN
  : 'return'
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

SINGLEQUOTE
  : '\''
  ;

STRING
  : 'string'
  ;

TIMES 
  : '*'
  ;

TRUE
  : 'true'
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
ID
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
  :	SINGLEQUOTE SingleCharacter SINGLEQUOTE
  |	SINGLEQUOTE EscapeSequence SINGLEQUOTE
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
  : UnterminatedStringLiteral DOUBLEQUOTE
  ;

UnterminatedStringLiteral
  : DOUBLEQUOTE (~["\\\r\n] | '\\' (. | EOF))*
  ;

COMMENT
  : '//' ~[\r\n]* -> skip
  | '/*' .*? '*/' -> skip
  ;


WS
  : [ \r\n\t]+ -> skip
  ;
