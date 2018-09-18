
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
        // LOOOOOPS
        // The for-loop
        
        // Suppose that we want to add all integers from 3 to 65.  That is, we want to compute
        // 3 + 4 + 5 + 6 + 7 + 8 + ... + 64 + 65.
        
        // One method:
        
        int sum = 3;
        sum = sum + 4;
        sum = sum + 5;
        sum = sum + 6;
        sum = sum + 7;
        // keep doing this until...
        sum = sum + 65;
        
        // Note how monotonous this is!  There is a better way using loops:
        
        int count = 0;
        int sum2 = 0;
        for( count = 3; count <= 65; count = count + 1 )  // initializing statement; control statement; step statement
        {
            //System.out.println( count ); // this is for testing purposes
            sum2 = sum2 + count;
        }
        
        System.out.println();
        System.out.println(sum2);
        
        
        // there are better ways to write this for loop above:
        
        // for( int count = 3; count <= 65; count++ )
        
        
        
        
        // Special features of the for-loop:
        
        // The break statement will exit a for-loop.
        int sum3 = 0;
        for( int i = 3; i <= 65; i++ )
        {
            // System.out.println( i ); // this is for testing purposes
            sum3 += i;
            
            if( i == 50 )
                break;
            
        }
        
        System.out.println( sum3 );
        
        
        // Declaring the loop variable, example is above where int i is declared and initialized
        // for( int i = 3; i <= 65; i++ )
        
        // Another example:
        
        for( int i = 0; i < 20; i++ )
        {
            double d = 102.34;
            
            // some other code here.....
        }
        
        // System.out.println(d); // error!  d does not exist outside of the for loop!
        
        
        // Curly brackets are OPTIONAL! But, the for loop in this case will only include the
        // very next line of code.
        
        int sum4 = 0;
        for( int i = 0; i < 20; i++ )
            System.out.println(i);
            //sum4 += i; // ERROR! i does not exist, we are outside of the for-loop at this line!
        
        
        // Another Example:
        
        int j;
        
        for( j = 3; j <= 79; j++ )
        {
            // some random code here....
        }
        
        System.out.println( j ); // what is printed? 80
        
        
        
        // Yet another example:  Nested loops
        
        for( int g = 0; g < 5; g++)
        {
            System.out.println("Outer Loop"); // runs 5 times
            for( int k = 0; k < 7; k++ )
            {
                System.out.println("Inner Loop"); // runs 35 times, 5 * 7 times
            }
        }
        
        System.out.println();
        
        
        // WARNING:
        
        for( int g = 0; g < 5; g++); // watch for unnecessary semicolons at the end of for loops
        {
            // code here that does stuff
            System.out.println("Does this print at all?"); // This prints only once!
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
