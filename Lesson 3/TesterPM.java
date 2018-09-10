
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
        // Simple String Operations
        System.out.println("water".substring(1,3) );
        // Example 1 Concatenation
        String mm = "Hello";
        String nx = "good night";
        
        String c = nx + mm;  // concatenation of 2 Strings (aka adding Strings)
        
        System.out.println( c );
        
        // Example 2  length method of String
        
        String theName = "George Washington";
        
        int len = theName.length(); // 17, the number of characters in the String
        System.out.println(len);
        
        // Example 3  substring method
        String myPet = "Gutterball the dog";
        String smallPart = myPet.substring(4);
        System.out.println(smallPart);
        
        // Example 3.5  more substring
        String smallPart2 = myPet.substring(0, 4);
        System.out.println(smallPart2);
        
        // Example 4  Capitalization & lower case?
        String movie = "Dude, where's MY car?";
        String movieAllCaps = movie.toUpperCase();
        System.out.println(movieAllCaps);
        System.out.println( movie.toLowerCase() );
        
        // Example 5  Concatenation with numerical values
        int x = 42;
        String s = "Sticks and stones may break my bones and blah blah blah...";
        String combo = s + x;
        System.out.println(combo);
        
        // Example 6  Escape sequences for special characters such as
        // ", \, end of line character, and tabs.
        String sentence = "What \"is\" the right way?\n\tIs it like this?";
        System.out.println( sentence );
        
        
        
        
        
    }

}
