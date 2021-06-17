grammar Date;

program : state EOF;

state : compare faultType
      ;

compare : date ' ' date # Comparison
        ;

date    : (day DOT month DOT year)
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

faultType : ( 'Ferias' | 'Nao Justificada' | 'ferias' | 'nao justificada' )
          ;

content : (UPPERCHAR | LOWERCHAR | DIGIT | SPECIALCHARACTERS | SPACE)+;


JUSTIFIED : ('justificada' | 'Justificada');
ZERO : '0';
ONE : '1';
TWO : '2';
THREE : '3';
DIGIT         :   ZERO | DIGIT_NO_ZERO;
DIGIT_NO_ZERO :   [1-9];
DOT     :   '.';
SPACE : ' ';
EQUALS  :   '=';
SPECIALCHARACTERS : ('_' | '-' | '.' | ',' | ';' | ':' | '<' | '>' | '!' | '?' | '[' | ']' | '\\' | '/');
LOWERCHAR : [a-z] ;
UPPERCHAR : [A-Z] ;
