parser grammar UppaalParser;
options { tokenVocab=UppaalLexer; }

//document    :   prolog? misc* element misc*;

model       :   prolog? misc* nta misc* ;

prolog      :   XMLDeclOpen (attribute S?)* SPECIAL_CLOSE ;


content     :   chardata?
                ((element | reference | CDATA | PI | COMMENT) chardata?)* ;

element     :   '<' Name attribute* '>' content '</' Name '>'
            |   '<' Name attribute* '/>'
            ;

reference   :   EntityRef | CharRef ;

attribute   :   Name EQUALS STRING ; // Our STRING is AttValue in spec

/** ``All text that is not markup constitutes the character data of
 *  the document.''
 */
chardata    :   TEXT | SEA_WS ;

misc        :   COMMENT | PI | SEA_WS ;

nta         :   '<' 'nta' '>' misc*
                declaration misc*
                (template misc*)+
                system misc*
                (queries misc*)?
                '</' 'nta' '>' ;

//declaration :   '<' 'declaration' '>' anything '</' 'declaration' '>' ;

declaration :   OPEN_DECLARATION GUARD_S* declContent GUARD_S* CLOSE_DECLARATION;

declContent:   (declarations GUARD_S*)* ;

declarations:   variableDecl    # VariableDeclaration
            |   typeDecl        # typeDeclaration
            |   function        # FunctionDeclaration
            |   chanPriority    # ChanDeclaration
            ;

expr        :   IDENTIFIER  # IdentifierExpr
            |   NAT         # NatExpr
            |   POINT       # DoubleExpr
            |   expr '[' expr ']'   # ArrayExpr
            |   expr '\''     # StopWatchExpr
            |   '(' expr ')'  # ParenthesisExpr
            |   expr '++'     # ExprIncrement
            |   '++' expr     # IncrementExpr
            |   expr '--'     # ExprDecrement
            |   '--' expr     # DecrementExpr
            |   expr
                    //assign is '=' in guard channel
                    assign=(ASSIGN | ':=' | '+=' | '-=' | '*=' | '/=' | '%=' | '|=' | '&amp;=' | '^=' | '&lt;&lt;=' | '&gt;&gt;=')
                        expr  # AssignExpr
            |   unary=('-' | '+' | '!' | 'not') expr  # UnaryExpr
            |   expr binary=( '&lt;' | '&lt;=' | '==' | '!=' | '&gt;=' | '&gt;' //LESS is '<' in guard channel. Greater is '>' in guard channel
                                   ) expr     # ComparisonExpr
            |   expr binary=( '+' | '-' | '*' | '/' | '%' | '&amp;'
                                    |  '|' | '^' | '&lt;&lt;' | '&gt;&gt;' | '&amp;&amp;' | '||'
                                    |  '&lt;?' | '&gt;?' | 'or' | 'and' | ',' | 'imply')
                                    expr      #BinaryExpr
            |   expr '?' expr ':' expr
                                    # IfExpr
            |   expr '.' IDENTIFIER   # DotExpr
            |   expr '(' arguments ')'# FuncExpr
            |   'forall' '(' IDENTIFIER ':' type ')' expr     # ForallExpr
            |   'exists' '(' IDENTIFIER ':' type ')' expr     # ExistsExpr
            |   'sum' '(' IDENTIFIER ':' type ')' expr        # SumExpr
            |   'true'  # TrueExpr
            |   'false' # FalseExpr
            ;


arguments   :   (expr  (',' expr)*)? ;

variableDecl:   (type GUARD_S* variableID (',' variableID)* ';') ;

type        :   (prefix GUARD_S* )? typeId ;

prefix      :   URGENT      # UrgentPrefix
            |   'broadcast' # BroadcastPrefix
            |   'meta'      # MetaPrefix
            |   'const'     # ConstPrefix
            ;

typeId      :   IDENTIFIER  # IdentifierType
            |   'int'       # IntType
            |   'double'    # DoubleType
            |   'clock'     # ClockType
            |   'chan'      # ChanType
            |   'bool'      # BoolType
            |   'int' '[' expr ',' expr ']'     # IntDomainType
            |   'scalar' '[' expr ']'           # ScalarType
            |   'struct' '{' (fieldDecl)+ '}'   # StructType
            ;

