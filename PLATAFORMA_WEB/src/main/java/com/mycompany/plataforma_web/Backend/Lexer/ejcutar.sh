#! /bin/bash 
java -jar jflex-full-1.8.2.jar GCIC.jflex
javac lexer.java
java lexer ejemplo.gcic
