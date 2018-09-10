
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
        // Example 1
        int z = TesterPM.squareIt( 5 );
        
        System.out.println(z); //25
        
        // Example 2
        
        System.out.println( multiply(5.5, 4.1) ); // 22.55
        
        // Example 3
        
        printMyName( "Bob" );
        
        
        // Example of Math methods
        
        double d = -379.22;
        System.out.println( Math.abs(d) ); // 379.22
        
        double b = 42.01;
        double e = 3.728;
        System.out.println( Math.pow( b, e ) ); // 1126831.027
        
        double d2 = 2034.56;
        double d3 = Math.sqrt(d2); // 45.10609715
        System.out.println( d3 );
        
        System.out.println( Math.ceil(1.4) ); // 2.0
        
        System.out.println( Math.ceil(-1.6) ); // -1.0
        
        System.out.println( Math.floor(1.4) ); // 1.0
        
        System.out.println( Math.floor(-1.6) ); // -2.0
        
        double d4 = Math.log(7.89); // log(7.89) base e = 2.065596135
        System.out.println(d4);
        
        System.out.println( Math.min( 4782.756, -799.0 ) ); // -799.0
        
        System.out.println( Math.max( 4782.756, -799.0 ) ); // 4782.756
        
        System.out.println( Math.round( 4782.756 ) ); // 4782
        
        System.out.println( Math.round( 148.2 ) ); // 148
        
        System.out.println( Math.round( 148.7 ) ); // 149
        
        System.out.println( Math.round( -148.2 ) ); // -148
        
        System.out.println( Math.round( -148.7 ) ); // -149
        
        System.out.println( Math.round( -147.5 ) ); // -147
        
        System.out.println( Math.round( 147.5 ) ); // 148
        
        System.out.println( Math.PI );
        
        // Example of trig methods
        
        double angle = 45; // (in degrees)
        
        double angleInRadians = Math.toRadians( angle );
        
        double sinValue = Math.sin( angleInRadians );
        
        System.out.println( "Sine of " + angle + " degrees is " + sinValue );
        
        System.out.println( "Cosine of " + angle + " degrees is " + Math.cos( angleInRadians ) );
        
        System.out.println( "Tangent of " + angle + " degrees is " + Math.tan( angleInRadians ) );
        
    }
    
    public static int squareIt( int x ) // Signature of the method
    {
        int y = x * x;
        return y;
    }
    
    public static double multiply( double x, double y )
    {
        return x * y;
    }
    
    public static void printMyName( String s )
    {
        System.out.println( "My name is " + s + "." );
    }
    
    
}
