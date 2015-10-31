package app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java_cup.runtime.Symbol;
import lexico.RubyLexer;

public class Main {

	public static void main(String[] args) {
		
		try {
			RubyLexer scanner = new RubyLexer(new FileReader("arquivo.txt"));
			Symbol token = scanner.next_token();
			while (token != null){
				System.out.println("ID: "+ token + " - " + scanner.yytext());
				token = scanner.next_token();
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

	}

}
