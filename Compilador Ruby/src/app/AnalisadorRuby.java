package app;

import java.io.IOException;
import java.io.StringReader;

import lexico.RubyLexer;
import lexico.Token;
import lexico.TokenType;

public class AnalisadorRuby {
	
	public static void main(String[] args) {
		
		
		RubyLexer scanner = new RubyLexer(new StringReader("def"));
		try {
			Token token = scanner.yylex();
			if (token.type == TokenType.KEYWORD){
				System.out.println("ok");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
