import java.util.*;
import java.io.*;

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
        //         Scanner kb = new Scanner(System.in);
        //         
        //         System.out.print("Enter an integer: ");
        //         int x = kb.nextInt();
        //         
        //         boolean b1 = false;
        //         
        //         // check to see if x < 10 
        //         b1 = (x<10);
        //         
        //         // check to see if x > 0
        //         boolean b2 = (x>0);
        //         
        //         // to check if both b1 and b2 are true:
        //         boolean b3 = b1 && b2;
        //         System.out.println(b3);
        //         
        //         
        //         // to check if either b1 or b2 are true:
        //         System.out.println( b1 || b2 );
        //         
        //         // How do we check to see if x is equal to a certain number?
        //         
        //         System.out.println( x == 50 );
        //         
        //         // How do we check to see if x is NOT equal to a certain number?
        //         // NOT operator:  !
        //         System.out.println( !(x == 50) ); // check if x is NOT 50
        //         boolean b4 = (x != 50);

        
        int x = 79, y = 46, z = -3;
        
        double d = 13.89, jj = 40.0;
        
        boolean b = true, c = false;
        
        // Ex 1
        System.out.println( true && false ); // false
        
        // 2
        System.out.println( true && !false ); // true
        
        // 3
        System.out.println( c || (d>0) ); // true
        
        // 4 
        System.out.println( !b||c ); // false
        
        // 5
        System.out.println( !(b||c) ); // false
        
        // 6
        System.out.println( (x>102) && true ); // false
        
        // 7
        System.out.println( (jj == 1) || false ); // false
        
        // 8
        System.out.println( x != 3 ); // true
        
        // 9 
        System.out.println( !(x != 3 ) ); // false
        
        // 10
        System.out.println( (jj == 40) && !false ); // true
        
        // 11
        System.out.println( !!!!!!!true ); // false
        
        // 12
        System.out.println( true || false && false ); // true
        
    }
}
