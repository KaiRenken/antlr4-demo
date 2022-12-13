grammar Array;
expr : '{' value (',' value)* '}' ;
value : INT | expr ;
INT : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;