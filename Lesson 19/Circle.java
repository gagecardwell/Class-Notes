
/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle
{
    private double radius;
    
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
