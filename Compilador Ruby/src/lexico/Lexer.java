package lexico;

import java.util.List;
import javax.swing.text.Segment;

/**
 * Lexers must implement these methods.  These are used in the Tokenizer 
 * 
 * A Lexer should be tied to one document.
 * 
 * @author Ayman Al-Sairafi
 */
public interface Lexer {
    /**
     * This is the only method a Lexer needs to implement.  It will be passed
     * a Reader, and it should return non-overlapping Tokens for each recognized token
     * in the stream.
     * @param segment Text to parse.
     * @param ofst offset to add to start of each token (useful for nesting)
     * @param tokens List of Tokens to be added.  This is done so that the caller creates the
     * appropriate List implementation and size.  The parse method just adds to the list
     */
    public void parse(Segment segment, int ofst, List<Token> tokens);
}

