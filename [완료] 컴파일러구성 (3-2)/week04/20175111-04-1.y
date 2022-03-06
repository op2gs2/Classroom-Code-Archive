%{
#include <stdio.h>
%}
%token NUMBER
%token ADD SUB MUL DIV REM
%token EOL
%%
calclist:
	| calclist exp EOL { printf("= %d\n", $2); }
	;
exp: factor
   | exp ADD factor { $$ = $1 + $3; }
   | exp SUB factor { $$ = $1 - $3; }
   ;
factor: term
      | factor MUL term { $$ = $1 * $3; }
      | factor DIV term { $$ = $1 / $3; }
      | factor REM term { $$ = $1 % $3; }
      ;
term: NUMBER
;
%%
int main(int argc, char **argv)
{
yyparse();
return 0;
}
yyerror(char *s)
{
fprintf(stderr, "error: %s\n",s);
}
