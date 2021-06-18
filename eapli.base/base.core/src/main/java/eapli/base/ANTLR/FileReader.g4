grammar FileReader;

program : state EOF;

state : file typeOfFile  #read
      ;

file : (LOWERCHAR | UPPERCHAR | DIGIT)+;



typeOfFile : '.txt' ;

DIGIT : [0-9]+;
DOT : '.';
LOWERCHAR : [a-z] ;
UPPERCHAR : [A-Z] ;
WS : [ \t\r\n]+ -> skip ;
