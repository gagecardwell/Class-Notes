
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
        // Recall the for-loop
        
        int k;
        for( k = 0; k <= 79; k++ )
        {
            // code that we want to repeat
        }
        
        
        // The while-loop
        int j = 0;
        
        while( j <= 79 )
        {
            // code that we want to repeat
            j++;
        }
        
        // Notice there is no initialize statement, and no step statement, only control statement
        
        
        // Another type of loop:  do-while loop
        
        // This loop will run at least once.
        int g = 0;
        do
        {
            // code that we want to repeat
            g++;
        }while( g <= 79  );
        
        
        // Note:  If you want to exit out of a loop prematurely, use a break statement,
        // usually paired with an if statement.
        
        int h = 0;
        do
        {
            // code that we want to repeat
            
            if( h == 50 )
                break;
            
            h++;
        }while( h <= 79  );
        
        
        // If you want to exit the current iteration of a loop, use the continue statement:
        int jj = 0;
        
        while( jj <= 79 )
        {
            if( jj == 45 )
            {
                jj++;
                continue; // exit this iteration, but stays in the loop
            }
            
            // code that we want to repeat
            jj++;
        }
        
        // Note:  Curly brackets are not necessary, unless you are using a do-while loop.
        
    }
    
    
    public static void examples()
    {
        int j = 0, b = 11;
        
        while( j < 10 )
        {
            j++;
            if( j != 5 )
            {
                continue;
            }
            
            b = b + j;
        }
        
        
        System.out.println( b ); // 16
        
    }
    
    
    
}
