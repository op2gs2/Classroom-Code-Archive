%{
#include "20175111-04-2.tab.h"
%}

%%

"+" { return ADD; }
"-" { return SUB; }
"*" { return MUL; }
"/" { return DIV; }
"%" { return REM; }
"^" { return IND; }
[0-9]+ { yylval = atoi(yytext);
	return NUMBER;}
\n { return EOL; } 
[ \t] { }
. { printf("Undefined %c\n", *yytext); }

%%
