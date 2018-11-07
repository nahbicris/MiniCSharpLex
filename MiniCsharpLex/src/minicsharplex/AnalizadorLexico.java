/* The following code was generated by JFlex 1.6.1 */

package minicsharplex;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.*;
import java.io.Reader;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>/home/cristobal/Documentos/ProyectosLenguajes/MiniCSharpLex/MiniCsharpLex/src/minicsharplex/Lexer.flex</tt>
 */
public class AnalizadorLexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
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
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\63\1\26\1\63\1\63\1\26\22\0\1\63\1\71\1\25"+
    "\2\0\1\65\1\72\1\0\1\77\1\100\1\32\1\64\1\74\1\27"+
    "\1\30\1\31\1\1\11\4\1\0\1\73\1\66\1\67\1\70\2\0"+
    "\1\22\1\60\2\3\1\20\1\21\1\57\1\61\1\55\2\61\1\23"+
    "\1\56\1\52\1\61\1\54\1\61\1\16\1\24\1\15\1\17\2\61"+
    "\1\2\2\61\1\75\1\0\1\76\1\0\1\62\1\0\1\12\1\41"+
    "\1\43\1\37\1\10\1\11\1\42\1\44\1\36\1\61\1\51\1\13"+
    "\1\46\1\40\1\35\1\47\1\61\1\6\1\14\1\5\1\7\1\34"+
    "\1\50\1\45\1\53\1\61\1\101\1\33\1\102\7\0\1\63\32\0"+
    "\1\63\u15df\0\1\63\u097f\0\13\63\35\0\1\63\1\63\5\0\1\63"+
    "\57\0\1\63\u0fa0\0\1\63\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\ud00f\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\2\11\3\1\1\1\4"+
    "\1\5\1\6\1\7\1\10\1\1\13\3\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\1\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\0\1\27\14\3"+
    "\2\0\1\30\1\0\1\31\1\3\1\32\14\3\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\0\6\3"+
    "\1\42\5\3\1\43\1\30\1\44\1\0\1\3\1\45"+
    "\7\3\1\46\3\3\1\27\1\0\1\47\1\50\1\3"+
    "\1\51\4\3\1\0\1\52\3\3\1\53\1\3\1\54"+
    "\14\3\1\0\3\3\1\55\1\56\1\57\1\3\1\60"+
    "\2\3\1\61\1\3\1\62\5\3\1\63\1\3\1\64"+
    "\1\3\1\65\2\3\1\66\3\3\1\67\1\70\3\3"+
    "\1\71\1\3\1\72\2\3\1\73\1\74";

  private static int [] zzUnpackAction() {
    int [] result = new int[189];
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
    "\0\0\0\103\0\206\0\311\0\u010c\0\u014f\0\u0192\0\u01d5"+
    "\0\u0218\0\u025b\0\u029e\0\u02e1\0\u0324\0\u0367\0\u03aa\0\u03ed"+
    "\0\u0430\0\103\0\u0473\0\103\0\u04b6\0\u04f9\0\u053c\0\u057f"+
    "\0\u05c2\0\u0605\0\u0648\0\u068b\0\u06ce\0\u0711\0\u0754\0\u0797"+
    "\0\u0430\0\103\0\u07da\0\u081d\0\u0860\0\u08a3\0\u08e6\0\103"+
    "\0\103\0\u0929\0\103\0\103\0\103\0\103\0\103\0\u096c"+
    "\0\u09af\0\u09f2\0\u0a35\0\u0a78\0\u0abb\0\u0afe\0\u0b41\0\u0b84"+
    "\0\u0bc7\0\u0c0a\0\u0c4d\0\u0c90\0\u0cd3\0\u0d16\0\u0d59\0\u0d9c"+
    "\0\u0ddf\0\103\0\u0e22\0\311\0\u0e65\0\u0ea8\0\u0eeb\0\u0f2e"+
    "\0\u0f71\0\u0fb4\0\u0ff7\0\u103a\0\u107d\0\u10c0\0\u1103\0\u1146"+
    "\0\103\0\103\0\103\0\103\0\103\0\103\0\u096c\0\u1189"+
    "\0\u11cc\0\u120f\0\u1252\0\u1295\0\u12d8\0\u131b\0\311\0\u135e"+
    "\0\u13a1\0\u13e4\0\u1427\0\u146a\0\u0d16\0\103\0\u14ad\0\u14f0"+
    "\0\u1533\0\u1576\0\u15b9\0\u15fc\0\u163f\0\u1682\0\u16c5\0\u1708"+
    "\0\u174b\0\u178e\0\u17d1\0\u1814\0\u1857\0\u189a\0\u189a\0\311"+
    "\0\311\0\u18dd\0\311\0\u1920\0\u1963\0\u19a6\0\u19e9\0\u1a2c"+
    "\0\311\0\u1a6f\0\u1ab2\0\u1af5\0\311\0\u1b38\0\311\0\u1b7b"+
    "\0\u1bbe\0\u1c01\0\u1c44\0\u1c87\0\u1cca\0\u1d0d\0\u1d50\0\u1d93"+
    "\0\u1dd6\0\u1e19\0\u1e5c\0\u1e9f\0\u1ee2\0\u1f25\0\u1f68\0\311"+
    "\0\311\0\311\0\u1fab\0\311\0\u1fee\0\u2031\0\311\0\u2074"+
    "\0\311\0\u20b7\0\u20fa\0\u213d\0\u2180\0\u21c3\0\311\0\u2206"+
    "\0\311\0\u2249\0\311\0\u228c\0\u22cf\0\311\0\u2312\0\u2355"+
    "\0\u2398\0\311\0\311\0\u23db\0\u241e\0\u2461\0\311\0\u24a4"+
    "\0\311\0\u24e7\0\u252a\0\311\0\311";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[189];
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
    "\1\2\1\3\2\4\1\5\1\6\1\7\1\4\1\10"+
    "\1\11\2\4\1\12\1\13\1\14\2\4\1\15\2\4"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\4\1\27\1\30\1\31\1\32\1\4\1\33"+
    "\4\4\1\34\1\4\1\35\1\4\1\36\1\4\1\37"+
    "\1\40\2\4\1\2\1\20\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
    "\1\55\1\56\1\57\104\0\1\5\1\60\1\0\1\5"+
    "\23\0\1\61\14\0\1\60\36\0\24\4\7\0\27\4"+
    "\21\0\1\5\2\0\1\5\23\0\1\61\53\0\5\4"+
    "\1\62\16\4\7\0\10\4\1\63\16\4\21\0\7\4"+
    "\1\64\14\4\7\0\27\4\21\0\12\4\1\65\11\4"+
    "\7\0\11\4\1\66\15\4\21\0\11\4\1\67\12\4"+
    "\7\0\1\4\1\70\25\4\21\0\4\4\1\71\17\4"+
    "\7\0\27\4\21\0\15\4\1\72\6\4\7\0\27\4"+
    "\21\0\7\4\1\73\14\4\7\0\27\4\21\0\21\4"+
    "\1\74\2\4\7\0\27\4\21\0\7\4\1\75\14\4"+
    "\7\0\27\4\20\0\26\76\1\0\54\76\26\0\1\20"+
    "\34\0\1\20\20\0\1\77\2\0\1\77\127\0\1\100"+
    "\1\101\103\0\1\102\50\0\24\4\7\0\1\4\1\103"+
    "\25\4\21\0\10\4\1\104\13\4\7\0\4\4\1\105"+
    "\5\4\1\106\14\4\21\0\24\4\7\0\1\4\1\107"+
    "\25\4\21\0\6\4\1\110\15\4\7\0\27\4\21\0"+
    "\5\4\1\111\16\4\7\0\1\4\1\112\25\4\21\0"+
    "\12\4\1\113\11\4\7\0\27\4\21\0\24\4\7\0"+
    "\10\4\1\114\16\4\21\0\7\4\1\115\14\4\7\0"+
    "\27\4\21\0\5\4\1\116\16\4\7\0\27\4\21\0"+
    "\11\4\1\117\12\4\7\0\27\4\21\0\7\4\1\120"+
    "\14\4\7\0\27\4\107\0\1\121\102\0\1\122\102\0"+
    "\1\123\102\0\1\124\105\0\1\125\106\0\1\126\5\0"+
    "\1\127\1\0\2\127\3\0\3\127\5\0\3\127\14\0"+
    "\1\127\1\0\1\127\1\0\1\127\14\0\1\127\23\0"+
    "\1\61\2\0\1\61\3\0\1\130\7\0\1\130\63\0"+
    "\6\4\1\131\15\4\7\0\27\4\21\0\24\4\7\0"+
    "\2\4\1\132\24\4\21\0\4\4\1\133\17\4\7\0"+
    "\27\4\21\0\13\4\1\134\10\4\7\0\27\4\21\0"+
    "\4\4\1\135\17\4\7\0\27\4\21\0\12\4\1\136"+
    "\11\4\7\0\27\4\21\0\5\4\1\137\16\4\7\0"+
    "\27\4\21\0\5\4\1\140\16\4\7\0\27\4\21\0"+
    "\16\4\1\141\5\4\7\0\27\4\21\0\11\4\1\142"+
    "\12\4\7\0\27\4\21\0\22\4\1\143\1\4\7\0"+
    "\27\4\21\0\4\4\1\144\17\4\7\0\27\4\20\0"+
    "\25\76\1\145\1\0\54\76\1\0\1\77\2\0\1\77"+
    "\23\0\1\61\52\0\26\100\1\146\54\100\32\147\1\150"+
    "\50\147\1\0\24\4\7\0\2\4\1\151\24\4\21\0"+
    "\4\4\1\152\17\4\7\0\27\4\21\0\24\4\7\0"+
    "\13\4\1\153\13\4\21\0\6\4\1\154\15\4\7\0"+
    "\27\4\21\0\12\4\1\155\11\4\7\0\27\4\21\0"+
    "\7\4\1\156\14\4\7\0\27\4\21\0\24\4\7\0"+
    "\1\4\1\157\25\4\21\0\11\4\1\160\12\4\7\0"+
    "\27\4\21\0\24\4\7\0\2\4\1\161\24\4\21\0"+
    "\24\4\7\0\14\4\1\162\12\4\21\0\24\4\7\0"+
    "\2\4\1\163\24\4\21\0\12\4\1\164\11\4\7\0"+
    "\27\4\21\0\4\4\1\165\17\4\7\0\27\4\21\0"+
    "\1\166\2\0\1\166\22\0\1\167\34\0\1\167\17\0"+
    "\7\4\1\170\14\4\7\0\27\4\21\0\13\4\1\171"+
    "\10\4\7\0\27\4\21\0\6\4\1\172\15\4\7\0"+
    "\27\4\21\0\7\4\1\173\14\4\7\0\27\4\21\0"+
    "\7\4\1\174\14\4\7\0\27\4\21\0\13\4\1\131"+
    "\10\4\7\0\27\4\21\0\24\4\7\0\2\4\1\175"+
    "\24\4\21\0\17\4\1\170\4\4\7\0\27\4\21\0"+
    "\24\4\7\0\3\4\1\176\23\4\21\0\23\4\1\141"+
    "\7\0\27\4\21\0\24\4\7\0\5\4\1\177\21\4"+
    "\20\0\32\147\1\200\50\147\31\0\1\146\1\150\51\0"+
    "\24\4\7\0\3\4\1\201\23\4\21\0\7\4\1\202"+
    "\14\4\7\0\27\4\21\0\12\4\1\203\11\4\7\0"+
    "\27\4\21\0\24\4\7\0\5\4\1\204\21\4\21\0"+
    "\12\4\1\205\11\4\7\0\27\4\21\0\11\4\1\206"+
    "\12\4\7\0\27\4\21\0\12\4\1\207\11\4\7\0"+
    "\27\4\21\0\13\4\1\210\10\4\7\0\27\4\21\0"+
    "\12\4\1\211\11\4\7\0\27\4\21\0\21\4\1\212"+
    "\2\4\7\0\27\4\21\0\24\4\7\0\4\4\1\213"+
    "\22\4\21\0\12\4\1\214\11\4\7\0\27\4\21\0"+
    "\24\4\7\0\24\4\1\215\2\4\21\0\1\166\2\0"+
    "\1\166\77\0\5\4\1\216\16\4\7\0\27\4\21\0"+
    "\24\4\7\0\4\4\1\217\22\4\21\0\24\4\7\0"+
    "\4\4\1\220\22\4\21\0\22\4\1\221\1\4\7\0"+
    "\21\4\1\222\5\4\21\0\24\4\7\0\17\4\1\223"+
    "\7\4\20\0\31\224\1\146\1\200\50\224\1\0\5\4"+
    "\1\225\16\4\7\0\27\4\21\0\7\4\1\226\14\4"+
    "\7\0\27\4\21\0\12\4\1\227\11\4\7\0\27\4"+
    "\21\0\24\4\7\0\15\4\1\230\11\4\21\0\13\4"+
    "\1\231\10\4\7\0\27\4\21\0\7\4\1\232\14\4"+
    "\7\0\27\4\21\0\5\4\1\233\16\4\7\0\27\4"+
    "\21\0\4\4\1\234\17\4\7\0\27\4\21\0\24\4"+
    "\7\0\1\4\1\235\25\4\21\0\24\4\7\0\17\4"+
    "\1\236\7\4\21\0\24\4\7\0\4\4\1\237\22\4"+
    "\21\0\24\4\7\0\3\4\1\240\23\4\21\0\24\4"+
    "\7\0\6\4\1\241\20\4\21\0\24\4\7\0\2\4"+
    "\1\242\24\4\21\0\24\4\7\0\4\4\1\243\22\4"+
    "\21\0\4\4\1\244\17\4\7\0\27\4\20\0\32\224"+
    "\1\200\50\224\1\0\10\4\1\245\13\4\7\0\27\4"+
    "\21\0\24\4\7\0\12\4\1\246\14\4\21\0\7\4"+
    "\1\247\14\4\7\0\27\4\21\0\5\4\1\250\16\4"+
    "\7\0\27\4\21\0\24\4\7\0\7\4\1\251\17\4"+
    "\21\0\4\4\1\252\17\4\7\0\27\4\21\0\13\4"+
    "\1\253\10\4\7\0\27\4\21\0\24\4\7\0\4\4"+
    "\1\254\22\4\21\0\4\4\1\255\17\4\7\0\27\4"+
    "\21\0\7\4\1\256\14\4\7\0\27\4\21\0\11\4"+
    "\1\257\12\4\7\0\27\4\21\0\7\4\1\260\14\4"+
    "\7\0\27\4\21\0\11\4\1\261\12\4\7\0\27\4"+
    "\21\0\7\4\1\262\14\4\7\0\27\4\21\0\7\4"+
    "\1\263\14\4\7\0\27\4\21\0\7\4\1\264\14\4"+
    "\7\0\27\4\21\0\24\4\7\0\7\4\1\265\17\4"+
    "\21\0\24\4\7\0\4\4\1\266\22\4\21\0\24\4"+
    "\7\0\17\4\1\267\7\4\21\0\24\4\7\0\6\4"+
    "\1\270\20\4\21\0\7\4\1\271\14\4\7\0\27\4"+
    "\21\0\4\4\1\272\17\4\7\0\27\4\21\0\7\4"+
    "\1\273\14\4\7\0\27\4\21\0\13\4\1\274\10\4"+
    "\7\0\27\4\21\0\5\4\1\275\16\4\7\0\27\4"+
    "\20\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9581];
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


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\17\1\1\11\1\1\1\11\15\1\1\11"+
    "\5\1\2\11\1\1\5\11\1\0\15\1\2\0\1\1"+
    "\1\0\1\11\16\1\6\11\1\1\1\0\15\1\1\11"+
    "\1\1\1\0\16\1\1\0\10\1\1\0\23\1\1\0"+
    "\51\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[189];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    /*  Generamos un java_cup.Symbol para guardar el tipo de token 
        encontrado */
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    
    /* Generamos un Symbol para el tipo de token encontrado 
       junto con su valor */
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }

 
 static ArrayList<Tsimbols> tokens = new ArrayList<>();


