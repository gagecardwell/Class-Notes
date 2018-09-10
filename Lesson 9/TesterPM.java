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
        // Decision making

        // Example 1

        // Get a grade from the keyboard

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the grade: ");
        int myGrade = sc.nextInt();

        //         if( myGrade >= 90 )
        //         {
        //             System.out.println("Your grade is an A");
        //         }
        //         else
        //         {
        //             System.out.println("Your grade is not an A");
        //         }

        String sentence = "Your grade is a";
        
        if( myGrade >= 90 )
        {
            sentence += "n A";
        }
        else if( myGrade >= 80 && myGrade < 90 )
        {
            sentence += " B";
        }
        else if( myGrade >= 70 && myGrade < 80 )
        {
            sentence += " C";
        }
        else if( myGrade >= 60 && myGrade < 70 )
        {
            sentence += " D";
        }
        else
        {
            sentence += "n F";
        }
        
        System.out.println( sentence );
        
        
        // Example 2
        
        Scanner kb2 = new Scanner(System.in);
        
        System.out.print("What state do you live in? ");
        String state = kb2.next();
        
        System.out.print("What is the price of the item? $");
        double price = kb2.nextDouble();
        
        double tax = 0;
        
        if( state.equalsIgnoreCase("Oklahoma") || state.equalsIgnoreCase("OK") ) //proper way to compare Strings
        {
            tax = price * 0.08;
        }
        
        double totalPrice = price + tax;
        System.out.println( "The total price is $" + totalPrice + "." );
        
        // Example 3 Brackets are not needed if only one line of code followed an if or else statement
        
        int dude = 105;
        if(dude == 37)
            dude++;
        else
            dude--;
            
        System.out.println(dude);
        
        //Note:  Using brackets with if/else statements is a good practice for now...
        
        // Example 4, grades revisited
        
        sc = new Scanner(System.in);

        System.out.print("Enter the grade: ");
        myGrade = sc.nextInt();

        sentence = "Your grade is a";
        
        if( myGrade >= 90 )
        {
            sentence += "n A";
        }
        else if( myGrade >= 80 )
        {
            sentence += " B";
        }
        else if( myGrade >= 70 )
        {
            sentence += " C";
        }
        else if( myGrade >= 60 )
        {
            sentence += " D";
        }
        else
        {
            sentence += "n F";
        }
        
        System.out.println( sentence );
        
        
        
    }
}
