
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
    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI*radius*radius;
    }

    public double getCircumference()
    {
        return 2*Math.PI*radius;
    }

    public void setRadius(double newradius)
    {
        this.radius = newradius;
    }

    public boolean equals( Object o )
    {
        if(o instanceof Circle)
        {
            Circle c = (Circle)o;
            
            if( c.radius == this.radius )
                return true;
        }

        return false;
    }

    
}
