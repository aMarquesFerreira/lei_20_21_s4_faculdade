grammar Verifications;

program : state EOF;

state : formID WS name WS typeOfData WS names WS description
;

formID : 'F' DIGIT ;

names : name name;

name : letters ;

typeOfData : 'boolean' | 'BOOLEAN' | 'Boolean'
            | 'String' | 'string' | 'STRING'
            | 'INTEGER' | 'INT' | 'int' | 'Int' | 'integer' | 'Integer'  ;

description : (UPPERCHAR | LOWERCHAR)*;

letters : (LOWERCHAR | UPPERCHAR)+;

number : DIGIT+;
DIGIT : [0-9]+;
LOWERCHAR : [a-z] ;
UPPERCHAR : [A-Z] ;
WS : [ \t\r\n]+ -> skip ;
