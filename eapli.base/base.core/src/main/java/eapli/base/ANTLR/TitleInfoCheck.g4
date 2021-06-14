grammar TitleInfoCheck;

state : title;

title : (UPPERCHAR | LOWERCHAR | DIGIT | SPECIALCHARACTERS | SPACE)+;

SPECIALCHARACTERS : ('_' | '-' | '.' | ',' | ';' | ':' | '<' | '>' | '!' | '?' | '[' | ']' | '\\' | '/');

DIGIT : [0-9]+;
LOWERCHAR : [a-z] ;
UPPERCHAR : [A-Z] ;
SPACE : [ ];
