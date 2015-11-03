
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Nov 03 11:31:19 BRT 2015
//----------------------------------------------------

package sintatico;

import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Nov 03 11:31:19 BRT 2015
  */
public class RubyParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public RubyParser() {super();}

  /** Constructor which sets the default scanner. */
  public RubyParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public RubyParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\006\000\002\002\003\000\002\002\004\000\002\003" +
    "\003\000\002\003\003\000\002\005\005\000\002\004\004" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\013\000\006\130\007\132\011\001\002\000\004\002" +
    "\015\001\002\000\004\002\uffff\001\002\000\004\002\ufffe" +
    "\001\002\000\004\110\013\001\002\000\004\002\001\001" +
    "\002\000\004\133\012\001\002\000\004\002\ufffc\001\002" +
    "\000\004\133\014\001\002\000\004\002\ufffd\001\002\000" +
    "\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\013\000\012\002\003\003\007\004\004\005\005\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$RubyParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$RubyParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$RubyParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




	

    /**Método que é chamado automaticamente antes de um erro de sintaxe.*/
    public void syntax_error(Symbol s){
        System.out.println("Erro na linha " + (s.right+1) +", Coluna "+s.left+ ". ID "
        +s.value + " não reconhecido." );
    }

    /**Método que é chamado quando não é possível a recuperação de erros.*/
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
        System.out.println("Falha na compilação.");
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$RubyParser$actions {


/** Aqui podemos adicionar código JAVA */

  private final RubyParser parser;

  /** Constructor */
  CUP$RubyParser$actions(RubyParser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$RubyParser$do_action(
    int                        CUP$RubyParser$act_num,
    java_cup.runtime.lr_parser CUP$RubyParser$parser,
    java.util.Stack            CUP$RubyParser$stack,
    int                        CUP$RubyParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$RubyParser$result;

      /* select the action based on the action number */
      switch (CUP$RubyParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // codigo_puts ::= PUTS STRING 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$RubyParser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$RubyParser$stack.peek()).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$RubyParser$stack.peek()).value;
		 System.out.println(s); 
              CUP$RubyParser$result = parser.getSymbolFactory().newSymbol("codigo_puts",2, ((java_cup.runtime.Symbol)CUP$RubyParser$stack.elementAt(CUP$RubyParser$top-1)), ((java_cup.runtime.Symbol)CUP$RubyParser$stack.peek()), RESULT);
            }
          return CUP$RubyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // identificador ::= IDENTIFICADOR ATRIBUICAO STRING 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$RubyParser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$RubyParser$stack.peek()).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$RubyParser$stack.peek()).value;
		 System.out.println(n); 
              CUP$RubyParser$result = parser.getSymbolFactory().newSymbol("identificador",3, ((java_cup.runtime.Symbol)CUP$RubyParser$stack.elementAt(CUP$RubyParser$top-2)), ((java_cup.runtime.Symbol)CUP$RubyParser$stack.peek()), RESULT);
            }
          return CUP$RubyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // codigo ::= identificador 
            {
              Object RESULT =null;

              CUP$RubyParser$result = parser.getSymbolFactory().newSymbol("codigo",1, ((java_cup.runtime.Symbol)CUP$RubyParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$RubyParser$stack.peek()), RESULT);
            }
          return CUP$RubyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // codigo ::= codigo_puts 
            {
              Object RESULT =null;

              CUP$RubyParser$result = parser.getSymbolFactory().newSymbol("codigo",1, ((java_cup.runtime.Symbol)CUP$RubyParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$RubyParser$stack.peek()), RESULT);
            }
          return CUP$RubyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$RubyParser$stack.elementAt(CUP$RubyParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$RubyParser$stack.elementAt(CUP$RubyParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$RubyParser$stack.elementAt(CUP$RubyParser$top-1)).value;
		RESULT = start_val;
              CUP$RubyParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$RubyParser$stack.elementAt(CUP$RubyParser$top-1)), ((java_cup.runtime.Symbol)CUP$RubyParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$RubyParser$parser.done_parsing();
          return CUP$RubyParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // program ::= codigo 
            {
              Object RESULT =null;

              CUP$RubyParser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$RubyParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$RubyParser$stack.peek()), RESULT);
            }
          return CUP$RubyParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
