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
				token = scanner.next_token();
				System.out.println(token);
				
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
