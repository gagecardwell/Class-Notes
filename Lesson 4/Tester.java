
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
        // Using Numeric Variables
        
        // Example 1  Declaring and Initializing numeric variables
        int i = 3; // The = sign is called the Assignment Operator
        // Data flows from right to left ONLY.
        
        // Not Correct:
        // 3 = i;
        
        i = 10;  // Reusing the same variable
        
        double d;  // Declared d as a double (not initialized yet!)
        d = 76.9;  // Initialize d to 76.9
        
        double j = d * 4; // j is declared and initialized to 76.9 * 4
        
        // Example 2  Mutiple Declarations in one line
        int a, b, c;
        a = 0;
        b = 1;
        c = 2;
        
        double x = 3.5, y = 5.5, z = 10.76;
        
        // Example 3  PEMDAS on +, -, *, /, %
        
        System.out.println( 5%2 ); // 1
        
        System.out.println( 5 + 3 * 4 - 7 ); // 10
        
        System.out.println( 10 - 5 * 6 / 3 + ( 5 - 6 ) ); // -1
        
        System.out.println( 6 * 5 % 3 ); // 0 
        System.out.println( 5 * 6 % 3 ); // 0
        System.out.println( 6 * (5 % 3) ); // 12
        
        // Example 4  Adding to the current value of a variable
        
        int count = 5;
        
        // let's assign a new value to count, and let that value be
        // the old value of count + 3
        count = count + 3; // used a LOT.
        
        // count has value 8 at this point
        
        // Example 5  Incrementing and Decrementing by 1
        
        int w = 1;
        w = w + 1;
        w++; // this means w = w + 1, incrementing w by 1
        ++w; // this also means w = w + 1, but slightly different!
        w--; // this means w = w - 1, decrementing w by 1
        --w; // this also means w = w - 1, but slightly different!
        
        // At this line of code, w has value 2.
        System.out.println(w); // 2
        
        // If the ++ comes before the variable, the increment is done
        // before the line of code is ran.
        
        System.out.println( ++w ); // 3
        
        // If the ++ comes after the variable, the increment is done
        // after the line of code is ran.
        
        System.out.println( w++ ); // 3
        System.out.println( w );  // 4
        
        
        // Example 6  Incrementing/Decrementing by larger values
        
        int q = 0;
        
        q += 3; // this means q = q + 3;
        
        q -= 3; // this means q = q - 3;
        
        q *= 3; // this means q = q * 3;
        
        q /= 3; // this means q = q / 3;
        
        q %= 3; // this means q = q % 3;
        
        q = 409;
        
        q += 5;
        System.out.println( q ); // 414
        
        double k = 20.3;
        double m = 10.0;
        
        m *= k - 1; // means m = m * ( k - 1 );
        
        System.out.println( m ); // prints 193.0
        
        // Random example
        
        int g = 78;
        int p = 2 + g++;
        System.out.println( "p=" + p + ", g=" + g ); // p=80, g=79
        
        // One last weird example:  integer division in Java
        
        int r = 5;
        int s = 2;
        
        System.out.println( r / s ); // 2
        
        System.out.println( (r*1.0) / s ); // 2.5
        
        
        
    }
}
