
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
        // Using Numeric Variables
        
        // Example 1  Declaring and Initializing numeric vars
        int i = 9;  // = is called the assignment operator
        
        // Not Correct:
        // 9 = i;
        
        double d;
        double j = 68.3;
        d = j; // this is ok, d is a variable not just a value
        
        
        // Example 2  Multiple declarations in one line
        int a, b, c;
        a = 0;
        b = 1;
        c = 2;
        
        double x=3.5, y=6.7, z=8.9;
        
        
        // Example 3   PEMDAS on +, -, *, \, %
        
        System.out.println( 5%3 );// prints 2
        
        System.out.println( 5 + 3 * 4 - 7 ); // prints 10
        
        System.out.println( 10 - 5 * 6 / 3 + ( 5 - 6 ) ); // prints -1
        
        System.out.println( 6 * 5 % 3 ); // prints 0
        
        // Example 4
        
        int count = 1;
        
        count = count + 3; // this is used a lot!
        // this means: count is assigned to the current value of count + 3
        
        System.out.println( count ); // prints 4
        
        // Example 5
        
        int w = 1;
        w = w + 1;
        w++; // this means w = w + 1, this is called incrementing by 1
        w--; // this means w = w - 1, decrementing by 1
        ++w; // this also means w = w + 1, but slightly different!
        --w; // this also means w = w - 1, but slightly different!
        
        // At this line of code, w has value of 2.
        System.out.println(w); // 2
        
        System.out.println( ++w ); // adds 1 to w, then prints the value of w
        
        System.out.println( w++ ); // prints the current value of w, then adds 1 to w.
        
        System.out.println(w); // 4
        
        // if the ++ comes before the variable, the increment is done before the
        // line of code is ran.
        // if the ++ comes after the variable, the increment is done after
        // the line of code is ran.
        
        // Example 6
        
        int g = 0;
        
        g += 3; // g = g + 3
        
        g -= 3; // g = g - 3;
        
        g *= 3; // g = g * 3;
        
        g /= 3; // g = g / 3;
        
        g %= 3; // g = g % 3;
        
        g = 409;
        g += 5; // g = g + 5
        System.out.println( g ); // prints 414
        
        double k = 20.3;
        double m = 10.0;
        m *= k-1; // means m = m * (k-1)
        
        System.out.println(m); // prints 193.0
        
        // Random example
        int q = 78;
        int p = 2 + q++;
        System.out.println("p=" + p + ", q=" + q); // p=80, q=79
        
        // One last weird example: Integer division truncation
        int r = 5;
        int s = 2;
        
        System.out.println( r/s ); // prints 2
        
        System.out.println ( 5.0/2 ) ;// prints 2.5
        
        
        
    }
}
