/** Based on grammar from CSE 302 @ Lehigh */
grammar Egy;

/*****************
   Main Program
*****************/

program
  : PROGRAM ID statement
  ;

/* TODO: allow for declarations, initializations, and assignments anywhere in the program */

/****************************
  Declarations (not currently used)
****************************/

constant_definition
  : ID EQUALS literal
  ;

type_definition
  : ID EQUALS atype
  ;

variable_declaration
  : ID ( COMMA ID )* COLON atype
  ;

literal
  : discreteLiteral      # DiscreteLiteralAlt
  | STRINGLITERAL        # StringLiteralAlt
  | setLiteral           # SetLiteralAlt
  ;

setLiteral
  : LBRACKET discreteLiteral ( COMMA discreteLiteral )* RBRACKET
  ;

discreteLiteral
  : integerLiteral       # IntegerLiteralAlt
  | booleanLiteral       # BooleanLiteralAlt
  | CHARLITERAL          # CharLiteralAlt
  ;

integerLiteral
  : DECIMALINTEGERLITERAL      # DecimalIntegerLiteralAlt
  | HEXADECIMALINTEGERLITERAL  # HexadecimalIntegerLiteralAlt
  | OCTALINTEGERLITERAL        # OctalIntegerLiteralAlt
  ;  

booleanLiteral
  : 'true'
  | 'false'
  ;

atype
  : namedType 
  | rangeType
  | arrayType
  | setType
  | enumType
  ;

namedType
  : ID
  ;

rangeType
  : discreteLiteral DOTDOT discreteLiteral
  ;

arrayType
  : ARRAY LBRACKET rangeType RBRACKET OF atype
  ;

setType
  : SET OF rangeType
  ;

enumType
  : LPAREN ID ( COMMA ID )* RPAREN
  ;

/***************************
          Statements
****************************/

statement
  : assignment_statement 
  | compound_statement 
  | while_statement 
  | repeat_statement 
  | for_statement
  | if_statement 
  | case_statement
  | print_statement
  ; 

assignment_statement
  : lhsreference ASSIGN logicalexpression SEMICOLON
  ;

lhsreference
  : ID ( LBRACKET simpleexpression RBRACKET )?
  ;

rhsvalue
  : ID ( LBRACKET simpleexpression RBRACKET )?
  ;  

compound_statement
  : LBRACE statement* RBRACE
  ;

while_statement
  : WHILE logicalexpression statement
  ;

repeat_statement
  : REPEAT statement* UNTIL logicalexpression SEMICOLON
  ;

for_statement
  : FOR ID IN for_iterable statement
  ;

for_iterable
  : rangeType
  | ID
  | setLiteral
  ;

if_statement
  : IF logicalexpression THEN statement ( ELSE statement )?
  ;

print_statement
  : PRINT LPAREN simpleexpression ( COMMA simpleexpression )* RPAREN SEMICOLON
  ;

case_statement
  : CASE simpleexpression OF case_limb+ END
  ;

/* 
  Add a production here to complete the case statement. The labels on a case are integer literals; if there
  is more than one then they are separated by commas. A colon separates the labels from the statement that is executed
  when one of the case labels matches.
*/

case_limb
  : integerLiteral (COMMA integerLiteral)* COLON statement
  ;

/*************************
        Expressions
*************************/

/*
  The definition of a logicalexpression, consists of either a single
  relationalexpression or two relationalexpressions separated by one of and/or
*/

logicalexpression
  : relationalexpression (op=(AND | OR) relationalexpression )?
  ;

relationalexpression
  : simpleexpression (op=(EQUALS | NOTEQUALTO | LESSTHAN | LESSTHANOREQUALTO | GREATERTHAN | GREATERTHANOREQUALTO | IN) simpleexpression )?
  ;

simpleexpression
  : term (op+=(PLUS | MINUS) term)*
  ;

term
  : factor (op+=(TIMES | DIVIDE | DIV | MOD | LSHIFT | RSHIFT) factor)*
  ;

factor
  : LPAREN fle=logicalexpression RPAREN
  | fl=literal
  | fi=rhsvalue
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
  : ':='
  ;

ARRAY
  : 'array'
  ;

CASE
  : 'case'
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

DIV
  : 'div'
  ;

DIVIDE 
  : '/'
  ;

DOTDOT
  : '..'
  ;

DOWNTO
  : 'downto'
  ;

ELSE
  : 'else'
  ;

EQUALS
  : '='
  ;

FOR
  : 'for'
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

OF
  : 'of'
  ;

OR
  : 'or'
  ;

NOT
  : 'not'
  ;

PERIOD
  : '.'
  ;

PLUS
  : '+'
  ;

PRINT
  : 'print'
  ;

PROGRAM
  : 'program'
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

SYMMETRIC_DIFFERENCE
  : '><'
  ;

THEN
  : 'then'
  ;

TIMES 
  : '*'
  ;

TO
  : 'to'
  ;

TYPE
  : 'type'
  ;

UNTIL
  : 'until'
  ;

VAR
  : 'var'
  ;

WHILE
  : 'while'
  ;

/* ex: '\b', 'a', '\r', '\f' */
CHARLITERAL
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

/* ex: hello, jimmy_7, _unused */
ID
  : [a-zA-Z_][a-zA-Z0-9_]*
  ;

/* ex: 0b1010 */
DECIMALINTEGERLITERAL
  : '0'[bB][01]+
  ;

/* ex: 123 */
DECIMALINTEGERLITERAL
  : [1-9][0-9]*
  ;

/* ex: 0567 */
OCTALINTEGERLITERAL
  : '0'[0-7]+
  ;

/* ex: 0x123 */
HEXADECIMALINTEGERLITERAL
  : '0'[xX][a-fA-F0-9]+
  ;
  
STRINGLITERAL
  : UnterminatedStringLiteral '"'
  ;

UnterminatedStringLiteral
  : '"' (~["\\\r\n] | '\\' (. | EOF))*
  ;

COMMENT
  : '//' ~[\r\n]* -> skip                // Single-line comment
  | '/*' .*? '*/' -> skip                // Multi-line comment
  ;


WS
  : [ \r\n\t]+ -> skip
  ;