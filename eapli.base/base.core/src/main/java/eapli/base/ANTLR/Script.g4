grammar Script;

program : state EOF;

state : type
      | exprMat
      | email
      ;

type : STRING EQUALS consult  #assignedConsult
     | STRING EQUALS exprMat  #assignedCalculations
     ;

consult : file ;



base : (UPPERCHAR | LOWERCHAR | SPACE)*;

SPACE : ' ';
PERCENT : '%';
DIGIT_NO_ZERO : [1-9];
DIGIT : [0-9]+;
DOT : '.';
LOWERCHAR : [a-z] ;
UPPERCHAR : [A-Z] ;
WS : [ \t\r\n]+ -> skip;
