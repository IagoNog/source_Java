package analizadorLexico;

%%
%{

public String lexame;

%}

%class AnalizadorLexico
%type void

INTEIRO = [0-9]
ESPACO = [| |\t|\r|\n]

%%
{ESPACO}    {/*Ignore*/}
"//".*      {/*Ignore*/}
"("         { return ABPARENTESE; }
")"         { return FCPARENTESE; }
"="         { return IGUAL; }
"+"         { return MAIS; }
"-"         { return MENOS; }
"*"         { return VEZES; }
"/"         { return DIVISAO; }
{INTEIRO}"."{INTEIRO} { lexame=yytext(); return NATURAL }
[-+]?{INTEIRO}+ { lexame=yytext(); return INT; }
. { return ERRO }
