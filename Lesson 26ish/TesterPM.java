import java.util.*;
import java.io.*;
import java.text.*; // contains Formatter and NumberFormat classes

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
        // Formatting
        
        // NumberFormat class objects
        
        // 1st type of NumberFormat
        NumberFormat nbf = NumberFormat.getNumberInstance();
        nbf.setMaximumFractionDigits( 3 ); // gives us NO MORE THAN 3 decimal place
        nbf.setMinimumFractionDigits( 3 ); // GUARANTEES at least 3 decimal places
        double d = 34.982687;
        String s = nbf.format( d ); // nbf.format returns a String, not a double!
        // If we wanted to convert back into a double, we need to use Double.parseDouble
        System.out.println( s );
        
        // 2nd type of NumberFormat
        NumberFormat nbf2 = NumberFormat.getCurrencyInstance();
        double d2 = 45.678;
        System.out.println( nbf2.format(d2) );
        
        // 3rd type of NumberFormat
        NumberFormat nbf3 = NumberFormat.getPercentInstance();
        nbf3.setMaximumFractionDigits( 2 );
        nbf3.setMinimumFractionDigits( 2 );
        double d3 = 1.356;
        System.out.println( nbf3.format(d3) );
        
        // Another way to round to 4 decimal places:
        double d4 = 187.293638476;
        double rounded = ((int)( d4 *1000 + 0.5))/1000.0; // remember how to do this!
        System.out.println(rounded); // 187.294
        
        
        // Formatter class objects
                
        Formatter fmt = new Formatter();
        fmt.format( "My number is %-6.2f, and my String is %-10s.", 56.789, "banana" );
        System.out.println( fmt.toString() );
        
        // Precision using Formatter:
        
        // %9.3f = a decimal floating point number in a field 9 characters wide and having
        //         3 decimal places. 187.9207 formats as "  187.921"
        
        // %9.2e = a scientific notation number in a field 9 characters wide and having
        //         2 decimal places.  46238.123 formats as "4.62e+04"
        
        // %.4g = either a decimal floating number or a scientific notation number (whichever
        //        is shorter) having no minimum field width and having 4 significant digits
        //        187.08532111 formats as "187.1"
        fmt = new Formatter();
        fmt.format("%.4g", 187.08532111 );
        System.out.println( fmt.toString() );
        
        // %6.8s = A String of at least 6 but not exceeding 8 characters long.  If the String
        //         is longer than the maximum, the String is truncated.
        // "abc" formats as "   abc"
        // "123456789A" formats as "12345678"
        
        
        // Random example of something new
        
        System.out.printf( "My number is %-6.2f, and my String is %-10s.", 88.7953457, "apple" );
        
        // The printf method utilizes a Formatter without us needing to make one!
        
        
        
        
        
        
        
        
    }
}
