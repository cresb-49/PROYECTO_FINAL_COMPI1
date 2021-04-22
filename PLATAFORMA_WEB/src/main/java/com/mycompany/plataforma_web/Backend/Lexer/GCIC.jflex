/*PRIMER SECCION, CODIGO DE USUARIO*/
//package com.mycompany.plataforma_creacion.Backend.Lexer;

//import java_cup.runtime.*;
import java.util.ArrayList;
import java.util.List;

%%

/*segunda seccion, configuracion*/
%class lexer
/*%cup*/
%standalone
%unicode
/*%caseless*/
%line
%column
%public
%{
    
%}
/*EXPRECIONES REGULARES*/
LineTerminator = [\r|\n|\r\n]+
WhiteSpace = [ \t\n]+
COMENT_BLOQUE = (<!--)([^-]*([^-]*[-]+[^-]*)*(-->))
COMENT_LINEA = [!][!][^\n]*
CODE = →~←
ATRIBUTE = [a-z]+
ATRIBUTE_VAL = ([\"][^\"]*[\"])
TKN_NAME_TAG = ([Cc][_]([a-zA-Z0-9])+) 
simbolos = [.!~@#$%\^&*\(\)\{\}';?\¿¡\-+\/]
TEXTO = ([\w]|{simbolos})+([ ]|([\w]|{simbolos}))*

%{

    public void setErrorList(){
        
    }

    private void error(String lexeme) {
        System.out.printf("Error lexico \"%s\" linea %d,  columna %d. \n", lexeme, yyline + 1, yycolumn + 1);
        //errorsList.add(String.format("Error Lexico en el Texto: %s  linea %d, columna %d. Corrige e intenta de nuevo.", lexeme, yyline + 1, yycolumn + 1));
    }
%}

%%

/*LEXIX RULES*/

<YYINITIAL>{
    {COMENT_BLOQUE}
        {
            //System.out.println("Encontre comentario");
        }
    {COMENT_LINEA}
        {
            //System.out.println("Encontre comentario");
        }
    "["
        {
            System.out.println("[: "+yytext());
        }
    "]"
        {
            System.out.println("]: "+yytext());
        }
    "<"
        {
            System.out.println("<: "+yytext());
        }
    ">"
        {
            System.out.println(">: "+yytext());
        }
    "="
        {
            System.out.println(">: "+yytext());
        }
    {ATRIBUTE_VAL}
        {
            System.out.println("VAL ATRIBUTE: "+yytext());
        }
    "</"
        {
            System.out.println("</: "+yytext());
        }
    {CODE}
        {
            System.out.println("Code: "+yytext());
        }
    {TKN_NAME_TAG}
        {
            System.out.println("TAG: "+yytext());
        }
    {ATRIBUTE}
        {
            System.out.println("ATRIBUTE: "+yytext());
        }
    {TEXTO}
        {
            System.out.println("TEXT: "+yytext());
        }
    {LineTerminator}
        {
            /*Do nothing*/
        }
    {WhiteSpace}
        {
            /*Do nothing*/
        }
}

[^] 
    {
        error(yytext());
    }