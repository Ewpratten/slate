grammar Slate;

/*
 * Lexer Rules
 */

 fragment A : ('A'|'a');
 fragment B : ('B'|'b');
 fragment C : ('C'|'c');
 fragment D : ('D'|'d');
 fragment E : ('E'|'e');
 fragment F : ('F'|'f');
 fragment G : ('G'|'g');
 fragment H : ('H'|'h');
 fragment I : ('I'|'i');
 fragment J : ('J'|'j');
 fragment K : ('K'|'k');
 fragment L : ('L'|'l');
 fragment M : ('M'|'m');
 fragment N : ('N'|'n');
 fragment O : ('O'|'o');
 fragment P : ('P'|'p');
 fragment Q : ('Q'|'q');
 fragment R : ('R'|'r');
 fragment S : ('S'|'s');
 fragment T : ('T'|'t');
 fragment U : ('U'|'u');
 fragment V : ('V'|'v');
 fragment W : ('W'|'w');
 fragment X : ('X'|'x');
 fragment Y : ('Y'|'y');
 fragment Z : ('Z'|'z');

 fragment DIGIT : [0-9] ;
 NUMBER         : DIGIT+ ([.,] DIGIT+)? ;

 fragment LOWERCASE  : [a-z] ;
 fragment UPPERCASE  : [A-Z] ;

 fragment SYMBOL: '!' | '#'..'/' | ':'..'@' | '['..'`' | '{'..'}';
 fragment COMMANDINDICATOR : '~';

 WORD                : (LOWERCASE | UPPERCASE | DIGIT | SYMBOL)+ ;

 WHITESPACE          : (' ' | '\t') ;

 NEWLINE             : ('\r'? '\n' | '\r')+ ;

 SAY                 : (COMMANDINDICATOR S A Y) ;

 SHOUT               : (COMMANDINDICATOR S H O U T) ;

 PEEK                : (COMMANDINDICATOR P E E K);

 SEARCH              : (COMMANDINDICATOR S E A R C H);

 OPEN                : (COMMANDINDICATOR O P E N);

 CLOSE               : (COMMANDINDICATOR C L O S E);

 CHECKDOORS          : (COMMANDINDICATOR (C H E C K WHITESPACE? D O O R S));

 MOVE                : (COMMANDINDICATOR (M O V E (WHITESPACE? T O)?|
                                          G O (WHITESPACE? T O)?));

 PICKUP              : (COMMANDINDICATOR (P I C K WHITESPACE? U P|
                                          T A K E)) ;

 LEAVE              : (COMMANDINDICATOR (L E A V E|
                                           P U T|
                                           D R O P)) ;

 HELP                : (COMMANDINDICATOR H E L P) ;

 IDENTIFIER          :  (WORD|NUMBER) ;

 TEXT                : (IDENTIFIER (WHITESPACE|EOF))+;

 EXIT                : (COMMANDINDICATOR E X I T);

/*
 * Parser Rules
 */

 saycomm           : (SAY WHITESPACE+? TEXT) ;

 shoutcomm         : (SHOUT WHITESPACE+? TEXT) ;

 pickupcomm        : (PICKUP WHITESPACE+? TEXT) ;

 leavecomm         : (LEAVE WHITESPACE+? TEXT) ;

 checkdoorscomm    : (CHECKDOORS);

 peekcomm          : (PEEK WHITESPACE+? TEXT);

 searchcomm        : (SEARCH);

 movecomm          : (MOVE WHITESPACE+? TEXT);

 helpcomm          : (HELP) ;

 exitcomm          : (EXIT) ;

 opencomm          : (OPEN WHITESPACE+?  TEXT) ;

 closecomm         : (CLOSE) ;