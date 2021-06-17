grammar FormCheck;

program : state EOF;

state : formID  name  typeOfData names description
        | formID  name  typeOfData
        | formID  description
        | formID typeOfData
;

formID : 'F' DIGIT ;

names : name name;

name : letters ;

typeOfData :  ( 'boolean' | 'BOOLEAN' | 'Boolean'
                  | 'String' | 'string' | 'STRING'
                  | 'INTEGER' | 'INT' | 'Int' | 'int' | 'integer' | 'Integer')
 ;

description : (UPPERCHAR | LOWERCHAR)*;

letters : (LOWERCHAR | UPPERCHAR)+;
ignore : (SPACE);
number : DIGIT+;

ok: 'OK';
notok: 'NotOk';

DIGIT : [0-9]+;
LOWERCHAR : [a-z] ;
UPPERCHAR : [A-Z] ;
WS : [ \t\r\n]+ -> skip;
