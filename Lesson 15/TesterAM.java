
/**
 * Write a description of class TesterAN here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TesterAM
{
    public static void main(String[] args)
    {
        double d = 9.0;
        
        Circle c1 = new Circle();
        
        Circle c2 = new Circle( 2 );
        
        Circle c3 = new Circle( 3 );
        
        System.out.println("The area of circle 1 is " + c1.area() );
        
        System.out.println("The area of circle 2 is " + c2.area() );
        
        System.out.println("The area of circle 3 is " + c3.area() );
        
    }
    
}
