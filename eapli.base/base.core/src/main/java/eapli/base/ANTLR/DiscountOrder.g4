grammar DiscountOrder;

program : state EOF;

state : clientCode name discountType 'Unica' discountPercentage discountValor invoiceID base
      | clientCode name discountType 'Ate data limite' discountPercentage discountValor deadline base
      ;

clientCode : DIGIT ;

name : (LOWERCHAR | UPPERCHAR)+;

discountType :  ( 'percentage' | 'valor')
 ;

recurrence : ('Unica' | 'Ate data limite');

discountPercentage : (DIGIT PERCENT);

discountValor : DIGIT;

invoiceID : DIGIT;

deadline    : (day DOT month DOT year)
            ;

year    :   (('1'|'2') DIGIT DIGIT DIGIT)
        ;

month   :   ('0'? DIGIT_NO_ZERO)
        |   ('1' ('0'|'1'|'2'))
        ;

day     :   ('0'? DIGIT_NO_ZERO)
        |   (('1'|'2') DIGIT)
        |   ('3' ('0'|'1'))
        ;

base : (UPPERCHAR | LOWERCHAR)+;

digits : DIGIT DIGIT;

PERCENT : '%';
DIGIT_NO_ZERO : [1-9];
DIGIT : [0-9]+;
DOT : '.';
LOWERCHAR : [a-z] ;
UPPERCHAR : [A-Z] ;
WS : [ \t\r\n]+ -> skip;
