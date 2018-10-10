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
        // Advanced String methods
        
        // compareTo method
        
        String s1 = "dukes123414";
        String s2 = "dukesR";
        
        System.out.println( s1.compareTo(s2) ); // similar to computing s1 - s2, with values from
                                                // the ASCII table
                                                
        // indexOf and lastIndexOf
        
        String s3 = "Dukes of Hazzard of Hazzard County";
        int index = s3.indexOf("zz");
        System.out.println( index ); // 11
        
        int lastindex = s3.lastIndexOf("zz");
        System.out.println( lastindex ); // 22
        
        int index2 = s3.indexOf('H');
        System.out.println( index2 ); // 9
        
        int index3 = s3.indexOf(72, 10);
        System.out.println( index3 ); // 20
        
        int lastindex2 = s3.lastIndexOf("zz", 21);
        System.out.println( lastindex2 ); // 11
                
        // charAt method
        System.out.println( s3.charAt(25) ); // r
        
        
        // replace method
        String s4 = s3;
        
        s4 = s4.replace("Hazzard", "Garvin");
        System.out.println(s4);
        System.out.println(s3); // note that s3 has not changed.
        
        // Note:  You can also replace a char with another char
        s4 = s4.replace('a', 'v');
        System.out.println(s4);
        
        
        // trim method
        
        String s5 = "          \tYa    hoo    !!\t\t\t";
        
        System.out.println( s5.trim() );
        
        
        // contains method
        
        System.out.println( s3.contains("County") ); // true
        
        // startsWith method
        
        System.out.println( s3.startsWith("Dukes") ); // true
        System.out.println( s3.startsWith("Blargh") ); // false
        System.out.println( s3.startsWith("Hazzard", 9 )); // true
        
        
        // Parsing strings with a Scanner
        
        Scanner sc = new Scanner( "Have a good day." );
        
        System.out.println( sc.next() ); // Have
        System.out.println( sc.next() ); // a
        System.out.println( sc.next() ); // good
        System.out.println( sc.next() ); // day.
        
        sc = new Scanner( "Have a good day." );
        
        sc.useDelimiter("a");
        System.out.println( sc.next() );  //  H
        System.out.println( sc.next() );  // ve_    (The underscore is a space)
        System.out.println( sc.next() );  //  good d
        System.out.println( sc.next() );  // y.
        
        // How can we check to make sure the Scanner object has something left to read?
        sc = new Scanner( "Have a good day." );
        
        while( sc.hasNext() )
        {
            System.out.println( sc.next() );
        }
        

        System.out.println();
        sc = new Scanner("The Dukes of Hazzard of Hazzard County");
        sc.useDelimiter("zz");
        while( sc.hasNext() )
        {
            System.out.println( sc.next() );
        }
        
        
        System.out.println();
        sc = new Scanner("The Dukes of Hazzard of Hazzard County");
        sc.useDelimiter("e|a" );
        while( sc.hasNext() )
        {
            System.out.println( sc.next() );
        }
        
        
        System.out.println();
        sc = new Scanner("The Dukes of Hazzard of Hazzard County");
        sc.useDelimiter("\\s" );
        while( sc.hasNext() )
        {
            System.out.println( sc.next() );
        }
        // Other Regex values include:  | means 'or'
        //                              \\s means 1 whitespace
        //                              \\s+ means 1 or more whitespaces
        //                              \\s* means 0 or more whitespaces
        
        // Regex examples:
        System.out.println();
        String reg = "r\\s+test";  // Any substring that starts with r followed by 1 or more whitespaces,
                                   // followed by the word test
        sc = new Scanner("Four tests ago, I was your     testing partner.");
        sc.useDelimiter( reg );
        while( sc.hasNext() )
        {
            System.out.println( sc.next() );
        }
        
        // The skip method of Scanner
        System.out.println();
        sc = new Scanner("Dukes of Hazzard of Hazzard County");
        int count = 0;
        
        System.out.println( sc.next() ); // Dukes
        sc.skip( "\\s*of" );
        System.out.println( sc.next() ); // Hazzard
        sc.skip( "\\s*of" );
        System.out.println( sc.next() ); // Hazzard
        System.out.println( sc.next() );  // County
        
        // A quirk about delimiters:
        System.out.println();
        String sss = "abcxyxyxydef";
        Scanner scan = new Scanner( sss );
        scan.useDelimiter( "xy" );
        while( scan.hasNext() )
        {
            System.out.println( scan.next() );
        }
        
        
    }
}
