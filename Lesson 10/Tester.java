import java.util.Scanner;

/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
    public static void calculator()
    {
        // Example of a basic calculator
        
        System.out.println("   1. Addition");
        System.out.println("   2. Subtraction");
        System.out.println("   3. Multiplication");
        System.out.println("   4. Division");
        System.out.print("Your choice? ");

        Scanner kb = new Scanner(System.in);
        int choice = kb.nextInt();

        System.out.print("Enter the first value: ");
        double num1 = kb.nextDouble();

        System.out.print("Enter the second value: ");
        double num2 = kb.nextDouble();

        double ans = 0;;

        // decide with if statements:

        //         if(choice == 1)
        //         {
        //             ans = num1+num2;
        //         }
        //         else if(choice == 2)
        //         {
        //             ans = num1-num2;
        //         }
        //         else if(choice == 3)
        //         {
        //             ans = num1*num2;
        //         }
        //         else if(choice == 4)
        //         {
        //             ans = num1/num2;
        //         }
        //         else
        //         {
        //             System.out.println("Error, incorrect menu choice.");
        //             return; // this ends the program here
        //         }

        
        // use a switch statement instead of if/else chain
        
        switch( choice )
        {
            case 1:
            {
                ans = num1+num2;
                //System.out.println("case 1");
                break;
            }
            case 2:
            {
                ans = num1-num2;
                //System.out.println("case 2");
                break;
            }
            case 3:
            {
                ans = num1*num2;
                //System.out.println("case 3");
                break;
            }
            case 4:
            {
                ans = num1/num2;
                //System.out.println("case 4");
                break;
            }
            default:
            {
                System.out.println("Error, incorrect menu choice.");
                return; // this ends the program here
            }
        }
        
        System.out.println("Answer: " + ans);

    }
    
    public static void yadda()
    {
        // cases that do similar things
        // cases that 'bleed' into each other
        int j = 7;
        
        switch( j )
        {
            case 1:
            case 2:
            case 3:
                System.out.println("blah");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("yarp");
                break;
            case 7:
                System.out.println("yadda");
                break; // Note:  break in the last case is not needed, but good practice to have            
        }
        
    }
    
    
    public static void main(String[] args)
    {
        // cases that do similar things
        // cases that 'bleed' into each other
        
        
        // char data type
        char c = 'a'; // Note: did not use double quotation marks ""
        
        switch( c )
        {
            case 'a':
            case 'b':
            case 'c':
                System.out.println("blah");
                break;
            case '4':
            case '5':
            case '6':
                System.out.println("yarp");
                break;
            default:
                System.out.println("yadda");
                break; // Note:  break in the last case is not needed, but good practice to have            
        }
         
        // Adding chars
        
        char x = 'X';
        char y = (char)(x + 32);
        
        System.out.println( x + " ---> " + y );
    }
    
    
    public static void charCalculator()
    {
        // Example of a basic calculator
        
        System.out.println("   A. Addition");
        System.out.println("   S. Subtraction");
        System.out.println("   M. Multiplication");
        System.out.println("   D. Division");
        System.out.print("Your choice? ");

        Scanner kb = new Scanner(System.in);
        String choice = kb.next();
        
        char c = choice.charAt(0);

        System.out.print("Enter the first value: ");
        double num1 = kb.nextDouble();

        System.out.print("Enter the second value: ");
        double num2 = kb.nextDouble();

        double ans = 0;;
        
        switch( c )
        {
            case 'a':
            case 'A':
            {
                ans = num1+num2;
                //System.out.println("case 1");
                break;
            }
            case 's':
            case 'S':
            {
                ans = num1-num2;
                //System.out.println("case 2");
                break;
            }
            case 'm':
            case 'M':
            {
                ans = num1*num2;
                //System.out.println("case 3");
                break;
            }
            case 'd':
            case 'D':
            {
                ans = num1/num2;
                //System.out.println("case 4");
                break;
            }
            default:
            {
                System.out.println("Error, incorrect menu choice.");
                return; // this ends the program here
            }
        }
        
        System.out.println("Answer: " + ans);

    }
    
    
    
    
    
    
    
    
    
    
}
