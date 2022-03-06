%%
[ ]+ printf("빈칸\n", yytext);
[\n]+ printf("줄바꿈\n", yytext);
.	;
%%
int main()
{
yylex();
return 0;
}
