import java.io.*;
import java.util.*;

/**
 * Write a description of class TesterPM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TesterPM
{
    public static void main(String[] args)
    {
        // Object oriented programming example of 2 circle objects
        Circle c = new Circle( 14.5 );
        Circle b = new Circle( 5.5 );

        //System.out.println("The first circle has area of " + c.area() + "." );

        //System.out.println("The second circle has circumference of " + b.circumference() + "." );

        // Input from the keyboard:

        Scanner kbReader = new Scanner( System.in );

        // Input an int
        //         System.out.print("Enter an integer: ");
        //         int i = kbReader.nextInt();
        //         System.out.println( i );
        //         
        //         // input a double
        //         System.out.print("Enter a double: ");
        //         double d = kbReader.nextDouble();
        //         System.out.println( d );
        //         
        //         // input a String
        //         System.out.print("Enter your name: ");
        //         String s = kbReader.next();
        //         System.out.println( s );

        // Accept multiple inputs in one line

        // If taking more than one input at a time, separate
        // your input values with a space.

        System.out.print("Enter your first name, followed by your age (in years): ");
        String name = kbReader.next();
        int age = kbReader.nextInt();
        System.out.println("Your name is " + name + ", and your age is " + age + "." );
        
        // Inputting an entire line of text:
        
        // Note:  We cannot mix using nextLine() with next()/nextInt()/nextDouble()
        // To fix:  Create a few Scanner object specifically for reading an entire line
        
        Scanner kbReader2 = new Scanner(System.in);
        
        System.out.print("Enter a full sentence: ");
        String sentence = kbReader2.nextLine();
        System.out.println("Your sentence is: " + sentence );

    }
}
