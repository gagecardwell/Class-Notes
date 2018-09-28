
/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle
{
    // instance variables aka state variables aka instance fields
    private double radius;

    // constructor method
    public Circle(double r)
    {
        radius = r;
    }
    
    // we can have more than one constructor method
    // default constructor (takes no arguments)
    public Circle()
    {
        radius = 1; //default radius is 1
    }
    
    // methods that calculate different things a circle would have:
    public double area()
    {
        return Math.PI*radius*radius;
    }
    
    public double circumference()
    {
        return 2*Math.PI*radius;
    }
    
    // setter method for the instance variable radius
    public void setRadius( double newradius )
    {
        radius = newradius;
    }
    
    // getter method for the instance variable radius
    public double getRadius()
    {
        return radius;
    }
    
}
