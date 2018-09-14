import java.util.*;
import java.io.*;

/**
 * Write a description of class TesterAM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TesterAM
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("   1. Addition");
        System.out.println("   2. Subtraction");
        System.out.println("   3. Multiplication");
        System.out.println("   4. Division");
        
        System.out.print("Please make a selection (1-4): ");
        
        int choice = kb.nextInt();
        
        System.out.print("Enter the first number: ");
        
        double x = kb.nextDouble();
        
        System.out.print("Enter the second number: ");
        
        double y = kb.nextDouble();
        
        double answer = newCalculator( x, y, choice );
        
        System.out.println( answer );
        
    }
    
    public static double calculator( double x, double y, int choice )
    {
        // if/else chain of statements
        
        if( choice == 1 )
        {
            return x + y;
        }
        else if (choice == 2)
        {
            return x - y;
        }
        else if (choice == 3)
        {
            return x * y;
        }
        else if (choice == 4)
        {
            return x / y;
        }
        else
        {
            System.out.println("Invalid choice.  Default value returned.");
            return 0;
        }
    }
    
    public static double newCalculator( double x, double y, int choice )
    {
        // switch statement
        
        switch( choice )
        {
            case 1:
            {
                // debug:
                System.out.println("Case 1");
                return x + y;
                // didn't need breaks here
            }
            case 2:
            {
                // debug:
                System.out.println("Case 2");
                return x - y;
            }
            case 3:
            {
                // debug:
                System.out.println("Case 3");
                return x * y;
            }
            case 4:
            {
                // debug:
                System.out.println("Case 4");
                return x / y;
            }
            default:
            {
                // debug:
                System.out.println("Default");
                System.out.println("Invalid choice.  Default value returned.");
                return 0;
            }
        }
    }
    
    public static void examples()
    {
        int j = 7;
        
        switch( j )
        {
            case 7:
            case 2:
            {
                System.out.println("Blah");
                break;
            }
            case 1:
            {
                System.out.println("Bleh");
                break;
            }
            case 3:
            {
                System.out.println("Meh");
                break;
            }
            default:
            {
                break;
            }
        }
        
        
        // Example with String
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String s = kb.next();
        
        switch(s)
        {
            case "Brandon":
            {
                System.out.println("You are so awesome.");
                break;
            }
            case "Bob":
            {
                System.out.println("Hello there Bobbo");
                break;
            }
            default:
            {
                System.out.println("Who are you again?");
                break;
            }
        }
        
        
        // Example with char
        
        char c = 'A';
        
        switch( c )
        {
            case 'A':
            case 'B':
            case 'a':
            {
                System.out.println("This is a switch example with characters");
                break;
            }
        
        
        }
    }
}
