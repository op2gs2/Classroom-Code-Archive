%{
int nword;
%}

char [a-zA-Z0-9]
div [^ \t\n]

%%
{char}({char}|{div})+ {++nword;}

%%

int main()
{
yylex();
printf("%d\n",nword);
return 0;
}
