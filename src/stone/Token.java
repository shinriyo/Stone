package stone;

/**
 * Created by shinriyo on 2/26/16.
 */
public class Token {
    public static final Token EOF = new Token(-1){};
    public static final String EOL = "\n";
    private int lineNumber;

    protected Token(int line) {
        lineNumber = line;
    }

    public int getLineNumber() { return lineNumber; }
    public boolean isIdentifier() { return false; }
    public boolean isNumbwr() { return false; }

    public String getText() { return ""; }
}
