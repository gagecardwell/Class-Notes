
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args)
    {
        // ASCII and char
        
        
        // How many chars are there in the ASCII (extended) table?  65536 = 2^16
        // chars use 16 bits, or 4 bytes
        
        // Things you can't do with chars
        
        // 1)
        String aString = "A";
        
        // char a = aString; // error
        // char a = (char)aString; // error
        
        // How can we convert the first letter of a String into a char?
        
        char a = aString.charAt(0);
        
        System.out.println( a );  // A

        
        // 2)
        
        // String x = a; // error, when 'a' is a char
        
        // String x = 't'; // error
        
        // How can we convert char into a String?
        
        String x = "" + a; // we can concatenate a char!
        System.out.println(x); // A
        
        // 3)
        
        int n = -1;
        char b = 'B';
        
        int y = n + b; // THIS IS LEGAL!
        
        char c = (char)n; // This is NOT legal!  
        
        System.out.println( c );
        
        // So how can we convert an int directly into a char?
        // (Assuming our int is between 0 and 65535)
        
        int j = 117;
        char d = (char)j;
        
        // Conversion of a capital letter into a lower case letter:
        
        char ch = 'X';
        
        // How would I convert ch to lower-case x?
        
        ch = (char)(ch + 32);
        
        System.out.println(ch);  // x
        
        
        // We can check if a char is a digit, a letter, a letter or digit, a whitespace, if it's lowercase,
        // and if it's uppercase.  But HOW?
        
        char cha = 'h';
        
        System.out.println( Character.isDigit( cha ) ); // false
        
        System.out.println( Character.isLetter( cha ) ); // true
        
        System.out.println( Character.isLetterOrDigit( cha ) ); // true
        
        System.out.println( Character.isWhitespace( cha ) ); // false
        
        System.out.println( Character.isLowerCase( cha ) ); // true
        
        System.out.println( Character.isUpperCase( cha ) ); // false
        
        
        
        
        
        
        
        
    }
}
