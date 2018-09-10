
/**
 * Write a description of class TesterAM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TesterAM
{
    public static void main(String[] args)
    {
        int x = 6, y = 50;
        
        
        boolean b1 = ( (x < 10) && (y > 100) ); // false
        boolean b2 = ( (x < 10) && (y == -3) ); // false
        boolean b3 = ( (x < 10) || (y > 100) ); // true
        boolean b4 = ( (x < 10) || (y == -3) ); // true
        
        // boolean operators:  && is AND, || is OR
        
        // Examples of boolean computations:
        
        System.out.println( !true ); // false
        
        System.out.println( !false ); // true
        
        System.out.println( !(3 < 5) ); // false
        
        System.out.println( !( 1 == 0 ) ); // true
        
        System.out.println( (false && true || false)  ); // false
        
        System.out.println( 5.0 == 5 ); // true
        
        System.out.println( 5.1 == 5 ); // false
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
