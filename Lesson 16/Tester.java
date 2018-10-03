
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
        // public and private access to instance variables and (non-static) methods
        
        // Example 1:  Also see the Recipe class
        Recipe yummyStuff = new Recipe("Broccoli Cheese Casserole");
        
        // We can access any public instance variable like this:
        yummyStuff.calories = 2500;
        yummyStuff.carbs = 1000;
        yummyStuff.fat = 40;
        System.out.println( yummyStuff.name );
        
        // yummyStuff.cost = 30; // Note that since cost is private, this line
                                 // does not compile.
                                 
        // We can access any public method like this:
        yummyStuff.setServings( 20 );
        
        // yummyStuff.pricePerCalorie( 1 ); // Note that since pricePerCalorie is private, 
                                            // this line does not compile.
        
        // Example 2: Declaring and Initializing objects on separate lines
        // (on the board)                                 
                                            
        // Example 3: Anonymous objects (objects that aren't given a variable name)
        // (on the board)
        
        // Example 4:  Setting two objects equal to each other:
        
        Circle c1 = new Circle( 4.5 );
        Circle c2;
        
        c2 = c1; // c1 and c2 are variable names, and this line code point them to the same object
                 // in memory
                 
        c2.setRadius(9);
                 
        System.out.println("The first circle's area is " + c1.getArea() );
        System.out.println("The second circle's area is " + c2.getArea() );
        
        // Example 5: Determine if two objects are equal
        
        System.out.println( c1 == c2 ); // are these two objects pointing to the same location in 
                                        // memory?
        Circle c3 = new Circle( 9 );
        
        System.out.println( c2 == c3 ); // false, different locations in memory
        
        
        // Example 6: Another way to compare objects
        
        System.out.println( c2.equals( c3 ) ); // every object has a default equals method.
                                               // The equals method only checks memory location
                                               // but we can change this if we want....
                                               
        // Recall how comparing Strings works:
        String s1 = "Bobcat Goldthwait";
        String s2 = "Bobcat Goldthwait";
                                               
        System.out.println( s1 == s2 ); // true...but WHY?  String Constant Pool
        
        s2 = "Bobcat";
        
        System.out.println( s1 == s2 ); // false
        
        // To be safe, always use the equals method to compare Strings or other types of objects.
        
        // We can define how the equals method works in our custom classes, like Circle.
        
        System.out.println( c2.equals( c3 ) ); // true
        
        
        // Example 7  Constructors of classes
        
        // When calling a constructor for a class, such as:
        
        // ClassA obj = new ClassA( "Yes", 5 );
        
        // The parameters (the String and the int) must match exactly with one of the 
        // constructors of the ClassA class.  The order of the types will matter.
        // We will have to make sure that the ClassA class has a constructor with those
        // two parameters.
        
        // Exception:  A constructor with no arguments does not need to be defined.
        // However, it is good practice to always include a defined empty parameter constructor.
        
        // ClassA obj = new ClassA();
        
        // If we have a constructor with parameters already defined, then we MUST define the 
        // constructor that has no parameters.  The class will not have one automatically defined
        // for us.
        
        
        
        
    }
}
