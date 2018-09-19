
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
        // MORE LOOPS!
        
        // Recall the structure of the following for-loop
        int sum = 0;
        int j;
        for( j = 0; j <=79; j++ )
        {
            sum = sum + j;
        }
        
        System.out.println(sum);
        
        // Another way to represent this loop is with using a while-loop
        
        int sum2 = 0;
        int jj = 0;
        while(jj <=79) // only has the control statement here
        {
            sum2 = sum2 + jj;
            
            jj++;
        }
        
        System.out.println(sum2);
        
        // Another example:
        
        int a = 0, b = 11;
        while( a < 10 )
        {
            a++;
            if( a != 5 )
            {
                continue;  // continue exits out of the current iteration of the loop
                           // but stays in the loop!
            }
            
            b = b + a;
            
        }
        System.out.println( b );
        
        // Note:  We can use break to completely exit the loop similar to for loop and switch statements
        
        
        
        // Yet another type of loop:  do-while
        
        int sum3 = 0;
        int jjj = 0;
        do 
        {
            sum3 = sum3 + jjj;
            
            jjj++;
        }while(jjj <=79); // control statement
        
        // do-while loops are used when you want the code in the loop to be guaranteed to run at least once.
        
        
        // Curly brackets are optional! (Except with a do-while loop)
        
        int i = 1;
        
        while( i < 10 )
            i++;
            i = i + 30; // not in loop! Only runs once
            System.out.println(i); // not in loop!  Only runs once
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
