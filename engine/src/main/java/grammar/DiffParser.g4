// Gramar to work with diff output
parser grammar DiffParser;
options { tokenVocab=DiffLexer; }

document    :   (annotation+ anything)+ ;

annotation  :   AT WS? MINUS(lineRange) WS? SUM(lineRange) WS? AT_CLOSE ;
lineRange   :   DIGIT(','DIGIT)?    ;

chardata    : TEXT | SEA_WS ;
anything    :   chardata?
                ((COMMENT) chardata?)* ;