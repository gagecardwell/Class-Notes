
/**
 * Write a description of class Recipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Recipe
{
    // instance variables - replace the example below with your own
    public int calories;
    public int carbs;
    public int fat;
    public String name;
    private double cost;

    /**
     * Constructor for objects of class Recipe
     */
    public Recipe(String name)
    {
        // initialise instance variables
        this.name = name; // Note:  'this.name' refers to the instance variable, whereas
                          // plain ol 'name' refers to the parameter variable         
        calories = 0;
        carbs = 0;
        fat = 0;
        cost = 0;
    }

    public void setServings( int x )
    {
        // pretend there's some code here that does something....
    }
    
    public double getRetailCost()
    {
        // some code up here
        
        int x = 13;
        double tempCost = pricePerCalorie(x)*calories + cost; // we can call a private method
                                                              // that is inside the same class
        
        // some more code down here
        
        return 0.0;
    }
    
    private double pricePerCalorie( int z )
    {
        // pretend there's some code here that does something....
        
        return 0.0;
    }

}
