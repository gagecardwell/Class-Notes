
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
        // Arrays of objects
        
        Circle cir[] = new Circle[5];
        
        // with object arrays, we must initialize each one before trying to use the array
        cir[0] = new Circle(3);
        cir[1] = new Circle(2.5);
        cir[2] = new Circle(9);
        cir[3] = new Circle(5.5);
        cir[4] = new Circle(6.7);
        
        System.out.println( cir[0].area() );
        
        
        // Another way to declare an array of Circles:
        
        Circle cir2[] = { new Circle(3), new Circle(6), new Circle(10) };
        
        System.out.println( cir[2].circumference() );
        
        
        
        // NullPointerException  (run-time error)
        
        double m[] = new double[4];
        m[3] = 9.9; // no problems with numerical arrays
        
        Circle c[] = new Circle[4];
        
        //double x = c[3].getRadius(); // problem here 
        
        
        // Different references to the same array:
        
        int first[] = {1, 2, 3, 4, 5};
        int second[];
        second = first;
        second[2] = 99;
        System.out.println( first[2] ); // prints 99
        
        changeme( first );
        System.out.println( first[0] ); // prints 88
        
        
        // Removing an array from memory
        
        first = null;
        second = null; // we've removed all pointers pointing to that array of integers
        
        // Copying from one array to another:
        
        // System.arraycopy( theFromArray, fromIndex, theToArray, toIndex, howMany )
        
        char ch[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
        char nn[] = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        
        System.arraycopy( ch, 1, nn, 4, 2 );
        
        for( int i = 0; i < nn.length; i++)
        {
            System.out.println(nn[i]);
        }
        
        
        
    }
    
    public static void changeme( int[] arr )
    {
        arr[0] = 88;
    }
    
}
