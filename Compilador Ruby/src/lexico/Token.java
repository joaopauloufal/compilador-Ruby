package lexico;

import java.io.Serializable;

public class Token implements Serializable, Comparable {
	
	public final TokenType type;
    public final int start;
    public final int length;
    /**
     * the pair value to use if this token is one of a pair:
     * This is how it is used:
     * The openning part will have a positive number X
     * The closing part will have a negative number X
     * X should be unique for a pair:
     *   e.g. for [ pairValue = +1
     *        for ] pairValue = -1
     */
    public final byte pairValue;
    /**
     * The kind of the Document.  This is only needed if proper Parsing
     * of a document is needed and it makes certain operations faster.
     * You can use any of the supplied Generic Values, or create your
     * language specific uses by using USER_FIRST + x;
     */
    public final short kind = 0;

    /**
     * Constructs a new token
     * @param type
     * @param start
     * @param length
     */
    public Token(TokenType type, int start, int length) {
        this.type = type;
        this.start = start;
        this.length = length;
        this.pairValue = 0;
    }

    /**
     * Construct a new part of pair token
     * @param type
     * @param start
     * @param length
     * @param pairValue
     */
    public Token(TokenType type, int start, int length, byte pairValue) {
        this.type = type;
        this.start = start;
        this.length = length;
        this.pairValue = pairValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Object) {
            Token token = (Token) obj;
            return ((this.start == token.start) &&
                    (this.length == token.length) &&
                    (this.type.equals(token.type)));
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return start;
    }

    @Override
    public String toString() {
        if (pairValue == 0) {
            return String.format("%s (%d, %d)", type, start, length);
        } else {
            return String.format("%s (%d, %d) (%d)", type, start, length, pairValue);
        }
    }

    @Override
    public int compareTo(Object o) {
        Token t = (Token) o;
        if (this.start != t.start) {
            return (this.start - t.start);
        } else if (this.length != t.length) {
            return (this.length - t.length);
        } else {
            return this.type.compareTo(t.type);
        }
    }

    /**
     * return the end position of the token.
     * @return start + length
     */
    public int end() {
        return start + length;
    }

    /**
     * Get the text of the token from this document
     * @param doc
     * @return
     */


}
