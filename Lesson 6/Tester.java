
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
        // Example 1
        int z = Tester.addOne(50);
        System.out.println( z ); // 51
        
        // Example 2
        System.out.println( squareIt(4.4) ); // 17.6?
        // Example 3
        printMyName("Bob");
        
        // Examples of Math class methods
        
        double d = -567.123;
        System.out.println( Math.abs(d) ); // 567.123
        
        double b = 42.01;
        double e = 3.728;
        System.out.println( Math.pow( b, e ) ); // 1126831.027
        
        double d2 = 5040.67;
        System.out.println( Math.sqrt(d2) ); // 70.99767602
        
        System.out.println( Math.ceil(1.4) ); // 2.0
        
        System.out.println( Math.ceil(-1.4) ); // -1.0
        
        System.out.println( Math.ceil(-3) ); // -3.0
        
        System.out.println( Math.floor(1.4) ); // 1.0
        
        System.out.println( Math.floor(-1.4) ); // -2.0
        
        System.out.println( Math.ceil(-3) ); // -3.0
        
        System.out.println( Math.ceil(-1.4) ); // -1.0
        
        System.out.println( Math.ceil(-3) ); // -3.0
        
        System.out.println( Math.floor(1.4) ); // 1.0
        
        System.out.println( Math.floor(-1.4) ); // -2.0
        
        System.out.println( Math.ceil(-3) ); // -3.0
        
        double d3 = 7.89;
        System.out.println( Math.log(d3) ); // 2.065596135
        
        double x = 2038.5, y = -8999.1;
        System.out.println( Math.min( x, y ) ); // -8999.1
        System.out.println( Math.max( x, y ) ); // 2038.5
        
        System.out.println( Math.round( x ) ); // 2039
        System.out.println( Math.round( y ) ); // -8999
        
        System.out.println( Math.round( -148.5 ) ); // -148
        
        System.out.println( Math.round( -148.7 ) ); // -149
        
        System.out.println( Math.PI );
        
    }
    
    public static int addOne( int x ) // Signature of the method
    {
        int y = x + 1;
        
        return y;
    }
    
    public static double squareIt( double x )
    {
        return x*x;
    }
    
    public static void printMyName( String s )
    {
        System.out.println( "My name is " + s + "." );
    }
    
}
