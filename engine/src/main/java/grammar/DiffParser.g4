// Gramar to work with diff output
parser grammar DiffParser;
options { tokenVocab=DiffLexer; }

document:   (line+ anything)+ ;

line        :   AT TEXT AT ;

chardata    : TEXT | SEA_WS ;
anything    :   chardata?
                ((COMMENT) chardata?)* ;