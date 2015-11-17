package lexico;
import java_cup.runtime.*;

%%

%cupsym Token
%public
%class RubyLexer
%cup
%unicode
%line
%char

%{

	StringBuffer string = new StringBuffer();

%}

FimDeLinha = \r|\n|\r\n
EntradaDetexto = [^\r\n]

EspacoBranco = {FimDeLinha} | [ \t\f]+

Comentario = "#" {EntradaDetexto}* {FimDeLinha}?

Identificador = [a-zA-Z][a-zA-Z0-9_]*

LiteralDecimalInteiro = 0 | [1-9][0-9]*
LiteralDecinalLong = {LiteralDecimalInteiro} [lL]

LiteralInteiroHexadecimal = 0 [xX] 0* {DigitoHexadecimal} {1,8}
LiteralLongHexadecimal    = 0 [xX] 0* {DigitoHexadecimal} {1,16} [lL]
DigitoHexadecimal = [0-9a-fA-F]

LiteralOctalInteiro = 0+ [1-3]? {DigitoOctal} {1,15}
LiteralOctalLong    = 0+ 1? {DigitoOctal} {1,21} [lL]
DigitoOctal = [0-7]

LiteralFloat = ({FLit1}|{FLit2}|{FLit3}) {Expoente}? [fF]
LiteralDouble = ({FLit1}|{FLit2}|{FLit3}) {Expoente}?

FLit1    = [0-9]+ \. [0-9]* 
FLit2    = \. [0-9]+ 
FLit3    = [0-9]+
Expoente = [eE] [+-]? [0-9]+

