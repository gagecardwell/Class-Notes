
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
    private double cost;
    public String name;

    /**
     * Constructor for objects of class Recipe
     */
    public Recipe(String name)
    {
        this.name = name; // this.name is the instance variable name
        calories = 0;
        carbs = 0;
        fat = 0;
        cost = getRetailCost();
    }
    
    public void setServings( int x )
    {
        // pretend there's a bunch of code here that does something cool
        
    }
    
    public double getRetailCost()
    {
        // some code here that does stuff...
        
        int x = 20;
        double tempCost = pricePerCalorie(x)*calories + cost;
        
        // code that does more stuff...
        
        return tempCost;
    }
    
    private double pricePerCalorie( int z )
    {
        // some code that does stuff.....
        
        return z/5.0;
    }
    

    
}
