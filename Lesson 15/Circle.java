
/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle
{
    // state variable, instance variable, or instance fields
    private double radius;
    
    // Constructor method
    public Circle( double r )
    {
        radius = r; // initialize any state variables
    }
    
    // Note:  Constructor methods are always public
    // You can have more than one constructor, as long as the parameters are different
    
    // default constructor (no arguments)
    public Circle()
    {
        radius = 1;
    }
    
    // Most methods we make are public, but we can have private methods occasionally
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    
    public double getCircumference()
    {
        return Math.PI * calculateDiameter();
    }
    
    public double getDiameter()
    {
        return calculateDiameter();
    }
    
    // This private method cannot be accessed outside of the Circle class
    private double calculateDiameter()
    {
        return 2*radius; // pretend this is a very complicated calculation that is used
                         // more than once in the Circle class.
    }
}
