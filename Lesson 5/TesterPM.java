
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
        // Mixed Data Types, Casting, and Constants
        
        // Java does not like to lose data
        
        double d = 48.4765;
        
        // int i = d; // possible data loss if running this code!  ERROR
        
        int i = (int)d; // Casting d into an integer first, then saving that value to the int i.
        
        System.out.println(d);
        System.out.println(i);
        
        // Example of not losing data:
        
        int i2 = 67;
        
        int d2 = i2; // no loss of data
        
        
        
        // Example of mixed numbers in a computation
        
        int i3 = 4;
        double d3 = 3;
        
        System.out.println( i3/d3 ) ;  // the result is a double
        
        
        
        // Example  Casting numbers into doubles is also possible       
        double d4 = (double)5/4;
        
        // or you could do this:
        
        double d5 = 5.0/4;
        
        
        // Constants
        
        final double PI = 3.1415;
        
        final int NUM_OF_STUDENTS = 1;
        
        final String myName = "Brandon Bettes";
        
        
        
    }
}
