
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
        // Simple String Operations
        
        // Example 1  Concatenation
        String mm = "Hello";
        String nx = "good night";
        
        String c = mm + nx; // concatenation of 2 Strings (aka adding Strings)
        
        System.out.println( c );
        
        // Example 2  length method
        String theName = "Michael Jackson";
        
        int len = theName.length();  // prints 15, the number of characters in the String theName
        
        System.out.println( len );
        
        // Example 3  substring method
        String myPet = "Gutterball the dog";
        String smallPart = myPet.substring(4);
        System.out.println(smallPart);
        
        // Example 3.5 more substring
        String smallPart2 = myPet.substring(0, 4);
        System.out.println(smallPart2);
        
        // Example 4
        String movie = "Dude, where's MY car?";
        String movieAllCaps = movie.toUpperCase();
        System.out.println( movieAllCaps );
        System.out.println( movie.toLowerCase() );
        
        // Example 5 Concatenation with numbers
        double x = 35.92458768;
        String s = "I am not a crook!";
        String combo = s + x;
        
        System.out.println( combo );
        
        // Example 6  Escape Sequences for certain characters in Strings
        
        String sentence = "What \"is\" the right way?";  // Escape sequence for " is \"
        System.out.println( sentence );
        System.out.println( sentence.length() ); // prints 24
        
        System.out.println( "What is" + "\n" + "is your name?" ); // \n is escape sequence for end of line
        
        // Also, escape sequence for a \ is \\
        
        
        
    }
}