public static ingress (String simbolo, String tipo){
   Tsimbols outsim = new Tsimbols();
    outsim.t_simbolo(simbolo, tipo);
    tokens.add(outsim);
}




  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalizadorLexico(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 242) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
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
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

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
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
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
        // peek one character ahead if it is \n (if we have counted one line too much)
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
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
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
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.print("ERROR Caracter no valido " + yytext() + " en linea: "+(yyline+1)+ " columna: "+ (yycolumn + 1) + " - " + ((yycolumn+1) + yylength() -1) +"\n");
            }
          case 61: break;
          case 2: 
            { AnalizadorLexico.ingress(yytext(),entero); return symbol(sym.ENTERO,new Integer(yytext()));
            }
          case 62: break;
          case 3: 
            { if(yytext().length()<=31){return symbol(sym.IDENTIFIER,new String(yytext()));} else{String cortador=yytext().substring(0,31); /*System.out.print("identificador truncado " + cortador + " en linea: "+(yyline+1)+ " columna: "+ (yycolumn + 1) + " - " + ((yycolumn+1) + yylength() - 1));*/ return symbol(sym.IDENTIFIER,new String(yytext()));}
            }
          case 63: break;
          case 4: 
            { /*se ignoran los espacios*/
            }
          case 64: break;
          case 5: 
            { return symbol(sym.MINUS,new String(yytext()));
            }
          case 65: break;
          case 6: 
            { return symbol(sym.POINT,new String(yytext()));
            }
          case 66: break;
          case 7: 
            { return symbol(sym.DIV,new String(yytext()));
            }
          case 67: break;
          case 8: 
            { return symbol(sym.MULTI,new String(yytext()));
            }
          case 68: break;
          case 9: 
            { return symbol(sym.PLUS,new String(yytext()));
            }
          case 69: break;
          case 10: 
            { return symbol(sym.MOD,new String(yytext()));
            }
          case 70: break;
          case 11: 
            { return symbol(sym.MINOR,new String(yytext()));
            }
          case 71: break;
          case 12: 
            { return symbol(sym.ASIGNATION,new String(yytext()));
            }
          case 72: break;
          case 13: 
            { return symbol(sym.MAJOR,new String(yytext()));
            }
          case 73: break;
          case 14: 
            { return symbol(sym.ADMIRATION,new String(yytext()));
            }
          case 74: break;
          case 15: 
            { return symbol(sym.SEMICOLON,new String(yytext()));
            }
          case 75: break;
          case 16: 
            { return symbol(sym.COMMA,new String(yytext()));
            }
          case 76: break;
          case 17: 
            { return symbol(sym.CORCHIZQ,new String(yytext()));
            }
          case 77: break;
          case 18: 
            { return symbol(sym.CORCHDER,new String(yytext()));
            }
          case 78: break;
          case 19: 
            { return symbol(sym.PARENIZQ,new String(yytext()));
            }
          case 79: break;
          case 20: 
            { return symbol(sym.PARENDER,new String(yytext()));
            }
          case 80: break;
          case 21: 
            { return symbol(sym.LLAVEIZQ,new String(yytext()));
            }
          case 81: break;
          case 22: 
            { return symbol(sym.LLAVEDER,new String(yytext()));
            }
          case 82: break;
          case 23: 
            { return symbol(sym.DOBLE,new Double(yytext()));
            }
          case 83: break;
          case 24: 
            { /*se ignoran los comentario*/
            }
          case 84: break;
          case 25: 
            { return symbol(sym.OR,new String(yytext()));
            }
          case 85: break;
          case 26: 
            { return symbol(sym.IF,new String(yytext()));
            }
          case 86: break;
          case 27: 
            { return symbol(sym.MINOREQ,new String(yytext()));
            }
          case 87: break;
          case 28: 
            { return symbol(sym.EQUAL,new String(yytext()));
            }
          case 88: break;
          case 29: 
            { return symbol(sym.MAJOREQ,new String(yytext()));
            }
          case 89: break;
          case 30: 
            { return symbol(sym.NOTEQUAL,new String(yytext()));
            }
          case 90: break;
          case 31: 
            { return symbol(sym.AND,new String(yytext()));
            }
          case 91: break;
          case 32: 
            { return symbol(sym.CORCHDOBLE,new String(yytext()));
            }
          case 92: break;
          case 33: 
            { return symbol(sym.HEX);
            }
          case 93: break;
          case 34: 
            { return symbol(sym.FOR,new String(yytext()));
            }
          case 94: break;
          case 35: 
            { return symbol(sym.CADENA,new String(yytext()));
            }
          case 95: break;
          case 36: 
            { System.out.print("ERROR Comentario no cerrado " + yytext() + " en linea: "+(yyline+1)+ " columna: "+ (yycolumn + 1) + " - " + ((yycolumn+1) + yylength() - 1) + "\n");
            }
          case 96: break;
          case 37: 
            { return symbol(sym.INT,new String(yytext()));
            }
          case 97: break;
          case 38: 
            { return symbol(sym.NEW,new String(yytext()));
            }
          case 98: break;
          case 39: 
            { return symbol(sym.BOOLEAN,new Boolean(yytext()));
            }
          case 99: break;
          case 40: 
            { return symbol(sym.THIS,new String(yytext()));
            }
          case 100: break;
          case 41: 
            { return symbol(sym.ELSE,new String(yytext()));
            }
          case 101: break;
          case 42: 
            { return symbol(sym.VOID,new String(yytext()));
            }
          case 102: break;
          case 43: 
            { return symbol(sym.NULL,new String(yytext()));
            }
          case 103: break;
          case 44: 
            { return symbol(sym.BOOL,new String(yytext()));
            }
          case 104: break;
          case 45: 
            { return symbol(sym.BREAK,new String(yytext()));
            }
          case 105: break;
          case 46: 
            { return symbol(sym.CLASS,new String(yytext()));
            }
          case 106: break;
          case 47: 
            { return symbol(sym.WHILE,new String(yytext()));
            }
          case 107: break;
          case 48: 
            { return symbol(sym.PRINT,new String(yytext()));
            }
          case 108: break;
          case 49: 
            { return symbol(sym.RETURN,new String(yytext()));
            }
          case 109: break;
          case 50: 
            { return symbol(sym.STRING,new String(yytext()));
            }
          case 110: break;
          case 51: 
            { return symbol(sym.DOUBLE,new String(yytext()));
            }
          case 111: break;
          case 52: 
            { return symbol(sym.MALLOC,new String(yytext()));
            }
          case 112: break;
          case 53: 
            { return symbol(sym.EXTENDS,new String(yytext()));
            }
          case 113: break;
          case 54: 
            { return symbol(sym.SETBYTE,new String(yytext()));
            }
          case 114: break;
          case 55: 
            { return symbol(sym.GETBYTE,new String(yytext()));
            }
          case 115: break;
          case 56: 
            { return symbol(sym.READLINE,new String(yytext()));
            }
          case 116: break;
          case 57: 
            { return symbol(sym.NEWARRAY,new String(yytext()));
            }
          case 117: break;
          case 58: 
            { return symbol(sym.INTERFACE,new String(yytext()));
            }
          case 118: break;
          case 59: 
            { return symbol(sym.IMPLEMENTS,new String(yytext()));
            }
          case 119: break;
          case 60: 
            { return symbol(sym.READINT,new String(yytext()));
            }
          case 120: break;
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
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java AnalizadorLexico [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        AnalizadorLexico scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new AnalizadorLexico(reader);
          while ( !scanner.zzAtEOF ) scanner.next_token();
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
