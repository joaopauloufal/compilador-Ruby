package app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import lexico.RubyLexer;

public class Main {

	public static void main(String[] args) {
		
		try {
			RubyLexer scanner = new RubyLexer(new FileReader("arquivo.txt"));
			System.out.println(scanner.next_token());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

	}

}
