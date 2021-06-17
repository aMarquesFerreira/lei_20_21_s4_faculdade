grammar EmailInfoCheck;

state : email;

email : username atSign typeOfEmail domain;

typeOfEmail : 'hotmail' | 'gmail' | 'isep.ipp';

domain : ('.pt' | '.com');

username : (LOWERCHAR | UPPERCHAR | DIGIT | SPECIALCHARACTERS)+;

atSign : '@' ;

SPECIALCHARACTERS : ('_' | '-');

DIGIT : [0-9]+;
LOWERCHAR : [a-z] ;
UPPERCHAR : [A-Z] ;
WS : [ \t\r\n]+ -> skip;
