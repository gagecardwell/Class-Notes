
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
        // Mixed Data Types, Casting, and Constants
        
        // Java does not like to lose information.
        // Example:
        
        //double d = 29.576689;
        //int i = d; // possible loss of information!  error
        
        // We can force Java to make the above code work.
        
        double d = 29.576689;
        int i = (int)d;  // "casts" d into an integer
        
        
        // Example of when there is no loss of information:
        
        int j = 105;
        double f = j;  // Casting is not needed when converting int to double
        
        
        // Example of math operations that use two number types:
        
        int a = 4;
        double g = 3;
        double ans = a/g; // 1.333333333
        System.out.println(ans);
        // note that since g is a double, a/g will be computed as a double.
        
        
        // Two similar examples:
        
        double d2 = (double)5/4;
        System.out.println(d2); // prints 1.25
        
        
        int j1 = 5;
        int k1 = 4;
        double d3 = (double)(j1/k1); 
        System.out.println( d3 ); // prints 1.0
        
        
        // Constants
        
        // Declaring a constant
        
        final double PI = 3.14159;
        
        // PI = 3; // error!  cannot change because PI was declared as final
        
        final String myName = "Brandon Bettes";
        
        final int NUM_STUDENTS;
        NUM_STUDENTS = 7;
        
        
    }
}
