import java.io.*;
import java.util.*;

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
        // Input from the keyboard

        // Input an integer

        Scanner kbReader = new Scanner(System.in);
        //         
        //         System.out.print("Enter your integer here: ");
        //         int i = kbReader.nextInt();
        //         System.out.println( i );
        //         
        //         // Input a double
        //         
        //         System.out.print("Enter your decimal number here: ");
        //         double d = kbReader.nextDouble();
        //         System.out.println( d );
        //         
        //         // Input a String
        //         
        //         System.out.print("Enter your first name: ");
        //         String s = kbReader.next();
        //         System.out.println("Your name is " + s + ".");

        // Multiple inputs

        // If you want to have multiple inputs on the same line,
        // then separate your input values with spaces.

        System.out.print("Enter your age and first name: ");
        int j = kbReader.nextInt();
        String name = kbReader.next();
        System.out.println("Your name is " + name + ", and your age is " + j + ".");

        // Input an entire line of text
        // If you ever use the method nextLine(), create a new
        // Scanner to do so.
        
        Scanner kbReader2 = new Scanner(System.in);

        System.out.println("Type in an entire sentence in the following line:");
        String sentence = kbReader2.nextLine();
        System.out.println(sentence);
        
        

    }
}
