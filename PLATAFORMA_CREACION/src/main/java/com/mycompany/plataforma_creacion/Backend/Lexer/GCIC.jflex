/*PRIMER SECCION, CODIGO DE USUARIO*/


import java_cup.runtime.*;
import java.util.ArrayList;
import java.util.List;

%%

/*segunda seccion, configuracion*/
%class lexer
%cup
/*%standalone*/
%unicode
%line
%column
%public
%{
    
%}
/*EXPRECIONES REGULARES*/
LineTerminator = [\r|\n|\r\n]+
WhiteSpace = [ \t\n]+

%{

    public void setErrorList(){
        
    }

    private void error(String lexeme) {
        System.out.printf("Error lexico \"%s\" linea %d,  columna %d. \n", lexeme, yyline + 1, yycolumn + 1);
        errorsList.add(String.format("Error Lexico en el Texto: %s  linea %d, columna %d. Corrige e intenta de nuevo.", lexeme, yyline + 1, yycolumn + 1));
    }
%}

%%

/*LEXIX RULES*/
<YYINITIAL>{
    
    {LineTerminator}
        {
            /*Do nothing*/
        }
    {WhiteSpace}
        {
            /*Do nothing*/
        }
}
[^]     {
            error(yytext());
        }