fieldDecl   :   type varFieldDecl (',' varFieldDecl)* ';' ;

varFieldDecl:   IDENTIFIER arrayDecl* ;

arrayDecl   :   '[' expr ']'    # ArrayDeclExpr
            |   '[' type ']'    # ArrayDeclType
            ;

variableID  :   IDENTIFIER (arrayDecl*) ((ASSIGN | ':=') initialiser )? ;

initialiser :   expr                                        # InitialiserExpr
            |   '{' initialiser (',' initialiser)* '}'      # InitialiserArray
            ;

//typeDecl    :   'typedef' type IDENTIFIER arrayDecl* (',' IDENTIFIER arrayDecl*)* ';' ;
typeDecl    :   'typedef' type varFieldDecl (',' varFieldDecl)* ';' ;

function    :   type IDENTIFIER '(' funcParameters ')' block
                ;

funcParameters: (funcParameter (',' funcParameter)*)? ;

//funcParameter:  type ('&amp;')? IDENTIFIER arrayDecl* ;
funcParameter:  type ('&amp;')? varFieldDecl ;

block       :   '{' declContent statement* '}' ;

statement   :   block           # StatementBlock
            |   ';'             # StatementSemicolon
            |   expr ';'        # StatementExpr
            |   forLoop         # StatementFor
            |   iteration       # StatementIteration
            |   whileLoop       # StatementWhile
            |   doWhile         # StatementDoWhile
            |   ifStatement     # StatementIf
            |   returnStatement # StatementReturn
            ;

forLoop     :   'for' '(' expr ';' expr ';' expr ')' statement ;

iteration   :   'for' '(' IDENTIFIER ':' type ')' statement ;

whileLoop  :   'while' '(' expr ')' statement ;

doWhile    :   'do' statement 'while' '(' expr ')' ';' ;

ifStatement:   'if' '(' expr ')' statement ('else' statement)? ;

returnStatement: 'return' (expr)? ';' ;

chanPriority:  'chan' 'priority' chanOrDef (chanSeparator chanOrDef)* ';' ;

chanOrDef   :   (chanExpr | 'default' ) ;

chanSeparator:  (',' | '&lt;') ;

chanExpr    :   IDENTIFIER              # ChanIdentifier
            |   chanExpr '[' expr ']'   # ChanArray
            ;
////////////////////////////////////////////////////////////////////////////////
anything    :   chardata?
                ((reference | CDATA | PI | COMMENT) chardata?)* ;

template    :   '<' 'template' '>' misc* tempContent  '</' 'template' '>' ;

tempContent :   ((name misc*)?)

                ((parameter misc*)?)

                (declaration misc*)?

                (((location misc*) | (branchpoint misc*))+)

                (initLoc misc*)

                (transition misc*)*
                ;

parameter   :   OPEN_PARAMETER funcParameters CLOSE_PARAMETER ;

coordinate  :   ('x'|'y') EQUALS STRING ('x'|'y') EQUALS STRING ;

initLoc    :   '<' 'init' S? 'ref' EQUALS STRING '/>' ;

branchpoint :   '<' 'branchpoint' 'id' EQUALS STRING
                    coordinate? '>' misc*
                    '</' 'branchpoint' '>';

location    :   '<' 'location' S*
                    'id' EQUALS STRING coordinate?  color? '>' misc* (name misc*)?
                    (labelLoc misc*)?
                    ('<' (URGENT_LOC | 'committed') '/>' misc*)?

                    '</' 'location' '>' ;
name        :   '<' 'name' S*
                    coordinate?
                    S* '>' anything '</' 'name' '>' ;

color       :   'color' EQUALS STRING;
labelLoc    :  OPEN_INV misc* expr CLOSE_LABEL ;

transition  :   '<' 'transition' color? '>'
                misc* (source misc*) (target misc*)
                (   labelTrans misc*
                 |  labelTransGuard  misc*
                 |  labelTransSyncInput misc*
                 |  labelTransSyncOutput misc*)*
                (nail misc*)*
                '</' 'transition' '>'

                ;

