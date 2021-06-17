grammar DiscountApproval;

program : state EOF;

state : decision base confirmPercentage confirmValue deadline
      ;

decision : (LOWERCHAR | UPPERCHAR)+;

discountType :  ( 'percentage' | 'valor')
 ;

recurrence : (DIGIT)+;

confirmPercentage : (DIGIT PERCENT);

confirmValue : DIGIT;

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

PERCENT : '%';
DIGIT_NO_ZERO : [1-9];
DIGIT : [0-9]+;
DOT : '.';
LOWERCHAR : [a-z] ;
UPPERCHAR : [A-Z] ;
WS : [ \t\r\n]+ -> skip;
