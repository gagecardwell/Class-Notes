import java.util.Scanner;

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
        // Lesson 17: Advanced String methods
        
        
        // Example:  The compareTo method
        
        // s1.compareTo(s2) would be 0 if s1 has the same exact characters in order as s2
        
        // s1.compareTo(s2) would be negative if s2 comes after s1 when ordered by their
        // letters' ASCII values (from least to greatest)
        
        // s1.compareTo(s2) would be positive if s2 comes before s1 when ordered by their
        // letters' ASCII values (from least to greatest)
        
        // This comparison is made by each individual letter of each String starting
        // at index 0.
       
        String s1 = "The Dukes of Hazzard of Hazzard County";
        
        String s2 = "Yes";
        
        System.out.println( s1.compareTo(s2) ); // a negative number
        
        String s3 = "The Dukes";
        
        System.out.println( s1.compareTo(s3) ); // a positive number
        // The longer String would come first if all letters are the same
        // up to a certain point.
        
        System.out.println( s1.compareTo( s1 ) ); // 0
        
        System.out.println( "Haha".compareTo( "Hehe" ) );  // a negative
        
        
        // Example:  indexOf method
        
        // s1.indexOf(s2) returns the first occurrence of s2 occurring in the String s1.
        
        String s4 = "Dukes";
        
        System.out.println( s1.indexOf( s4 ) ); // 4
        
        System.out.println( s1.indexOf( "zzz" ) ); // -1, not found
        
        System.out.println( s1.indexOf( "zz" ) ); // 15
        System.out.println( s1.indexOf( "zz", 16 ) ); // 26
        
        
        
        // Example:  lastIndexOf method
        
        System.out.println( s1.lastIndexOf( "zz" ) ); // 26
        
        System.out.println( s1.lastIndexOf( "zz", 25 ) ) ;// 15
        
        
        // Example:  charAt method
        
        char myChar = s1.charAt( 2 ); 
        System.out.println( myChar ); // e
        
        
        // Example: replace method
        
        String s5 = s1.replace( "Dukes", "Nerds" );
        
        System.out.println( s5 ); // The Nerds of Hazzard of Hazzard County
        
        String s6 = s1.replace( 'z', 'b' );
        
        System.out.println( s6 ); // The Dukes of Habbard of Habbard County
        
        // Example:  trim method
        
        String s7 = "             I have spaces        \t\t\t";
        
        System.out.println(s7);
        System.out.println( s7.trim() );
        
        
        // Example: contains method
        
        
        System.out.println( s1.contains("Dukes") ); // true
        System.out.println( s1.contains("calculus") ); // false
        
        
        // Example startsWith method
        
        System.out.println( s1.startsWith("The Dukes of") ); // true
        System.out.println( s1.startsWith("Dukes") ); // false
        
        System.out.println();
        // Parsing Strings with a Scanner
        
        Scanner sc = new Scanner( s1 );
        
        while( sc.hasNext() )
        {
            System.out.println( sc.next() );
        }
        
        // "The Dukes of Hazzard of Hazzard County"
        
        System.out.println();
        // We can change how the Scanner stops between input values.
        // This is called changing the delimiter of the Scanner object.
        // The default delimiter is any whitespace.
        
        // re-initialize the scanner object sc:
        sc = new Scanner( s1 );
        
        sc.useDelimiter( "zz|e" ); // uses "zz" and "e" for the new delimiter
        
        while( sc.hasNext() )
        {
            System.out.println( sc.next() );
        }
        System.out.println();
        
        // Something strange:
        
        String ss = "abcxyxydef";
        
        Scanner sc2 = new Scanner( ss );
        
        sc2.useDelimiter( "xy" );
        
        while( sc2.hasNext() )
        {
            System.out.println( sc2.next() );
        }
        

    }
}