StringCaractere = [^\r\n\"\\]


%state STRING

%%


<YYINITIAL> {

  "BEGIN"                      { return new Symbol(Token.BEGIN_MAIUSCULO, yychar, yyline); }
  "ensure"                     { return new Symbol(Token.ENSURE, yychar, yyline); }
  "assert"                     { return new Symbol(Token.ASSERT, yychar, yyline); }                         
  "self"                       { return new Symbol(Token.SELF, yychar, yyline); }
  "when"                       { return new Symbol(Token.WHEN, yychar, yyline); }
  "END"                        { return new Symbol(Token.END_MAIUSCULO, yychar, yyline); }
  "false"                      { return new Symbol(Token.FALSE, yychar, yyline); }
  "not"                        { return new Symbol(Token.NOT, yychar, yyline); }
  "super"                      { return new Symbol(Token.SUPER, yychar, yyline); }
  "alias"                      { return new Symbol(Token.ALIAS, yychar, yyline); }
  "defined"                    { return new Symbol(Token.DEFINED, yychar, yyline); }
  "or"                         { return new Symbol(Token.OR, yychar, yyline); }
  "then"                       { return new Symbol(Token.THEN, yychar, yyline); }
  "yield"                      { return new Symbol(Token.YIELD, yychar, yyline); }
  "and"                        { return new Symbol(Token.AND, yychar, yyline); }
  "redo"                       { return new Symbol(Token.REDO, yychar, yyline); }
  "true"                       { return new Symbol(Token.TRUE, yychar, yyline); }
  "else"                       { return new Symbol(Token.ELSE, yychar, yyline); }
  "in"                         { return new Symbol(Token.IN, yychar, yyline); }
  "rescue"                     { return new Symbol(Token.RESCUE, yychar, yyline); }
  "undef"                      { return new Symbol(Token.UNDEF, yychar, yyline); }
  "break"                      { return new Symbol(Token.BREAK, yychar, yyline); }
  "elsif"                      { return new Symbol(Token.ELSIF, yychar, yyline); }
  "module"                     { return new Symbol(Token.MODULE, yychar, yyline); }
  "retry"                      { return new Symbol(Token.RETRY, yychar, yyline); }
  "unless"                     { return new Symbol(Token.UNLESS, yychar, yyline); }
  "next"                       { return new Symbol(Token.NEXT, yychar, yyline); }
  "return"                     { return new Symbol(Token.RETURN, yychar, yyline); }
  
  "begin"                      { return new Symbol(Token.BEGIN_MINUSCULO, yychar, yyline); }
  "case"                       { return new Symbol(Token.CASE, yychar, yyline); }
  "class"                      { return new Symbol(Token.CLASS, yychar, yyline); }
  "def"                        { return new Symbol(Token.DEF, yychar, yyline); }
  "for"                        { return new Symbol(Token.FOR, yychar, yyline); }
  "while"                      { return new Symbol(Token.WHILE, yychar, yyline); }
  "until"                      { return new Symbol(Token.UNTIL, yychar, yyline); }
  "do"                         { return new Symbol(Token.DO, yychar, yyline); }
  "if"                         { return new Symbol(Token.IF, yychar, yyline); }
  "puts"					   { return new Symbol(Token.PUTS, yychar, yyline); }

  "end"                        { return new Symbol(Token.END_MINUSCULO, yychar, yyline);}
  
  "("                          { return new Symbol(Token.PARENTESE_ABERTURA, yychar, yyline); }
  ")"                          { return new Symbol(Token.PARENTESE_FECHAMENTO, yychar, yyline); }
  "{"                          { return new Symbol(Token.CHAVE_ABERTURA, yychar, yyline); }
  "}"                          { return new Symbol(Token.CHAVE_FECHAMENTO, yychar, yyline); }
  "["                          { return new Symbol(Token.COLCHETE_ABERTURA, yychar, yyline); }
  "]"                          { return new Symbol(Token.COLCHETE_FECHAMENTO, yychar, yyline); }
  "+"                          { return new Symbol(Token.MAIS, yychar, yyline); }
  "-"                          { return new Symbol(Token.MENOS, yychar, yyline); }
  "*"                          { return new Symbol(Token.VEZES, yychar, yyline); }
  "**"                         { return new Symbol(Token.VEZES_VEZES, yychar, yyline); }
  "/"                          { return new Symbol(Token.BARRA, yychar, yyline); }
  "//"                         { return new Symbol(Token.BARRA_BARRA, yychar, yyline); }
  "%"                          { return new Symbol(Token.PORCENTAGEM, yychar, yyline); }
  "<<"                         { return new Symbol(Token.MENOR_MENOR, yychar, yyline); }
  ">>"                         { return new Symbol(Token.MAIOR_MAIOR, yychar, yyline); }
  "&"                          { return new Symbol(Token.E_COMERCIAL, yychar, yyline); }
  "|"                          { return new Symbol(Token.BARRA_VERTICAL, yychar, yyline); }
  "^"                          { return new Symbol(Token.POTENCIACAO, yychar, yyline); }
  "~"                          { return new Symbol(Token.TIL, yychar, yyline); }
  "<"                          { return new Symbol(Token.MENOR, yychar, yyline); }
  ">"                          { return new Symbol(Token.MAIOR, yychar, yyline); }
  "<="                         { return new Symbol(Token.MENOR_OU_IGUAL, yychar, yyline); }
  ">="                         { return new Symbol(Token.MAIOR_OU_IGUAL, yychar, yyline); }
  "=="                         { return new Symbol(Token.IGUAL_IGUAL, yychar, yyline); }
  "!="                         { return new Symbol(Token.DIFERENTE1, yychar, yyline); }
  "<>"                         { return new Symbol(Token.DIFERENTE2, yychar, yyline); }
  "@"                          { return new Symbol(Token.ARROBA, yychar, yyline); }
  ","                          { return new Symbol(Token.VIRGULA, yychar, yyline); }
  ":"                          { return new Symbol(Token.DOIS_PONTOS, yychar, yyline); }
  "."                          { return new Symbol(Token.PONTO, yychar, yyline); }
  ".."                         { return new Symbol(Token.DOIS_PONTOS2, yychar, yyline); }
  "`"                          { return new Symbol(Token.APOSTROFO, yychar, yyline); }
  "="                          { return new Symbol(Token.ATRIBUICAO, yychar, yyline); }
  ";"                          { return new Symbol(Token.PONTO_E_VIRGULA, yychar, yyline); }
  "+="                         { return new Symbol(Token.INCREMENTO, yychar, yyline); }
  "-="                         { return new Symbol(Token.DECREMENTO, yychar, yyline); }
  "*="                         { return new Symbol(Token.INCREMENTO_MULTIP, yychar, yyline); }
  "/="                         { return new Symbol(Token.INCREMENTO_DIVISAO, yychar, yyline); }
  "//="                        { return new Symbol(Token.INCREMENTO_DIVISAO_DIVISAO, yychar, yyline); }
  "%="                         { return new Symbol(Token.PORCENTAGEM_IGUAL, yychar, yyline); }
  "&="                         { return new Symbol(Token.E_COMERCIAL_IGUAL, yychar, yyline); }
  "|="                         { return new Symbol(Token.BARRA_VERTICAL_IGUAL, yychar, yyline); }
  "^="                         { return new Symbol(Token.PONTENCIACAO_IGUAL, yychar, yyline); }
  ">>="                        { return new Symbol(Token.MAIOR_MAIOR_IGUAL, yychar, yyline); }
  "<<="                        { return new Symbol(Token.MENOR_MENOR_IGUAL, yychar, yyline); }
  "**="                        { return new Symbol(Token.MULTIP_MULTIP_IGUAL, yychar, yyline); }
  
  \"                           { string.setLength(0); yybegin(STRING); }
  

  
  
  {LiteralDecimalInteiro}		|
  {LiteralDecinalLong}			|
  {LiteralInteiroHexadecimal}	|
  {LiteralLongHexadecimal}		|
  {LiteralOctalInteiro}			|
  {LiteralOctalLong}			|
  {LiteralFloat}				|
  {LiteralDouble}				|
  {LiteralFloat}[jJ]			{ return new Symbol(Token.NUMERO, yychar, yyline); }
  
  {Comentario}					{ return new Symbol(Token.COMENTARIO, yychar, yyline); }
  {EspacoBranco}				{ }
  
  {Identificador}"?"			{ return new Symbol(Token.TIPO2, yychar, yyline); }				
  {Identificador}				{ return new Symbol(Token.IDENTIFICADOR, yychar, yyline); }
  
}


<STRING> {

	\"							{
	
									yybegin(YYINITIAL);
									return new Symbol(Token.STRING, string.toString());
									
						
								}
								
	{StringCaractere}+			{ string.append(yytext()); }
	
	
	\\\" 						{ string.append('\"'); }
	
	
	\\                          { string.append('\\'); }
	{FimDeLinha}				{ yybegin(YYINITIAL); }

}
  
  

. {System.out.println("Caractere ilegal: " + yytext()); }
<<EOF>>                          { return null; }
