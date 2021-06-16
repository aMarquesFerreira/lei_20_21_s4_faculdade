grammar Date;

state    :   compare EOF
        ;

compare : date ' ' date # Comparison;

date    :   (day DOT month)
        |   (day DOT month DOT year)
        ;

year    :   (('1'|'2') DIGIT DIGIT DIGIT)
        |   (DIGIT DIGIT)
        ;

month   :   ('0'? DIGIT_NO_ZERO)
        |   ('1' ('0'|'1'|'2'))
        ;

day     :   ('0'? DIGIT_NO_ZERO)
        |   (('1'|'2') DIGIT)
        |   ('3' ('0'|'1'))
        ;


DIGIT         :   [0-9];
DIGIT_NO_ZERO :   [1-9];
DOT     :   '.';
WS      :  [ \t\r\n]+ -> skip;
SPACE : ' ';