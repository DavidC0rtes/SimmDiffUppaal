lexer grammar DiffLexer;

AT      :   '@@' -> pushMode(ANNOTATION);
COMMENT :   '<!--' .*? '-->' ;
Newlines    : [\r\n]+;
PLUS    :   '+++' ~[@]+ Newlines -> skip;
NEG     :   '---' ~[@]+ Newlines -> skip;
SEA_WS  :   (' '|'\t'|'\r'? '\n')+ ;
TEXT        :   ~[@]+ ;        // match any 16 bit char other than  and

// Everything inside of @@ @@
mode ANNOTATION ;
AT_CLOSE    :   '@@' -> popMode;
COMMA       :   ',' ;
MINUS       :   '-' ;
SUM         :   '+' ;
DIGIT       :   [0-9]+;
