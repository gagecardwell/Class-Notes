
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
        Circle c1 = new Circle( 3 );
        
        Circle c2 = new Circle( 6 );
        
        Circle c3 = new Circle( 9 );
        
        Circle c4 = new Circle();
        
        Circle c5 = new Circle();
        
        System.out.println( "The first circle's area is " + Math.round(c1.getArea()*100)/100.0 + "." );
        
        System.out.println( "The second circle's area is " + Math.round(c2.getArea()*100)/100.0 + "." );
        
        System.out.println( "The third circle's area is " + Math.round(c3.getArea()*100)/100.0 + "." );
        
        
        System.out.println( c1 == c2 ); // when comparing objects with ==, we are
                                        // comparing their memory locations
                              
        Circle cir = c1; // created a new pointer that points to the same location
                         // that c1 points to.
        
        System.out.println( c1 == cir ); // true
        
        System.out.println( c4 == c5 ); // false
        
        // System.out.println( c1.calculateDiameter() ); // error!  private method call
        
        
    }
}
