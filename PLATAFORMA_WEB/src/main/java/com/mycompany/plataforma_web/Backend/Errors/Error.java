package com.mycompany.plataforma_web.Backend.Errors;

public class Error {
    
    private String error;
    private int linea;
    private int columna;

    public Error(String error, int linea,int columna){
        this.error = error;
        this.linea = linea;
        this.columna = columna;
    }

    public String getError() {
        return error;
    }

    public int getLinea() {
        return linea;
    }

    public int getColumna() {
        return columna;
    }
    
    @Override
    public String toString() {
        return "Error: " + error + ", linea: " + linea + ", columna: " + columna;
    }
    
}