package Oct.Ex_10_10_2024;

public class Lab002_LiteralExamples {
    public static void main(String[] args) {
        //_______Integer Literals______
        //a) Decimal: Base 10
        int decimal = 8;

        //Hexadecimal: Base 16, prefixed with 0x or 0X
        int hex = 0x1A;

        //Octal: Base 8, prefixed with 0 (07,077)
        int octal = 0;

        //Binary: Base 2, prefixed with 0b or 0B
        int bina = 0B1010;
        System.out.println("_______Integer Literals______");
        System.out.println("Integer Literals - Decimal: Base 10 - " + decimal);
        System.out.println("Integer Literals - Hexadecimal: Base 16 - " + hex);
        System.out.println("Integer Literals - Octal: Base 8 - " + octal);

        //________Floating-Point Literals______
        //a) double Literals (default):
        // Decimal form, default to double
        double pi = 3.14;

        // Exponential form, equivalent to 1.0 * 10^3 (i.e., 1000)
        double exponent = 1.0e3;

        //Negative decimal literal
        double negative = -0.15;

        //b)float Literals (using 'f' or 'F' suffix):
        // Decimal form with 'f' to indicate float
        float gravity = 9.8f;

        //Exponential form, equivalent to 1.2 * 10^-5
        float small = 1.2e-5F;

        System.out.println("________Floating-Point Literals______");
        System.out.println("double Literals (default):Decimal form, default to double - " + pi);
        System.out.println("double Literals (default):Exponential form - "+ exponent);
        System.out.println("double Literals (default):Negative decimal literal - "+ negative);
        System.out.println("float Literals, Decimal form with 'f' to indicate float - "+ gravity);
        System.out.println("float Literals, Exponential form - "+ small);

        //__________Character Literals__________
        //a)Single Character Literal: - Enclosed in single quote(' ') and hold single character
        //Single alphabetic character
        char letter = 'A';

        //Numeric Character
        char numeric = '2';

        //char symbol
        char symbol ='@';

        //b)Escape Sequence Literals:
        char newline = '\n';    // Newline character
        char tab = '\t';        // Tab character
        char singleQuote = '\''; // Single quote character
        char backslash = '\\';   // Backslash character

        //c)Unicode Character Literals:Every character have their unicode
        char unicodeChar = '\u0041';  //Unicode for character 'A'
        char smileyFace = '\u263A'; //Unicode for Smiley Face '☺'

        System.out.println("__________Character Literals__________");
        System.out.println("Single alphabetic character - " + letter);
        System.out.println("Numeric Character - " + numeric);
        System.out.println("char symbol - " + symbol);
        System.out.println("Escape Sequence Literals: - " + newline);
        System.out.println("Escape Sequence Literals: - " + tab);
        System.out.println("Escape Sequence Literals: - " + singleQuote);
        System.out.println("Escape Sequence Literals: - " + backslash);
        System.out.println("Unicode Character Literals:" + unicodeChar);
        System.out.println("Unicode Character Literals:" + smileyFace);

        //____________String Literals___________
        //A sequence of characters enclosed in double quotes(" ")
        //a)Plain Text Strings:
        String PlainText = "Hello World";

        //b)String with Escape Sequences:
        // Includes newline and tab
        String multipleText = "Hello\nWelcome to Java Classes\tHave Fun Learning";

        //c)String with Unicode Characters:
        //String with Unicode character
        String AddUnicode = "Smiley Unicode Added Here \u263A";

        //d)Empty String - valid with 0 character
        String empty = "";

        System.out.println("____________String Literals___________");
        System.out.println("Plain Text Strings - " + PlainText);
        System.out.println("String with Escape Sequences:Includes newline and tab - " + multipleText);
        System.out.println("String with Unicode character - " + AddUnicode);
        System.out.println("Empty String - " + empty);

        //___________Boolean Literals_________
        boolean isJavaFun = true;      // A boolean literal 'true'
        boolean isRainy = false;       // A boolean literal 'false'

        System.out.println("A boolean literal 'true' - " + isJavaFun);
        System.out.println("A boolean literal 'false' - " + isRainy);

        //__________Null Literal_________
        String str = null; // str does not reference any String object

        System.out.println("__________Null Literal_________");
        System.out.println("The special literal null represents the null reference - " + str);

    }
}
