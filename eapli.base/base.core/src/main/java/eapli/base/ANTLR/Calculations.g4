grammar Calculations;
prog: stat* EOF;
stat: expr NEWLINE # printExpr
| ID '=' expr NEWLINE # assign
| NEWLINE # blank
;
expr: expr op=('*'|'/') expr # MulDiv
| expr op = ('+'|'-') expr# AddSub
| INT # int
| ID # id
| '(' expr ')' # parens
;
NEWLINE : [\r\n|<EOF>]+;
INT:[0-9]+;
ID:[a-zA-Z]+;
MUL : '*' ; // assigns token name to '*' used above in grammar
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
ATR : '=' ;
LPR : '(' ;
RPR : ')' ;
PALAVRA: ID+;