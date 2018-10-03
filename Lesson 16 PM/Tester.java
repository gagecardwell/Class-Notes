
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
        
        // Example 1: creating objects that have public and private info
        
        Recipe r1 = new Recipe("Broccoli Cheese Rice Casserole");
        
        r1.calories = 2500;
        r1.carbs = 2000;
        r1.fat = 1000;
        // r1.cost = 15; we cannot access private instance variables in other classes
        
        r1.setServings( 7 );
        
        System.out.println("The cost of " + r1.name + " is " + r1.getRetailCost() + ".");
        
        Recipe r2 = new Recipe("Pumpkin Pie");
        
        if( r1.calories == r2.calories )
            System.out.println("yay");
            
        // Example 2  On the board, Anonymous objects
        
        // Example 3  Comparing 2 objects
        
        Circle c1 = new Circle( 3 );
        
        Circle c2;
        
        c2 = c1;
        
        System.out.println( c2 == c1 ); // true, the == operator compares memory location only
        
        Circle c3 = new Circle( 3 );
        
        System.out.println( c2 == c3 ); // false, c2 and c3 and pointing to two different 
                                        // circles in memory
        
        //c2.setRadius( 5 );
        
        System.out.println("The first circle's area is " + c1.area() );
        System.out.println("The second circle's area is " + c2.area() );
        System.out.println("The third circle's area is " + c3.area() );
        
        
        // Example 4  Another way to compare objects
        
        // Recall how we compare Strings
        
        String s1 = "Bob";
        String s2 = new String("Bob");
        
        if( s1.equals( s2 ) )  // the equals method of String compares actual letters in the Strings
            System.out.println("They are the same");
            
        if( s1 == s2 ) // Using == will compare memory location only, just like other objects
            System.out.println("They are the same, again");
        
        // Back to Circles:
        
        if( c2.equals(c3) ) // This works exactly like using ==, unless we redefine the equals method
            System.out.println("c2 is the same as c3");
            
        // Example 5  On the board
            
    }
}
