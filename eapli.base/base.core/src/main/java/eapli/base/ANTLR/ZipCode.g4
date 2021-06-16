grammar ZipCode;

state : zip;

zip : DIGIT DIGIT DIGIT DIGIT SPECIALCHARACTER DIGIT DIGIT DIGIT EOF;

SPECIALCHARACTER: '-';
DIGIT : [0-9];
WS : [ \t\r\n]+ -> skip;
