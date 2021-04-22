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
%caseless
%line
%column
%public
%{
    
%}
/*EXPRECIONES REGULARES*/
LineTerminator = [\r|\n|\r\n]+
WhiteSpace = [ \t\n]+
COMENT_BLOQUE = (<!--)([^-]*([^-]*[-]+[^-]*)*(-->))
COMENT_LINEA = ([!][!])([^\n]*)
COMENTARIO = ({COMENT_BLOQUE}|{COMENT_LINEA})
SCRIPT = ([<](\s)*(C_SCRIPTING)(\s)*[>])([^<\/]*([^<\/]*[<\/]+[<\/])*)([<][/](\s)*(C_SCRIPTING)(\s)*[>])
TKN_ETIQUETA = ([Cc][_]([a-zA-Z0-9])+) 
TKN_ATRIBUTO = ([a-zA-Z]+([-][a-zA-Z]+)?)
TKN_VAL_ATRIBUTO = ([\"][^\"]*[\"])
TKN_DATOS = [^\<\>\=\/\&\t]+


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
    {COMENTARIO}
        {
            System.out.println("Encontre comentario");
        }
    {SCRIPT}
        {
            System.out.println("Encontre un script");
        }
    {TKN_ETIQUETA}
        {
            String tag = yytext().toUpperCase();
            System.out.println("Etiqueta: "+tag);
            switch (tag) {
                case "C_GCIC":
                break;
                case "C_HEAD":
                break;
                case "C_TITLE":
                break;
                case "C_LINK":
                break;
                case "C_BODY":
                break;
                case "C_SPAM":
                break;
                case "C_INPUT":
                break;
                case "C_TEXTAREA":
                break;
                case "C_OPTION":
                break;
                case "C_DIV":
                break;
                case "C_IMG":
                break;
                case "C_BR":
                break;
                case "C_BUTTON":
                break;
                case "C_SELECT":
                break;
                case "C_H1":
                break;
                case "C_P":
                break;
                default:
                break;
            }
        }
    "<"
        {
            System.out.println("--~"+">");
        }
    ">"
        {
            System.out.println("--~"+"<");
        }
    "</"
        {
            System.out.println("--~"+"</");
        }
    "["
        {
            System.out.println("--~"+"[");
        }
    "]"
        {
            System.out.println("--~"+"]");
        }
    "="
        {
            System.out.println("--~"+"=");
        }
    {TKN_ATRIBUTO}
        {
            System.out.println("Atributo: "+yytext());
        }
    {TKN_VAL_ATRIBUTO}
        {
            System.out.println("Valor atributo: "+yytext());
            
        }
    {TKN_DATOS}
        {
            System.out.println("Datos: "+yytext());
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
[^]     {
            error(yytext());
        }