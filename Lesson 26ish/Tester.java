import java.text.*;
import java.io.*;
import java.util.*;

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
        // Formatting strings
        
        double d = 34.5;
        
        // let's round d to the nearest thousandths place:
        
        // One way that we've seen to do this is the following:
        double rounded = ((int)( d * 1000 + 0.5 ))/1000.0;
        
        System.out.println( rounded );
        
        
        // Here's a fancy way to round using a NumberFormat object
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits( 3 );
        nf.setMinimumFractionDigits( 3 );
        
        String s = nf.format( d );
        double rounded2 = Double.parseDouble( s ); // isn't needed unless we need to use as a double
        System.out.println( s );
        
        // setMaximumFractionDigits( 3 ) gives us NO MORE than 3 decimal places
        // setMinimumFractionDigits( 3 ) GUARANTEES at least 3 decimal places given.
        // Minimum is always considered less than the maximum.
        
        // nf.format( d )  returns a String, not a double.
        
        // If you needed the rounded number to be treated as an actual number, not a String,
        // you will need to convert that String into a double using Double.parseDouble
        
        
        // Other types of NumberFormat objects:
        // Notice above that the way we created a NumberFormat object was calling upon the
        // static method NumberFormat.getNumberInstance().  There are two other similar methods
        // that return NumberFormat objects. There are detailed below:
        
        // getCurrencyInstance()
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        String str = money.format( 81.097459 );
        System.out.println( str );
       
        
        // getPercentInstance()
        
        NumberFormat perc = NumberFormat.getPercentInstance();
        perc.setMaximumFractionDigits( 2 );
        perc.setMinimumFractionDigits( 2 );
        String str2 = perc.format( 1.044 );
        System.out.println( str2 );
        
        
        // Formatter class
            
        Formatter fmt = new Formatter();
        
        fmt.format( "My number is %1.2f, and my word is %s.", 237.456, "banana" );
        
        System.out.println( fmt.toString() );

        
        // Precision of decimal places
        
        // Using %9.2f = decimal floating point number in a field of 9 characters wide and
        // having 2 decimal places.  46238.123 will format as " 46238.12"
        
        // Using %9.2e = a scientific notation number in a field of 9 characters wide and
        // having 2 decimal places.  46238.123 will format as " 4.62e+04"
        
        // Using %.4g = either a decimal floating number or scientific notation (whichever
        // is shorter) having no minimum field width and having 4 significant digits.
        // 187.0853221 will format as "187.0853"
        
        // to test any of these, do the following:
        Formatter fmt2 = new Formatter();
        fmt2.format( "%.4g", 187.0853221 ); // only using 4 significant digits
        System.out.println( fmt2.toString() );
        
        // Using %6.8s = displays a String of at least 6 but not exceeding 8 characters long.
        // If the String is longer than the maximum, characters towards the end of the String
        // will be truncated.  "abc" formats as "   abc".  
        // "123456789A" formats as "12345678".
        
        // For left justification, use a minus sign:  %-9.2f = formats 72.45822 as "72.46    "
        
        // Pad with zeroes instead of using default spaces:  
        // %09.2f = formats 72.45822 as "000072.46"
        
        // Add appropriate commas to numerical values:  %-,10.2f = formats 1726.46 as "1,726.46  "
            
        
        
            
        
        
        
        
        
        
        
    }
}
