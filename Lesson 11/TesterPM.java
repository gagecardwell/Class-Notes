
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
        // Lesson 11: LOOPS
        
        // Suppose that we want the computer to make the calculation
        // 3 + 4 + 5 + 6 + 7 + ... + 75
        
        // One method:
        
        int sum = 0;
        
        sum = sum + 3;
        sum = sum + 4;
        sum = sum + 5;
        // ...
        sum = sum + 75;
        
        // Instead, there is a much more easier way of doing the same computations
        // but takes less code to write.
        
        int sum2 = 0;
        int count;
        
        for( count = 3; count <= 75; count++ ) // initializing; control; step
        {
            sum2 = sum2 + count;
        }
        
        //System.out.println( sum2 );
        
        
        // Special features of the for-loop
        
        // You can declare variables in the initializing statement, but BEWARE
        // that variable only exists INSIDE the for loop.
        
        for( int k = 0; k < 10 ; k++ )
        {
            
            
        }
        
        
        // No curly brackets are needed!
        
        for( int k = 0; k < 10 ; k++ )
            System.out.println();
            System.out.println("Testing"); // This line runs only once!
        
        System.out.println();
        
        
        
        // When the loop finishes:
        int k;
        for( k = 0; k < 10 ; k++ )
        {
            // random code here
        }
        
        System.out.println(k); // 10
        
        
        
        // Nested loops
        
        for( int j = 3; j < 7; j++) 
        {
            System.out.println("Outer Loop"); // prints 4 times
            
            for( int i = 0; i < 5; i++)
            {
                System.out.println("Inner Loop"); // prints 20 times
            }
        }
        
        System.out.println();
        System.out.println();
        
        // WARNING - WATCH YOUR SEMICOLONS
        
        for( int g = 0; g < 10 ; g++ ); // Watch your semicolons at the end of for loop statements
        {
            System.out.println("I am so awesome.");  // This prints once
        }
        
        
        
        
        
        
        
        
        
          
    }
}
