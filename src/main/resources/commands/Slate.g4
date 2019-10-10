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
 fragment COMMANDINDICATOR : '!';

 WORD                : (LOWERCASE | UPPERCASE | '_')+ ;

 WHITESPACE          : (' ' | '\t') ;

 NEWLINE             : ('\r'? '\n' | '\r')+ ;

 SAY                 : (COMMANDINDICATOR S A Y) ;

 SHOUT               : (COMMANDINDICATOR S H O U T) ;

 PICKUP              : (COMMANDINDICATOR P I C K WHITESPACE U P|
                        COMMANDINDICATOR P I C K U P|
                        COMMANDINDICATOR T A K E) ;

 HELP                : (COMMANDINDICATOR H E L P) ;

 IDENTIFIER          :  (WORD|NUMBER) ;

 TEXT                : (IDENTIFIER (WHITESPACE|EOF))+;

 EXIT                : (COMMANDINDICATOR E X I T);

/*
 * Parser Rules
 */

 saycomm           : (SAY WHITESPACE? TEXT) ;
 shoutcomm         : (SHOUT WHITESPACE? TEXT) ;
 pickupcomm        : (PICKUP WHITESPACE? TEXT (WHITESPACE? )) ;
 helpcomm          : (HELP) ;
 exitcomm          : (EXIT) ;