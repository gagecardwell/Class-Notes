
/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle
{
    // instance variables - replace the example below with your own
    private double radius;

    /**
     * Constructor for objects of class Circle
     */
    public Circle(double r)
    {
        radius = r;
        
    }
    
    public double area()
    {
       return Math.PI*radius*radius;
    }
    
    public double circumference()
    {
        return 2*Math.PI*radius;
    }
}
