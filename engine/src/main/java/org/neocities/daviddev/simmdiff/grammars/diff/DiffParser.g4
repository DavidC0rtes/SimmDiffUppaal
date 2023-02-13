// Gramar to work with diff output
parser grammar DiffParser;
options { tokenVocab=DiffLexer; }

document    :   annotation SEA_WS* (PREFIX? label S?)+ ;

annotation  :   AT WS? MINUS(lineRange) WS? SUM(lineRange) WS? AT_CLOSE ;
lineRange   :   DIGIT(','DIGIT)?    ;

chardata    : TEXT | SEA_WS ;
anything    :   chardata?
                ((COMMENT) chardata?)*
            ;

label       :   '<' LOC 'id' EQUALS STRING coordinate?  color? '>';

color       :   'color' EQUALS STRING;
coordinate  :   ('x'|'y') EQUALS STRING ('x'|'y') EQUALS STRING ;
lineChange  :   ~QUOTE PREFIX ANY  ;
line        :   ~(PREFIX) ANY   ;