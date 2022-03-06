digit [0-9]
%%
({digit})* {printf("숫자확인\n",yytext);}
%%
int main()
{
yylex();
return 0;
}
