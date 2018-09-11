import java.util.*;
import java.io.*;

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
        // Making decisions

        // Example 1:  If statement

        // Get a grade from the keyboard/user
        //         System.out.print("Enter the grade here: ");
        //         Scanner kb = new Scanner(System.in);
        //         
        //         double grade = kb.nextDouble();
        //         
        //         // check to see if this grade is an A:
        //         if( grade >= 85 )
        //         {
        //             System.out.println("This grade is an A");
        //         }

        // Example 2:  If/else statement
        //         System.out.print("Enter the grade here: ");
        //         Scanner kb2 = new Scanner(System.in);
        // 
        //         double grade2 = kb2.nextDouble();
        // 
        //         // check to see if this grade is an A:
        //         if( grade2 >= 85 )
        //         {
        //             // This code will run if (grade2 >= 85) is true
        //             System.out.println("This grade is an A");
        //         }
        //         else
        //         {
        //             // This code will run if (grade2 >= 85) is false
        //             System.out.println("This grade is below an A");
        //         }

        // Example 3:  If/elseif statement (chain of if/elseif/elseif statements)

        //         System.out.print("Enter the grade here: ");
        //         Scanner kb2 = new Scanner(System.in);
        // 
        //         double grade2 = kb2.nextDouble();
        // 
        //         // check to see if this grade is an A:
        //         if( grade2 >= 85 )
        //         {
        //             // This code will run if (grade2 >= 85) is true
        //             System.out.println("This grade is an A");
        //         }
        //         else if( grade2 >= 75 )
        //         {
        //             System.out.println("This grade is a B");
        //         }
        //         else if( grade2 >= 68 )
        //         {
        //             System.out.println("This grade is a C");
        //         }
        //         else if( grade2 >= 60 )
        //         {
        //             System.out.println("This grade is a D");
        //         }
        //         else
        //         {
        //             System.out.println("This grade is an F");
        //         }

        
        
        // Example 4: Calculate the statee sales tax on a purchased item, depending on the state
        System.out.print("Enter the price of item here: ");
        Scanner kb3 = new Scanner(System.in);

        double price = kb3.nextDouble();

        System.out.print("Enter the state where you live: ");

        String state = kb3.next();

        double tax = 0;

        // Check to see which state the user is in:
        
        // debug (we are checking for errors by printing out values of variables
        // System.out.println( (state.equalsIgnoreCase("OK")) );
        
        // use state.equals if comparing exactly to another string
        // otherwise use state.equalsIgnoreCase to ignore upper/lower case differences
        if(  state.equalsIgnoreCase("Oklahoma") || state.equalsIgnoreCase("OK") )
        {
            tax = 0.08 * price;
        }

        System.out.println("The total price of the item is " + (tax + price) + ".");
        
        
        // Example 5:  Curly brackets are not necessarily needed!
        
        int dude = 105;
        
        if( dude == 37 )
            dude++;
        else
            dude--;
            
        System.out.println(dude);
        
        // Note: It is good practice to ALWAYS use curly brackets with if/else statements.
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    }
}
