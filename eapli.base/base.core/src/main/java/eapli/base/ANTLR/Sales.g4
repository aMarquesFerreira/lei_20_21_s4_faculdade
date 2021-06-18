grammar Sales;

program : state EOF;

state : productCode quantity clientType
      ;

productCode : letter DIGIT;

quantity:   ('0'? DIGIT_NO_ZERO) COMA ZERO
        |   ('1' DIGIT)
        |   ACCEPTDECIMALS COMA DIGIT
        ;

clientType : ('Nacional' | 'Europeu' | 'Resto do mundo' | 'nacional' | 'europeu' | 'resto do mundo');

letter : (UPPERCHAR | LOWERCHAR)+ ;

ACCEPTDECIMALS : '2'('0'|'1');
COMA : ',' ;
ZERO : '0';
PERCENT : '%';
DIGIT_NO_ZERO : [1-9];
DIGIT : [0-9]+;
DOT : '.';
LOWERCHAR : [a-z] ;
UPPERCHAR : [A-Z] ;
WS : [ \t\r\n]+ -> skip ;
