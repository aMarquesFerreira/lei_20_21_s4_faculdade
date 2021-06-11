grammar Verifications;

program : state EOF;

state : formID  name  typeOfData  names  description
        | formID  name  typeOfData
        | formID  name  names
        | formID  description
        | formID typeOfData
;

formID : 'F' DIGIT ;

names : name name;

name : letters ;

typeOfData : IF ( 'boolean' | 'BOOLEAN' | 'Boolean'
                  | 'String' | 'string' | 'STRING'
                  | 'INTEGER' | 'INT' | 'Int' | 'int' | 'integer' | 'Integer')ok
                   (ELSE) notok
 ;




description : (UPPERCHAR | LOWERCHAR)*;

letters : (LOWERCHAR | UPPERCHAR)+;
ignore : ( | SPACE);
number : DIGIT+;

ok: 'OK';
notok: 'NotOk';

DIGIT : [0-9]+;
LOWERCHAR : [a-z] ;
UPPERCHAR : [A-Z] ;
WS : [ \t\r\n]+ -> skip;
