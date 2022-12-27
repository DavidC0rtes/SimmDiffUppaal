lexer grammar DiffLexer;

AT      :   '@@';
COMMENT :   '<!--' .*? '-->' ;
Newlines    : [\r\n]+;
PLUS    :   '+++' ~[@]+ Newlines -> skip;
NEG     :   '---' ~[@]+ Newlines -> skip;
DIGIT   :   [0-9]+;
SEA_WS  :   (' '|'\t'|'\r'? '\n')+ ;
TEXT        :   ~[@]+ ;        // match any 16 bit char other than  and