labelTransGuard: OPEN_GUARD guardExpr? CLOSE_LABEL ;
labelTransSyncInput : (OPEN_SYNC (expr '?')? CLOSE_LABEL)   ;
labelTransSyncOutput: (OPEN_SYNC (expr '!')? CLOSE_LABEL)

                     ;
labelTrans: (labelSelect misc* | labelUpdate misc* | labelComments misc* ) ;
labelUpdate :	OPEN_LBLTR misc* expr (',' expr)* CLOSE_LABEL ;

labelSelect :   OPEN_SELECT misc* selectList CLOSE_LABEL ;

selectList  :   IDENTIFIER ':' type
            |   selectList ',' IDENTIFIER ':' type
            ;

labelComments : OPEN_LBLCOM  anything CLOSE_LABEL ;
guardExpr
//locals[boolean isClockId = false, boolean isClockIdAux= false]
            :   IDENTIFIER  # IdentifierGuard
            |   NAT   # NatGuard
            |   POINT    # DoubleGuard
            |   guardExpr '[' guardExpr ']'   # ArrayGuard
            |   guardExpr '\''     # StopWatchGuard
            |   '(' guardExpr ')'  # ParenthesisGuard
            |   guardExpr '++'     # GuardIncrement
            |   '++' guardExpr     # IncrementGuard
            |   guardExpr '--'     # GuardDecrement
            |   '--' guardExpr     # DecrementGuard
            |   guardExpr
                    //assign is '=' in guard channel
                    assign=(ASSIGN | ':=' | '+=' | '-=' | '*=' | '/=' | '%=' | '|=' | '&amp;=' | '^=' | '&lt;&lt;=' | '&gt;&gt;=')
                        guardExpr  # AssignGuard
            |   unary=('-' | '+' | '!' | 'not') guardExpr  # UnaryGuard

            |   guardExpr binary=( '&lt;' | '&lt;=' | '==' | '!=' | '&gt;=' | '&gt;' ) guardExpr  # ComparisonGuard
            |   guardExpr binary=( '+' | '-' | '*' | '/' | '%' | '&amp;'
                                    |  '|' | '^' | '&lt;&lt;' | '&gt;&gt;' | '&amp;&amp;' | '||'
                                    |  '&lt;?' | '&gt;?' | 'or' | 'and' | ','  | 'imply')
                                    guardExpr   #BinaryGuard
            |   guardExpr '?' guardExpr ':' guardExpr
                                    # IfGuard
            |   guardExpr '.' IDENTIFIER   # DotGuard
            |   IDENTIFIER '(' guardArguments ')'# FuncGuard
            |   'forall' '(' IDENTIFIER ':' guardType ')' guardExpr     # ForallGuard
            |   'exists' '(' IDENTIFIER ':' guardType ')' guardExpr     # ExistsGuard
            |   'sum' '(' IDENTIFIER ':' guardType ')' guardExpr        # SumGuard
            |   'true'  # TrueGuard
            |   'false' # FalseGuard
            ;

guardArguments   :   (guardExpr  (',' guardExpr)*)? ;

guardType        :   ('meta' | 'const')? guardTypeId ;

guardTypeId
            :   'int'                                       # GuardTypeInt
            |   'int' '[' guardExpr ',' guardExpr ']'     # GuardTypeIntDomain
            |   'scalar' '[' guardExpr ']'                 # GuardTypeScalar
            ;

source      :   ('<' 'source' S? 'ref' EQUALS STRING '/>')
                ;

target      :   '<' 'target' S? 'ref' EQUALS STRING '/>'

                ;

nail        :   '<' 'nail' coordinate? '/>' ;

system      :   '<' 'system' '>' anything '</' 'system' '>' ;

queries     :   '<' 'queries' '>' misc* (query misc*)* '</' 'queries' '>' ;

query       :   '<' 'query' '>' misc* (formula misc*)? (comment misc*)? '</' 'query' '>' ;

formula     :   '<' 'formula' '>' anything '</' 'formula' '>' ;

comment     :   '<' 'comment' '>' anything '</' 'comment' '>' ;


//guardExpr  :   IDENTIFIER misc*;