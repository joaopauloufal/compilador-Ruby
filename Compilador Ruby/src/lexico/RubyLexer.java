/* The following code was generated by JFlex 1.6.1 */

package lexico;

import java_cup.runtime.*;
import jsyntaxpane.Token;
import jsyntaxpane.TokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>/home/paulo/git/compilador-ruby/Compilador Ruby/src/lexico/rubyscanner.flex</tt>
 */
public final class RubyLexer extends DefaultJFlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;
  public static final int ML_STRING = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\100\1\101\1\1\22\0\1\3\1\74\1\75"+
    "\1\4\1\0\1\67\1\67\1\0\1\57\1\60\1\65\1\22\1\72"+
    "\1\22\1\20\1\66\1\7\1\15\2\14\4\16\2\10\1\72\1\72"+
    "\1\70\1\73\1\71\1\77\1\72\1\13\1\24\1\13\1\44\1\25"+
    "\1\17\1\26\1\5\1\27\1\76\1\5\1\11\1\5\1\30\11\5"+
    "\1\12\2\5\1\63\1\23\1\64\1\67\1\6\1\72\1\35\1\52"+
    "\1\51\1\47\1\21\1\41\1\56\1\43\1\37\1\76\1\53\1\40"+
    "\1\54\1\31\1\45\1\46\1\5\1\34\1\32\1\36\1\33\1\5"+
    "\1\42\1\55\1\50\1\5\1\61\1\67\1\62\1\72\6\0\1\100"+
    "\u1fa2\0\1\100\1\100\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\3\1\1\2\1\3\1\1\2\4\1\5\1\3"+
    "\1\5\21\3\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\5\5\1\1\1\14\1\15\2\16\1\1\1\17\2\20"+
    "\1\1\2\2\1\21\1\0\3\4\1\0\4\4\1\0"+
    "\20\3\1\22\1\23\12\3\1\0\1\24\2\15\3\0"+
    "\4\4\1\0\1\3\1\25\20\3\1\23\6\3\1\26"+
    "\1\15\1\27\2\0\2\4\15\3\1\0\2\4\1\3"+
    "\1\0\2\4\1\0\2\4\1\30\6\4\1\0\1\4"+
    "\1\0\1\4\1\0\1\4\1\0\1\4\1\0\1\4"+
    "\1\0\1\4\1\0\1\4\1\0\5\4";

  private static int [] zzUnpackAction() {
    int [] result = new int[187];
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
    "\0\0\0\102\0\204\0\306\0\u0108\0\u014a\0\u018c\0\u01ce"+
    "\0\u0210\0\u0252\0\u0294\0\u02d6\0\u0318\0\u035a\0\u039c\0\u03de"+
    "\0\u0420\0\u0462\0\u04a4\0\u04e6\0\u0528\0\u056a\0\u05ac\0\u05ee"+
    "\0\u0630\0\u0672\0\u06b4\0\u06f6\0\u0738\0\u077a\0\u07bc\0\306"+
    "\0\306\0\306\0\306\0\306\0\306\0\u07fe\0\u0840\0\u0882"+
    "\0\u08c4\0\306\0\u035a\0\u0906\0\u0948\0\u098a\0\306\0\u09cc"+
    "\0\306\0\u0a0e\0\306\0\u0a50\0\u0a92\0\306\0\306\0\u0ad4"+
    "\0\u0b16\0\u0b58\0\306\0\u0b9a\0\u0bdc\0\u0c1e\0\u0c60\0\u0ca2"+
    "\0\u0ce4\0\u0d26\0\u0d68\0\u0daa\0\u0dec\0\u0e2e\0\u0e70\0\u0eb2"+
    "\0\u0ef4\0\u0f36\0\u0f78\0\u0fba\0\u0ffc\0\u103e\0\u1080\0\u10c2"+
    "\0\u1104\0\u01ce\0\u01ce\0\u1146\0\u1188\0\u11ca\0\u120c\0\u124e"+
    "\0\u1290\0\u12d2\0\u1314\0\u1356\0\u1398\0\u13da\0\306\0\u141c"+
    "\0\u145e\0\u14a0\0\u14e2\0\u1524\0\u1566\0\u15a8\0\u15ea\0\u162c"+
    "\0\u166e\0\u16b0\0\u01ce\0\u16f2\0\u1734\0\u1776\0\u17b8\0\u17fa"+
    "\0\u183c\0\u187e\0\u18c0\0\u1902\0\u1944\0\u1986\0\u19c8\0\u1a0a"+
    "\0\u1a4c\0\u1a8e\0\u1ad0\0\u1b12\0\u1b54\0\u1b96\0\u1bd8\0\u1c1a"+
    "\0\u1c5c\0\u1c9e\0\306\0\306\0\306\0\u1ce0\0\u1d22\0\u1d64"+
    "\0\u1da6\0\u1de8\0\u1e2a\0\u1e6c\0\u1eae\0\u1ef0\0\u1f32\0\u1f74"+
    "\0\u1fb6\0\u1ff8\0\u203a\0\u207c\0\u20be\0\u2100\0\u2142\0\u2184"+
    "\0\u21c6\0\u2208\0\u224a\0\u228c\0\u22ce\0\u2310\0\u2352\0\u2394"+
    "\0\306\0\u23d6\0\u2418\0\u245a\0\u249c\0\u24de\0\u2520\0\u2562"+
    "\0\u25a4\0\u25e6\0\u2628\0\u266a\0\u26ac\0\u26ee\0\u2730\0\u2772"+
    "\0\u27b4\0\u27f6\0\u2838\0\u287a\0\u28bc\0\u28fe\0\u2940\0\u2982"+
    "\0\u29c4\0\u2a06\0\u2a48";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[187];
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
    "\1\4\1\5\1\4\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\3\10\3\13\1\10\1\14\1\15\1\16\1\4"+
    "\1\17\1\20\3\10\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\10\1\30\1\31\2\10\1\32\1\10"+
    "\1\33\1\34\1\35\1\36\1\10\1\37\2\10\1\40"+
    "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\16"+
    "\1\50\1\51\1\52\1\16\1\53\1\54\1\10\1\4"+
    "\1\0\1\6\1\55\1\56\1\57\20\55\1\60\51\55"+
    "\1\61\5\55\1\62\1\63\20\55\1\60\51\55\1\64"+
    "\4\55\104\0\1\4\102\0\1\6\75\0\1\6\1\7"+
    "\1\65\1\66\77\7\5\0\13\10\1\0\1\10\2\0"+
    "\33\10\17\0\1\10\1\67\10\0\1\70\102\0\1\71"+
    "\1\72\1\73\1\74\1\0\1\75\1\76\1\75\1\77"+
    "\1\100\1\101\3\0\1\101\12\0\1\73\1\77\13\0"+
    "\1\74\33\0\2\13\1\73\2\0\3\13\1\77\1\100"+
    "\1\101\3\0\1\101\12\0\1\73\1\77\47\0\2\100"+
    "\3\0\3\100\1\0\1\52\66\0\13\10\1\0\1\10"+
    "\2\0\5\10\1\102\6\10\1\103\16\10\17\0\1\10"+
    "\1\67\75\0\1\52\13\0\13\10\1\0\1\10\2\0"+
    "\1\10\1\104\31\10\17\0\1\10\1\67\7\0\13\10"+
    "\1\0\1\10\2\0\4\10\1\105\26\10\17\0\1\10"+
    "\1\67\7\0\13\10\1\0\1\106\2\0\13\10\1\107"+
    "\5\10\1\110\11\10\17\0\1\10\1\67\7\0\13\10"+
    "\1\0\1\111\2\0\7\10\1\112\23\10\17\0\1\10"+
    "\1\67\7\0\13\10\1\0\1\10\2\0\5\10\1\113"+
    "\25\10\17\0\1\10\1\67\7\0\13\10\1\0\1\114"+
    "\2\0\33\10\17\0\1\10\1\67\7\0\13\10\1\0"+
    "\1\10\2\0\5\10\1\115\1\116\5\10\1\117\16\10"+
    "\17\0\1\10\1\67\7\0\13\10\1\0\1\10\2\0"+
    "\10\10\1\120\6\10\1\121\13\10\17\0\1\10\1\67"+
    "\7\0\13\10\1\0\1\10\2\0\5\10\1\122\7\10"+
    "\1\123\15\10\17\0\1\10\1\67\7\0\13\10\1\0"+
    "\1\10\2\0\11\10\1\124\7\10\1\125\11\10\17\0"+
    "\1\10\1\67\7\0\13\10\1\0\1\10\2\0\17\10"+
    "\1\126\13\10\17\0\1\10\1\67\7\0\13\10\1\0"+
    "\1\10\2\0\10\10\1\122\22\10\17\0\1\10\1\67"+
    "\7\0\13\10\1\0\1\127\2\0\21\10\1\123\11\10"+
    "\17\0\1\10\1\67\7\0\13\10\1\0\1\10\2\0"+
    "\13\10\1\130\17\10\17\0\1\10\1\67\7\0\13\10"+
    "\1\0\1\10\2\0\11\10\1\131\2\10\1\132\16\10"+
    "\17\0\1\10\1\67\7\0\13\10\1\0\1\133\2\0"+
    "\10\10\1\134\22\10\17\0\1\10\1\67\7\0\13\10"+
    "\1\0\1\10\2\0\21\10\1\135\11\10\17\0\1\10"+
    "\1\67\67\0\1\16\5\0\1\52\74\0\1\16\4\0"+
    "\1\52\76\0\1\16\1\52\1\0\1\52\77\0\1\16"+
    "\1\0\1\52\103\0\1\136\4\0\1\55\2\0\20\55"+
    "\1\0\51\55\1\0\4\55\2\0\1\57\77\0\1\137"+
    "\2\0\4\137\1\140\4\137\2\140\1\141\61\137\4\0"+
    "\1\63\174\0\1\142\6\0\1\66\110\0\1\143\5\0"+
    "\1\144\71\0\1\71\1\72\1\73\2\0\1\75\1\76"+
    "\1\75\1\77\1\100\1\101\3\0\1\101\12\0\1\73"+
    "\1\77\47\0\2\72\3\0\3\72\1\77\1\100\1\101"+
    "\3\0\1\101\13\0\1\77\47\0\1\145\1\146\2\0"+
    "\5\146\1\0\1\146\2\0\2\146\7\0\1\146\3\0"+
    "\1\146\2\0\1\146\2\0\1\146\1\0\2\146\36\0"+
    "\1\147\1\72\1\73\2\0\3\147\1\77\1\100\1\101"+
    "\3\0\1\101\12\0\1\73\1\77\47\0\1\75\1\72"+
    "\1\73\2\0\3\75\1\77\1\100\1\101\3\0\1\101"+
    "\12\0\1\73\1\77\136\0\1\73\12\0\2\100\3\0"+
    "\3\100\1\77\1\0\1\101\3\0\1\101\13\0\1\77"+
    "\47\0\2\150\3\0\3\150\3\0\1\151\64\0\13\10"+
    "\1\0\1\10\2\0\6\10\1\152\14\10\1\153\7\10"+
    "\17\0\1\10\1\67\7\0\13\10\1\0\1\10\2\0"+
    "\6\10\1\154\24\10\17\0\1\10\1\67\7\0\13\10"+
    "\1\0\1\10\2\0\2\10\1\155\30\10\17\0\1\10"+
    "\1\67\7\0\13\10\1\0\1\10\2\0\20\10\1\122"+
    "\12\10\17\0\1\10\1\67\7\0\13\10\1\0\1\10"+
    "\2\0\31\10\1\110\1\10\17\0\1\10\1\67\7\0"+
    "\13\10\1\0\1\10\2\0\14\10\1\122\16\10\17\0"+
    "\1\10\1\67\7\0\13\10\1\0\1\10\2\0\12\10"+
    "\1\122\20\10\17\0\1\10\1\67\7\0\13\10\1\0"+
    "\1\10\2\0\14\10\1\156\16\10\17\0\1\10\1\67"+
    "\7\0\13\10\1\0\1\10\2\0\22\10\1\157\10\10"+
    "\17\0\1\10\1\67\7\0\13\10\1\0\1\10\2\0"+
    "\12\10\1\160\1\10\1\161\6\10\1\162\7\10\17\0"+
    "\1\10\1\67\7\0\13\10\1\0\1\10\2\0\6\10"+
    "\1\163\3\10\1\164\10\10\1\165\7\10\17\0\1\10"+
    "\1\67\7\0\13\10\1\0\1\10\2\0\23\10\1\122"+
    "\7\10\17\0\1\10\1\67\7\0\13\10\1\0\1\10"+
    "\2\0\6\10\1\166\24\10\17\0\1\10\1\67\7\0"+
    "\13\10\1\0\1\10\2\0\13\10\1\167\17\10\17\0"+
    "\1\10\1\67\7\0\13\10\1\0\1\10\2\0\7\10"+
    "\1\170\23\10\17\0\1\10\1\67\7\0\13\10\1\0"+
    "\1\171\2\0\33\10\17\0\1\10\1\67\7\0\13\10"+
    "\1\0\1\10\2\0\14\10\1\172\16\10\17\0\1\10"+
    "\1\67\7\0\13\10\1\0\1\10\2\0\10\10\1\123"+
    "\22\10\17\0\1\10\1\67\7\0\13\10\1\0\1\171"+
    "\2\0\13\10\1\173\17\10\17\0\1\10\1\67\7\0"+
    "\13\10\1\0\1\10\2\0\15\10\1\174\15\10\17\0"+
    "\1\10\1\67\7\0\13\10\1\0\1\175\2\0\33\10"+
    "\17\0\1\10\1\67\7\0\13\10\1\0\1\10\2\0"+
    "\6\10\1\176\24\10\17\0\1\10\1\67\7\0\13\10"+
    "\1\0\1\10\2\0\11\10\1\177\21\10\17\0\1\10"+
    "\1\67\7\0\13\10\1\0\1\10\2\0\32\10\1\200"+
    "\17\0\1\10\1\67\7\0\13\10\1\0\1\201\2\0"+
    "\33\10\17\0\1\10\1\67\7\0\13\10\1\0\1\10"+
    "\2\0\23\10\1\202\7\10\17\0\1\10\1\67\77\0"+
    "\1\203\13\0\1\141\4\0\3\141\72\0\1\204\4\0"+
    "\3\204\160\0\1\205\33\0\1\206\101\0\1\207\61\0"+
    "\1\145\1\146\1\73\1\0\5\146\1\0\1\146\2\0"+
    "\2\146\7\0\1\146\2\0\1\73\1\146\2\0\1\146"+
    "\2\0\1\146\1\0\2\146\36\0\2\210\1\73\1\0"+
    "\5\210\1\0\1\210\2\0\2\210\7\0\1\210\2\0"+
    "\1\73\1\210\2\0\1\210\2\0\1\210\1\0\2\210"+
    "\36\0\1\211\1\72\1\73\2\0\3\211\1\77\1\100"+
    "\1\101\3\0\1\101\12\0\1\73\1\77\47\0\2\150"+
    "\3\0\3\150\1\77\21\0\1\77\47\0\2\150\3\0"+
    "\3\150\70\0\13\10\1\0\1\10\2\0\7\10\1\212"+
    "\23\10\17\0\1\10\1\67\7\0\13\10\1\0\1\122"+
    "\2\0\13\10\1\156\17\10\17\0\1\10\1\67\7\0"+
    "\13\10\1\0\1\10\2\0\3\10\1\213\27\10\17\0"+
    "\1\10\1\67\7\0\13\10\1\0\1\10\2\0\15\10"+
    "\1\122\15\10\17\0\1\10\1\67\7\0\13\10\1\0"+
    "\1\32\2\0\33\10\17\0\1\10\1\67\7\0\13\10"+
    "\1\0\1\10\2\0\13\10\1\214\17\10\17\0\1\10"+
    "\1\67\7\0\13\10\1\0\1\215\2\0\33\10\17\0"+
    "\1\10\1\67\7\0\13\10\1\0\1\156\2\0\33\10"+
    "\17\0\1\10\1\67\7\0\13\10\1\0\1\10\2\0"+
    "\25\10\1\120\5\10\17\0\1\10\1\67\7\0\13\10"+
    "\1\0\1\10\2\0\7\10\1\216\1\217\22\10\17\0"+
    "\1\10\1\67\7\0\13\10\1\0\1\10\2\0\21\10"+
    "\1\122\11\10\17\0\1\10\1\67\7\0\13\10\1\0"+
    "\1\220\2\0\33\10\17\0\1\10\1\67\7\0\13\10"+
    "\1\0\1\10\2\0\11\10\1\221\21\10\17\0\1\10"+
    "\1\67\7\0\13\10\1\0\1\122\2\0\33\10\17\0"+
    "\1\10\1\67\7\0\13\10\1\0\1\10\2\0\5\10"+
    "\1\122\25\10\17\0\1\10\1\67\7\0\13\10\1\0"+
    "\1\10\2\0\6\10\1\170\24\10\17\0\1\10\1\67"+
    "\7\0\13\10\1\0\1\10\2\0\14\10\1\176\16\10"+
    "\17\0\1\10\1\67\7\0\13\10\1\0\1\10\2\0"+
    "\13\10\1\222\17\10\17\0\1\10\1\67\7\0\13\10"+
    "\1\0\1\10\2\0\14\10\1\115\16\10\17\0\1\10"+
    "\1\67\7\0\13\10\1\0\1\123\2\0\33\10\17\0"+
    "\1\10\1\67\7\0\13\10\1\0\1\10\2\0\6\10"+
    "\1\223\24\10\17\0\1\10\1\67\7\0\13\10\1\0"+
    "\1\10\2\0\13\10\1\224\17\10\17\0\1\10\1\67"+
    "\7\0\13\10\1\0\1\10\2\0\11\10\1\225\21\10"+
    "\17\0\1\10\1\67\7\0\13\10\1\0\1\10\2\0"+
    "\7\10\1\226\23\10\17\0\1\10\1\67\32\0\1\227"+
    "\62\0\1\227\77\0\2\230\1\73\1\0\5\230\1\0"+
    "\1\230\2\0\2\230\7\0\1\230\2\0\1\73\1\230"+
    "\2\0\1\230\2\0\1\230\1\0\2\230\36\0\1\231"+
    "\1\72\1\73\2\0\3\231\1\77\1\100\1\101\3\0"+
    "\1\101\12\0\1\73\1\77\45\0\13\10\1\0\1\10"+
    "\2\0\10\10\1\170\22\10\17\0\1\10\1\67\7\0"+
    "\13\10\1\0\1\10\2\0\4\10\1\122\26\10\17\0"+
    "\1\10\1\67\7\0\13\10\1\0\1\10\2\0\14\10"+
    "\1\123\16\10\17\0\1\10\1\67\7\0\13\10\1\0"+
    "\1\10\2\0\6\10\1\221\24\10\17\0\1\10\1\67"+
    "\7\0\13\10\1\0\1\10\2\0\10\10\1\171\22\10"+
    "\17\0\1\10\1\67\7\0\13\10\1\0\1\10\2\0"+
    "\24\10\1\122\6\10\17\0\1\10\1\67\7\0\13\10"+
    "\1\0\1\10\2\0\10\10\1\110\22\10\17\0\1\10"+
    "\1\67\7\0\13\10\1\0\1\10\2\0\6\10\1\122"+
    "\24\10\17\0\1\10\1\67\7\0\13\10\1\0\1\10"+
    "\2\0\5\10\1\232\25\10\17\0\1\10\1\67\7\0"+
    "\13\10\1\0\1\10\2\0\6\10\1\123\24\10\17\0"+
    "\1\10\1\67\7\0\13\10\1\0\1\10\2\0\5\10"+
    "\1\123\25\10\17\0\1\10\1\67\7\0\13\10\1\0"+
    "\1\10\2\0\27\10\1\122\3\10\17\0\1\10\1\67"+
    "\7\0\13\10\1\0\1\10\2\0\14\10\1\170\16\10"+
    "\17\0\1\10\1\67\27\0\1\233\63\0\2\234\1\73"+
    "\1\0\5\234\1\0\1\234\2\0\2\234\7\0\1\234"+
    "\2\0\1\73\1\234\2\0\1\234\2\0\1\234\1\0"+
    "\2\234\36\0\1\235\1\72\1\73\2\0\3\235\1\77"+
    "\1\100\1\101\3\0\1\101\12\0\1\73\1\77\45\0"+
    "\13\10\1\0\1\115\2\0\33\10\17\0\1\10\1\67"+
    "\10\0\1\236\102\0\2\237\1\73\1\0\5\237\1\0"+
    "\1\237\2\0\2\237\7\0\1\237\2\0\1\73\1\237"+
    "\2\0\1\237\2\0\1\237\1\0\2\237\36\0\1\240"+
    "\1\72\1\73\2\0\3\240\1\77\1\100\1\101\3\0"+
    "\1\101\12\0\1\73\1\77\46\0\1\241\102\0\2\242"+
    "\1\73\1\0\5\242\1\0\1\242\2\0\2\242\7\0"+
    "\1\242\2\0\1\73\1\242\2\0\1\242\2\0\1\242"+
    "\1\0\2\242\36\0\1\243\1\72\1\73\2\0\3\243"+
    "\1\77\1\100\1\101\3\0\1\101\12\0\1\73\1\77"+
    "\47\0\2\244\1\73\1\0\5\244\1\0\1\244\2\0"+
    "\2\244\7\0\1\244\2\0\1\73\1\244\2\0\1\244"+
    "\2\0\1\244\1\0\2\244\36\0\1\245\1\72\1\73"+
    "\2\0\3\245\1\77\1\100\1\101\3\0\1\101\12\0"+
    "\1\73\1\77\47\0\2\246\1\73\1\0\5\246\1\0"+
    "\1\246\2\0\2\246\7\0\1\246\2\0\1\73\1\246"+
    "\2\0\1\246\2\0\1\246\1\0\2\246\36\0\1\247"+
    "\1\72\1\73\2\0\3\247\1\77\1\100\1\101\3\0"+
    "\1\101\12\0\1\73\1\77\47\0\2\250\1\73\1\0"+
    "\5\250\1\0\1\250\2\0\2\250\7\0\1\250\2\0"+
    "\1\73\1\250\2\0\1\250\2\0\1\250\1\0\2\250"+
    "\36\0\1\251\1\72\1\73\2\0\3\251\1\77\1\100"+
    "\1\101\3\0\1\101\12\0\1\73\1\77\47\0\2\252"+
    "\1\73\1\0\5\252\1\0\1\252\2\0\2\252\7\0"+
    "\1\252\2\0\1\73\1\252\2\0\1\252\2\0\1\252"+
    "\1\0\2\252\36\0\1\253\1\72\1\73\2\0\3\253"+
    "\1\77\1\100\1\101\3\0\1\101\12\0\1\73\1\77"+
    "\47\0\2\254\1\73\1\0\5\254\1\0\1\254\2\0"+
    "\2\254\7\0\1\254\2\0\1\73\1\254\2\0\1\254"+
    "\2\0\1\254\1\0\2\254\36\0\1\255\1\72\1\73"+
    "\2\0\3\255\1\77\1\100\1\101\3\0\1\101\12\0"+
    "\1\73\1\77\47\0\2\256\1\73\1\0\5\256\1\0"+
    "\1\256\2\0\2\256\7\0\1\256\2\0\1\73\1\256"+
    "\2\0\1\256\2\0\1\256\1\0\2\256\36\0\1\257"+
    "\1\72\1\73\2\0\3\257\1\77\1\100\1\101\3\0"+
    "\1\101\12\0\1\73\1\77\47\0\2\260\1\73\1\0"+
    "\5\260\1\0\1\260\2\0\2\260\7\0\1\260\2\0"+
    "\1\73\1\260\2\0\1\260\2\0\1\260\1\0\2\260"+
    "\36\0\1\261\1\72\1\73\2\0\3\261\1\77\1\100"+
    "\1\101\3\0\1\101\12\0\1\73\1\77\47\0\2\262"+
    "\1\73\1\0\5\262\1\0\1\262\2\0\2\262\7\0"+
    "\1\262\2\0\1\73\1\262\2\0\1\262\2\0\1\262"+
    "\1\0\2\262\36\0\1\263\1\72\1\73\2\0\3\263"+
    "\1\77\1\100\1\101\3\0\1\101\12\0\1\73\1\77"+
    "\47\0\2\264\1\73\1\0\5\264\1\0\1\264\2\0"+
    "\2\264\7\0\1\264\2\0\1\73\1\264\2\0\1\264"+
    "\2\0\1\264\1\0\2\264\36\0\1\265\1\72\1\73"+
    "\2\0\3\265\1\77\1\100\1\101\3\0\1\101\12\0"+
    "\1\73\1\77\47\0\2\266\1\73\1\0\5\266\1\0"+
    "\1\266\2\0\2\266\7\0\1\266\2\0\1\73\1\266"+
    "\2\0\1\266\2\0\1\266\1\0\2\266\36\0\1\267"+
    "\1\72\1\73\2\0\3\267\1\77\1\100\1\101\3\0"+
    "\1\101\12\0\1\73\1\77\51\0\1\73\26\0\1\73"+
    "\50\0\1\270\1\72\1\73\2\0\3\270\1\77\1\100"+
    "\1\101\3\0\1\101\12\0\1\73\1\77\47\0\1\271"+
    "\1\72\1\73\2\0\3\271\1\77\1\100\1\101\3\0"+
    "\1\101\12\0\1\73\1\77\47\0\1\272\1\72\1\73"+
    "\2\0\3\272\1\77\1\100\1\101\3\0\1\101\12\0"+
    "\1\73\1\77\47\0\1\273\1\72\1\73\2\0\3\273"+
    "\1\77\1\100\1\101\3\0\1\101\12\0\1\73\1\77"+
    "\47\0\2\72\1\73\2\0\3\72\1\77\1\100\1\101"+
    "\3\0\1\101\12\0\1\73\1\77\40\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10890];
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
    "\3\0\1\11\33\1\6\11\4\1\1\11\4\1\1\11"+
    "\1\1\1\11\1\1\1\11\2\1\2\11\1\0\2\1"+
    "\1\11\1\0\4\1\1\0\34\1\1\0\1\11\2\1"+
    "\3\0\4\1\1\0\31\1\3\11\2\0\17\1\1\0"+
    "\3\1\1\0\2\1\1\0\2\1\1\11\6\1\1\0"+
    "\1\1\1\0\1\1\1\0\1\1\1\0\1\1\1\0"+
    "\1\1\1\0\1\1\1\0\1\1\1\0\5\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[187];
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
    /**
     * Create an empty lexer, yyrset will be called later to reset and assign
     * the reader
     */
    public RubyLexer() {
        super();
    }

    @Override
    public int yychar() {
        return yychar;
    }

    private static final byte PARAN     = 1;
    private static final byte BRACKET   = 2;
    private static final byte CURLY     = 3;
    private static final byte WORD      = 4;



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public RubyLexer(java.io.Reader in) {
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
    while (i < 220) {
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
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

      yychar+= zzMarkedPosL-zzStartRead;

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
              {
                return null;
              }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { 
            }
          case 25: break;
          case 2: 
            { return token(TokenType.COMMENT);
            }
          case 26: break;
          case 3: 
            { return token(TokenType.IDENTIFIER);
            }
          case 27: break;
          case 4: 
            { return token(TokenType.NUMBER);
            }
          case 28: break;
          case 5: 
            { return token(TokenType.OPERATOR);
            }
          case 29: break;
          case 6: 
            { return token(TokenType.OPERATOR,  PARAN);
            }
          case 30: break;
          case 7: 
            { return token(TokenType.OPERATOR, -PARAN);
            }
          case 31: break;
          case 8: 
            { return token(TokenType.OPERATOR,  CURLY);
            }
          case 32: break;
          case 9: 
            { return token(TokenType.OPERATOR, -CURLY);
            }
          case 33: break;
          case 10: 
            { return token(TokenType.OPERATOR,  BRACKET);
            }
          case 34: break;
          case 11: 
            { return token(TokenType.OPERATOR, -BRACKET);
            }
          case 35: break;
          case 12: 
            { yybegin(STRING);
                                    tokenStart = yychar;
                                    tokenLength = 1;
            }
          case 36: break;
          case 13: 
            { tokenLength += yylength();
            }
          case 37: break;
          case 14: 
            { yybegin(YYINITIAL);
            }
          case 38: break;
          case 15: 
            { yybegin(YYINITIAL); 
                                     // length also includes the trailing quote
                                     return token(TokenType.STRING, tokenStart, tokenLength + 1);
            }
          case 39: break;
          case 16: 
            { tokenLength ++;
            }
          case 40: break;
          case 17: 
            { return token(TokenType.TYPE2);
            }
          case 41: break;
          case 18: 
            { return token(TokenType.KEYWORD);
            }
          case 42: break;
          case 19: 
            { return token(TokenType.KEYWORD,  WORD);
            }
          case 43: break;
          case 20: 
            { tokenLength += 2;
            }
          case 44: break;
          case 21: 
            { return token(TokenType.KEYWORD, -WORD);
            }
          case 45: break;
          case 22: 
            { yybegin(ML_STRING);
                                    tokenStart = yychar;
                                    tokenLength = 3;
            }
          case 46: break;
          case 23: 
            { yybegin(YYINITIAL);
                                     // length also includes the trailing quote
                                     return token(TokenType.STRING, tokenStart, tokenLength + 3);
            }
          case 47: break;
          case 24: 
            { return token(TokenType.TYPE);
            }
          case 48: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
