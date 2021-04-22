// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: GCIC.jflex

/*PRIMER SECCION, CODIGO DE USUARIO*/
//package com.mycompany.plataforma_creacion.Backend.Lexer;

//import java_cup.runtime.*;
import java.util.ArrayList;
import java.util.List;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class lexer {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\1\u0200\1\u0300\1\u0400\1\u0500\1\u0600\1\u0700"+
    "\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00\1\u0e00\1\u0f00"+
    "\1\u1000\1\u0100\1\u1100\1\u1200\1\u1300\1\u0100\1\u1400\1\u1500"+
    "\1\u1600\1\u1700\1\u1800\1\u1900\1\u1a00\1\u1b00\1\u0100\1\u1c00"+
    "\1\u1d00\1\u1e00\2\u1f00\1\u2000\7\u1f00\1\u2100\1\u2200\1\u2300"+
    "\1\u1f00\1\u2400\1\u2500\2\u1f00\31\u0100\1\u2600\121\u0100\1\u2700"+
    "\4\u0100\1\u2800\1\u0100\1\u2900\1\u2a00\1\u2b00\1\u2c00\1\u2d00"+
    "\1\u2e00\53\u0100\1\u2f00\41\u1f00\1\u0100\1\u3000\1\u3100\1\u0100"+
    "\1\u3200\1\u3300\1\u3400\1\u3500\1\u3600\1\u3700\1\u3800\1\u3900"+
    "\1\u3a00\1\u0100\1\u3b00\1\u3c00\1\u3d00\1\u3e00\1\u3f00\1\u4000"+
    "\1\u4100\1\u1f00\1\u4200\1\u4300\1\u4400\1\u4500\1\u4600\1\u4700"+
    "\1\u4800\1\u4900\1\u4a00\1\u4b00\1\u4c00\1\u4d00\1\u1f00\1\u4e00"+
    "\1\u4f00\1\u5000\1\u1f00\3\u0100\1\u5100\1\u5200\1\u5300\12\u1f00"+
    "\4\u0100\1\u5400\17\u1f00\2\u0100\1\u5500\41\u1f00\2\u0100\1\u5600"+
    "\1\u5700\2\u1f00\1\u5800\1\u5900\27\u0100\1\u5a00\2\u0100\1\u5b00"+
    "\45\u1f00\1\u0100\1\u5c00\1\u5d00\11\u1f00\1\u5e00\24\u1f00\1\u5f00"+
    "\1\u6000\1\u1f00\1\u6100\1\u6200\1\u6300\1\u6400\2\u1f00\1\u6500"+
    "\5\u1f00\1\u6600\1\u6700\1\u6800\5\u1f00\1\u6900\1\u6a00\4\u1f00"+
    "\1\u6b00\2\u1f00\1\u6c00\16\u1f00\246\u0100\1\u6d00\20\u0100\1\u6e00"+
    "\1\u6f00\25\u0100\1\u7000\34\u0100\1\u7100\14\u1f00\2\u0100\1\u7200"+
    "\u0b06\u1f00\1\u2700\u02fe\u1f00";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\0\1\3\22\0\1\4\1\5"+
    "\1\6\11\7\1\0\1\10\1\7\1\11\12\12\1\0"+
    "\1\7\1\13\1\14\1\15\2\7\2\12\1\16\27\12"+
    "\1\17\1\0\1\20\1\7\1\21\1\0\2\22\1\23"+
    "\27\22\1\7\1\3\2\7\42\0\1\7\10\0\1\7"+
    "\12\0\1\7\4\0\1\7\4\0\30\7\1\0\37\7"+
    "\1\0\u01ca\7\4\0\14\7\16\0\5\7\7\0\1\7"+
    "\1\0\1\7\21\0\165\7\1\0\2\7\2\0\4\7"+
    "\1\0\1\7\6\0\1\7\1\0\3\7\1\0\1\7"+
    "\1\0\24\7\1\0\123\7\1\0\213\7\1\0\255\7"+
    "\1\0\46\7\2\0\1\7\6\0\51\7\10\0\55\7"+
    "\1\0\1\7\1\0\2\7\1\0\2\7\1\0\1\7"+
    "\10\0\33\7\4\0\4\7\35\0\13\7\5\0\112\7"+
    "\4\0\146\7\1\0\10\7\2\0\12\7\1\0\23\7"+
    "\2\0\1\7\20\0\73\7\2\0\145\7\16\0\66\7"+
    "\4\0\1\7\2\0\1\7\2\0\56\7\22\0\34\7"+
    "\4\0\13\7\65\0\25\7\1\0\10\7\25\0\17\7"+
    "\1\0\201\7\2\0\12\7\1\0\23\7\1\0\10\7"+
    "\2\0\2\7\2\0\26\7\1\0\7\7\1\0\1\7"+
    "\3\0\4\7\2\0\11\7\2\0\2\7\2\0\4\7"+
    "\10\0\1\7\4\0\2\7\1\0\5\7\2\0\14\7"+
    "\12\0\1\7\1\0\1\7\2\0\3\7\1\0\6\7"+
    "\4\0\2\7\2\0\26\7\1\0\7\7\1\0\2\7"+
    "\1\0\2\7\1\0\2\7\2\0\1\7\1\0\5\7"+
    "\4\0\2\7\2\0\3\7\3\0\1\7\7\0\4\7"+
    "\1\0\1\7\7\0\20\7\13\0\3\7\1\0\11\7"+
    "\1\0\3\7\1\0\26\7\1\0\7\7\1\0\2\7"+
    "\1\0\5\7\2\0\12\7\1\0\3\7\1\0\3\7"+
    "\2\0\1\7\17\0\4\7\2\0\12\7\11\0\7\7"+
    "\1\0\3\7\1\0\10\7\2\0\2\7\2\0\26\7"+
    "\1\0\7\7\1\0\2\7\1\0\5\7\2\0\11\7"+
    "\2\0\2\7\2\0\3\7\10\0\2\7\4\0\2\7"+
    "\1\0\5\7\2\0\12\7\1\0\1\7\20\0\2\7"+
    "\1\0\6\7\3\0\3\7\1\0\4\7\3\0\2\7"+
    "\1\0\1\7\1\0\2\7\3\0\2\7\3\0\3\7"+
    "\3\0\14\7\4\0\5\7\3\0\3\7\1\0\4\7"+
    "\2\0\1\7\6\0\1\7\16\0\12\7\20\0\15\7"+
    "\1\0\3\7\1\0\27\7\1\0\20\7\3\0\10\7"+
    "\1\0\3\7\1\0\4\7\7\0\2\7\1\0\3\7"+
    "\5\0\4\7\2\0\12\7\20\0\4\7\1\0\10\7"+
    "\1\0\3\7\1\0\27\7\1\0\12\7\1\0\5\7"+
    "\2\0\11\7\1\0\3\7\1\0\4\7\7\0\2\7"+
    "\7\0\1\7\1\0\4\7\2\0\12\7\1\0\2\7"+
    "\15\0\4\7\1\0\10\7\1\0\3\7\1\0\63\7"+
    "\1\0\3\7\1\0\5\7\5\0\4\7\7\0\5\7"+
    "\2\0\12\7\12\0\6\7\2\0\2\7\1\0\22\7"+
    "\3\0\30\7\1\0\11\7\1\0\1\7\2\0\7\7"+
    "\3\0\1\7\4\0\6\7\1\0\1\7\1\0\10\7"+
    "\6\0\12\7\2\0\2\7\15\0\72\7\5\0\17\7"+
    "\1\0\12\7\47\0\2\7\1\0\1\7\1\0\5\7"+
    "\1\0\30\7\1\0\1\7\1\0\27\7\2\0\5\7"+
    "\1\0\1\7\1\0\6\7\2\0\12\7\2\0\4\7"+
    "\40\0\1\7\27\0\2\7\6\0\12\7\13\0\1\7"+
    "\1\0\1\7\1\0\1\7\4\0\12\7\1\0\44\7"+
    "\4\0\24\7\1\0\22\7\1\0\44\7\11\0\1\7"+
    "\71\0\112\7\6\0\116\7\2\0\46\7\1\0\1\7"+
    "\5\0\1\7\2\0\53\7\1\0\115\7\1\0\4\7"+
    "\2\0\7\7\1\0\1\7\1\0\4\7\2\0\51\7"+
    "\1\0\4\7\2\0\41\7\1\0\4\7\2\0\7\7"+
    "\1\0\1\7\1\0\4\7\2\0\17\7\1\0\71\7"+
    "\1\0\4\7\2\0\103\7\2\0\3\7\40\0\20\7"+
    "\20\0\126\7\2\0\6\7\3\0\u016c\7\2\0\21\7"+
    "\1\0\32\7\5\0\113\7\3\0\13\7\7\0\15\7"+
    "\1\0\7\7\13\0\25\7\13\0\24\7\14\0\15\7"+
    "\1\0\3\7\1\0\2\7\14\0\124\7\3\0\1\7"+
    "\4\0\2\7\2\0\12\7\41\0\3\7\2\0\12\7"+
    "\6\0\131\7\7\0\53\7\5\0\106\7\12\0\37\7"+
    "\1\0\14\7\4\0\14\7\12\0\50\7\2\0\5\7"+
    "\13\0\54\7\4\0\32\7\6\0\12\7\46\0\34\7"+
    "\4\0\77\7\1\0\35\7\2\0\13\7\6\0\12\7"+
    "\15\0\1\7\10\0\17\7\101\0\114\7\4\0\12\7"+
    "\21\0\11\7\14\0\164\7\14\0\70\7\10\0\12\7"+
    "\3\0\61\7\2\0\11\7\7\0\53\7\2\0\3\7"+
    "\20\0\3\7\1\0\47\7\5\0\372\7\1\0\33\7"+
    "\2\0\6\7\2\0\46\7\2\0\6\7\2\0\10\7"+
    "\1\0\1\7\1\0\1\7\1\0\1\7\1\0\37\7"+
    "\2\0\65\7\1\0\7\7\1\0\1\7\3\0\3\7"+
    "\1\0\7\7\3\0\4\7\2\0\6\7\4\0\15\7"+
    "\5\0\3\7\1\0\7\7\102\0\2\7\23\0\1\7"+
    "\34\0\1\7\15\0\1\7\20\0\15\7\63\0\41\7"+
    "\21\0\1\7\4\0\1\7\2\0\12\7\1\0\1\7"+
    "\3\0\5\7\6\0\1\7\1\0\1\7\1\0\1\7"+
    "\1\0\4\7\1\0\13\7\2\0\4\7\5\0\5\7"+
    "\4\0\1\7\21\0\51\7\7\0\1\24\1\0\1\25"+
    "\u0223\0\64\7\26\0\57\7\1\0\57\7\1\0\205\7"+
    "\6\0\11\7\14\0\46\7\1\0\1\7\5\0\1\7"+
    "\2\0\70\7\7\0\1\7\17\0\30\7\11\0\7\7"+
    "\1\0\7\7\1\0\7\7\1\0\7\7\1\0\7\7"+
    "\1\0\7\7\1\0\7\7\1\0\7\7\1\0\40\7"+
    "\57\0\1\7\325\0\3\7\31\0\17\7\1\0\5\7"+
    "\2\0\5\7\4\0\126\7\2\0\2\7\2\0\3\7"+
    "\1\0\132\7\1\0\4\7\5\0\53\7\1\0\136\7"+
    "\21\0\33\7\65\0\306\7\112\0\360\7\20\0\215\7"+
    "\103\0\56\7\2\0\15\7\3\0\34\7\24\0\63\7"+
    "\1\0\12\7\1\0\163\7\45\0\11\7\2\0\147\7"+
    "\2\0\65\7\2\0\5\7\60\0\61\7\30\0\64\7"+
    "\14\0\106\7\12\0\12\7\6\0\30\7\3\0\1\7"+
    "\1\0\61\7\2\0\44\7\14\0\35\7\3\0\101\7"+
    "\16\0\13\7\6\0\37\7\1\0\67\7\11\0\16\7"+
    "\2\0\12\7\6\0\27\7\3\0\111\7\30\0\3\7"+
    "\2\0\20\7\2\0\5\7\12\0\6\7\2\0\6\7"+
    "\2\0\6\7\11\0\7\7\1\0\7\7\1\0\53\7"+
    "\1\0\14\7\10\0\173\7\1\0\2\7\2\0\12\7"+
    "\6\0\244\7\14\0\27\7\4\0\61\7\4\0\156\7"+
    "\2\0\152\7\46\0\7\7\14\0\5\7\5\0\14\7"+
    "\1\0\15\7\1\0\5\7\1\0\1\7\1\0\2\7"+
    "\1\0\2\7\1\0\154\7\41\0\153\7\22\0\100\7"+
    "\2\0\66\7\50\0\14\7\4\0\20\7\20\0\20\7"+
    "\3\0\2\7\30\0\3\7\40\0\5\7\1\0\207\7"+
    "\23\0\12\7\7\0\32\7\4\0\1\7\1\0\32\7"+
    "\13\0\131\7\3\0\6\7\2\0\6\7\2\0\6\7"+
    "\2\0\3\7\43\0\14\7\1\0\32\7\1\0\23\7"+
    "\1\0\2\7\1\0\17\7\2\0\16\7\42\0\173\7"+
    "\105\0\65\7\210\0\1\7\202\0\35\7\3\0\61\7"+
    "\17\0\1\7\37\0\40\7\15\0\36\7\5\0\53\7"+
    "\5\0\36\7\2\0\44\7\4\0\10\7\1\0\5\7"+
    "\52\0\236\7\2\0\12\7\6\0\44\7\4\0\44\7"+
    "\4\0\50\7\10\0\64\7\234\0\67\7\11\0\26\7"+
    "\12\0\10\7\230\0\6\7\2\0\1\7\1\0\54\7"+
    "\1\0\2\7\3\0\1\7\2\0\27\7\12\0\27\7"+
    "\11\0\37\7\101\0\23\7\1\0\2\7\12\0\26\7"+
    "\12\0\32\7\106\0\70\7\6\0\2\7\100\0\4\7"+
    "\1\0\2\7\5\0\10\7\1\0\3\7\1\0\35\7"+
    "\2\0\3\7\4\0\1\7\40\0\35\7\3\0\35\7"+
    "\43\0\10\7\1\0\36\7\31\0\66\7\12\0\26\7"+
    "\12\0\23\7\15\0\22\7\156\0\111\7\67\0\63\7"+
    "\15\0\63\7\15\0\50\7\10\0\12\7\306\0\35\7"+
    "\12\0\1\7\10\0\41\7\217\0\27\7\11\0\107\7"+
    "\37\0\12\7\17\0\74\7\25\0\31\7\7\0\12\7"+
    "\6\0\65\7\1\0\12\7\4\0\3\7\11\0\44\7"+
    "\2\0\1\7\11\0\105\7\4\0\4\7\3\0\13\7"+
    "\1\0\1\7\43\0\22\7\1\0\45\7\6\0\1\7"+
    "\101\0\7\7\1\0\1\7\1\0\4\7\1\0\17\7"+
    "\1\0\12\7\7\0\73\7\5\0\12\7\6\0\4\7"+
    "\1\0\10\7\2\0\2\7\2\0\26\7\1\0\7\7"+
    "\1\0\2\7\1\0\5\7\1\0\12\7\2\0\2\7"+
    "\2\0\3\7\2\0\1\7\6\0\1\7\5\0\7\7"+
    "\2\0\7\7\3\0\5\7\213\0\113\7\5\0\12\7"+
    "\4\0\2\7\40\0\106\7\1\0\1\7\10\0\12\7"+
    "\246\0\66\7\2\0\11\7\27\0\6\7\42\0\101\7"+
    "\3\0\1\7\13\0\12\7\46\0\71\7\7\0\12\7"+
    "\66\0\33\7\2\0\17\7\4\0\12\7\306\0\73\7"+
    "\145\0\112\7\25\0\1\7\240\0\10\7\2\0\56\7"+
    "\2\0\10\7\1\0\2\7\33\0\77\7\10\0\1\7"+
    "\10\0\112\7\3\0\1\7\42\0\71\7\7\0\11\7"+
    "\1\0\55\7\1\0\11\7\17\0\12\7\30\0\36\7"+
    "\2\0\26\7\1\0\16\7\111\0\7\7\1\0\2\7"+
    "\1\0\54\7\3\0\1\7\1\0\2\7\1\0\11\7"+
    "\10\0\12\7\6\0\6\7\1\0\2\7\1\0\45\7"+
    "\1\0\2\7\1\0\6\7\7\0\12\7\u0136\0\27\7"+
    "\11\0\232\7\146\0\157\7\21\0\304\7\274\0\57\7"+
    "\321\0\107\7\271\0\71\7\7\0\37\7\1\0\12\7"+
    "\146\0\36\7\2\0\5\7\13\0\67\7\11\0\4\7"+
    "\14\0\12\7\11\0\25\7\5\0\23\7\260\0\100\7"+
    "\200\0\113\7\4\0\71\7\7\0\21\7\100\0\2\7"+
    "\1\0\1\7\34\0\370\7\10\0\363\7\15\0\37\7"+
    "\61\0\3\7\21\0\4\7\10\0\u018c\7\4\0\153\7"+
    "\5\0\15\7\3\0\11\7\7\0\12\7\3\0\2\7"+
    "\306\0\5\7\3\0\6\7\10\0\10\7\2\0\7\7"+
    "\36\0\4\7\224\0\3\7\273\0\125\7\1\0\107\7"+
    "\1\0\2\7\2\0\1\7\2\0\2\7\2\0\4\7"+
    "\1\0\14\7\1\0\1\7\1\0\7\7\1\0\101\7"+
    "\1\0\4\7\2\0\10\7\1\0\7\7\1\0\34\7"+
    "\1\0\4\7\1\0\5\7\1\0\1\7\3\0\7\7"+
    "\1\0\u0154\7\2\0\31\7\1\0\31\7\1\0\37\7"+
    "\1\0\31\7\1\0\37\7\1\0\31\7\1\0\37\7"+
    "\1\0\31\7\1\0\37\7\1\0\31\7\1\0\10\7"+
    "\2\0\151\7\4\0\62\7\10\0\1\7\16\0\1\7"+
    "\26\0\5\7\1\0\17\7\120\0\7\7\1\0\21\7"+
    "\2\0\7\7\1\0\2\7\1\0\5\7\325\0\55\7"+
    "\3\0\16\7\2\0\12\7\4\0\1\7\u0171\0\72\7"+
    "\6\0\305\7\13\0\7\7\51\0\114\7\4\0\12\7"+
    "\246\0\4\7\1\0\33\7\1\0\2\7\1\0\1\7"+
    "\2\0\1\7\1\0\12\7\1\0\4\7\1\0\1\7"+
    "\1\0\1\7\6\0\1\7\4\0\1\7\1\0\1\7"+
    "\1\0\1\7\1\0\3\7\1\0\2\7\1\0\1\7"+
    "\2\0\1\7\1\0\1\7\1\0\1\7\1\0\1\7"+
    "\1\0\1\7\1\0\2\7\1\0\1\7\2\0\4\7"+
    "\1\0\7\7\1\0\4\7\1\0\4\7\1\0\1\7"+
    "\1\0\12\7\1\0\21\7\5\0\3\7\1\0\5\7"+
    "\1\0\21\7\164\0\32\7\6\0\32\7\6\0\32\7"+
    "\166\0\327\7\51\0\65\7\13\0\336\7\2\0\u0182\7"+
    "\16\0\u0131\7\37\0\36\7\342\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[29440];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\3\2\1\3\1\1\1\3\1\4\1\5"+
    "\1\3\1\6\1\7\2\10\1\1\1\11\1\0\1\12"+
    "\2\0\1\13\1\3\1\0\1\14\1\0\1\15\1\0"+
    "\1\11";

  private static int [] zzUnpackAction() {
    int [] result = new int[29];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\26\0\54\0\102\0\130\0\156\0\204\0\232"+
    "\0\260\0\26\0\306\0\26\0\26\0\334\0\362\0\u0108"+
    "\0\u011e\0\204\0\26\0\u0134\0\u014a\0\u0134\0\u0160\0\u0108"+
    "\0\26\0\u0176\0\u0160\0\u018c\0\u014a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[29];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\3\1\6\1\7\4\10"+
    "\1\11\2\12\1\13\1\14\1\15\1\10\1\16\1\17"+
    "\1\2\1\20\27\0\2\3\1\0\1\3\22\0\1\3"+
    "\1\4\1\5\1\3\23\0\2\5\26\0\1\10\1\21"+
    "\1\0\4\10\3\0\1\10\2\0\3\10\2\0\6\22"+
    "\1\23\17\22\4\0\2\10\1\0\4\10\3\0\1\10"+
    "\2\0\3\10\2\0\10\24\1\25\1\26\14\24\4\0"+
    "\2\10\1\0\4\10\3\0\1\10\2\0\1\27\2\10"+
    "\6\0\2\10\1\0\4\10\3\0\1\10\2\0\1\10"+
    "\2\16\6\0\2\10\1\0\4\10\3\0\1\10\2\0"+
    "\1\27\2\16\2\0\24\30\1\31\1\30\2\21\1\0"+
    "\23\21\10\24\1\25\15\24\10\25\1\32\15\25\4\0"+
    "\2\10\1\0\3\10\1\33\3\0\1\33\2\0\1\10"+
    "\2\33\2\0\10\25\1\34\25\25\1\34\4\25\1\35"+
    "\10\25";

  private static int [] zzUnpackTrans() {
    int [] result = new int[418];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\7\1\1\11\1\1\2\11\4\1\1\0"+
    "\1\11\2\0\2\1\1\0\1\11\1\0\1\1\1\0"+
    "\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[29];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    

    public void setErrorList(){
        
    }

    private void error(String lexeme) {
        System.out.printf("Error lexico \"%s\" linea %d,  columna %d. \n", lexeme, yyline + 1, yycolumn + 1);
        //errorsList.add(String.format("Error Lexico en el Texto: %s  linea %d, columna %d. Corrige e intenta de nuevo.", lexeme, yyline + 1, yycolumn + 1));
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { error(yytext());
            }
            // fall through
          case 14: break;
          case 2:
            { /*Do nothing*/
            }
            // fall through
          case 15: break;
          case 3:
            { System.out.println("TEXT: "+yytext());
            }
            // fall through
          case 16: break;
          case 4:
            { System.out.println("<: "+yytext());
            }
            // fall through
          case 17: break;
          case 5:
            { System.out.println(">: "+yytext());
            }
            // fall through
          case 18: break;
          case 6:
            { System.out.println("[: "+yytext());
            }
            // fall through
          case 19: break;
          case 7:
            { System.out.println("]: "+yytext());
            }
            // fall through
          case 20: break;
          case 8:
            { System.out.println("ATRIBUTE: "+yytext());
            }
            // fall through
          case 21: break;
          case 9:
            { //System.out.println("Encontre comentario");
            }
            // fall through
          case 22: break;
          case 10:
            { System.out.println("VAL ATRIBUTE: "+yytext());
            }
            // fall through
          case 23: break;
          case 11:
            { System.out.println("</: "+yytext());
            }
            // fall through
          case 24: break;
          case 12:
            { System.out.println("Code: "+yytext());
            }
            // fall through
          case 25: break;
          case 13:
            { System.out.println("TAG: "+yytext());
            }
            // fall through
          case 26: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String[] argv) {
    if (argv.length == 0) {
      System.out.println("Usage : java lexer [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          // Side-effect: is encodingName valid?
          java.nio.charset.Charset.forName(encodingName);
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        lexer scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new lexer(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
