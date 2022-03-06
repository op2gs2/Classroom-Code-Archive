%{
#include "20175111-04-1.tab.h"
%}

%%

"+" { return ADD; }
"-" { return SUB; }
"*" { return MUL; }
"/" { return DIV; }
"%" { return REM; }
[0-9]+ { yylval = atoi(yytext);
	return NUMBER;}
\n { return EOL; } 
[ \t] { }
. { printf("Undefined %c\n", *yytext); }

%%
