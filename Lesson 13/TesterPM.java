
/**
 * Write a description of class TesterPM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TesterPM
{
    public static void main(String[] args)
    {
        // ASCII and chars
        
        // The total number of chars from the ASCII (extended) table is 65536 = 2^16.
        // This  means that a char uses 16 bits of memory, or 4 bytes.
        
        // Here's a few things you CANNOT do with chars:
        
        // 1)  Conversion from String to char and vice-versa?
        
        String aString = "R";
        
        // char r = aString; // compile-time error, incompatible types
        // char r = (char)aString; // compile-time error, incompatible types
        // String st = 'R'; // compile-time error
        
        // How can we convert the first letter of a String into a char?
        // And how can we convert a char into a String?
        
        char r = aString.charAt(0);
        
        String st = "" + 'R';
        
        // 2) Conversion from int to char and vice-versa?
        
        int x = 1;
        char a = 'A';
        
        int y = x + a; // VALID!
        
        //char c = x + a; // NOT VALID!
        char c = (char)(x + a); // type casting will work, assuming the value x + a is within range
        
        int z = a; // VALID!

        // Things we can do with chars:
        
        // Conversion from capital letters to lower case and vice versa:
        
        char ch = 'T';
        
        ch = (char)(ch + 32);       
        System.out.println( ch );
        
        // We can determine the type of character, that is, is it a digit?  Is it a letter?
        // Is it a whitespace?  Is it a letter or digit?
        
        char cha = 'a';
        
        System.out.println( Character.isDigit( cha ) ); // false
        
        System.out.println( Character.isLetter( cha ) ); // true
        
        System.out.println( Character.isWhitespace( cha ) ); // false
        
        System.out.println( Character.isLetterOrDigit( cha ) ); // true
        
        System.out.println( Character.isUpperCase( cha ) ); // false
        
        System.out.println( Character.isLowerCase( cha ) ); // true
        
    }
}
