import java.util.Arrays;
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
        
        
        // Converting a String into a character array:
        
        String s = "What's up?";
        
        char yarg[] = s.toCharArray();
        
        for( int i = 0; i < yarg.length; i++ )
        {
            System.out.println( yarg[i] );
        }
        
        
        // Converting a character array into a String:
        
        String ss = "";
        for( int i = 0; i < yarg.length; i++ )
        {
            ss += yarg[i];
        }
        System.out.println( ss );
        
        // or use this static method in the String class:
        
        String sss = String.copyValueOf( yarg );
        System.out.println( sss );
        
        
        
        // Logical vs Physical size of an array (on board)
        
        
        
        // The Arrays class & static methods
        
        // Sorting (arrays)
        
        int b[] = {67, 2, 769, -457, -7, 0, 7, 1, 45 };
        
        Arrays.sort( b );
        
        for( int i = 0; i < b.length; i++ )
        {
            System.out.print( b[i] + " " ); 
        }
        System.out.println();
        System.out.println();
        
        
        
        // Search through an array to find a certain value:
        
        // Binary Search (only works on sorted arrays)
        
        int index = Arrays.binarySearch( b, 5 );
        System.out.println( index ); // a negative number
        System.out.println( Arrays.binarySearch( b, 45 ) ); // gives the index where it's found in a sorted array
        
        
        // Test two arrays (of the same type) for equality
        
        int x[] = {1,2,3,4,5};
        int y[] = {1,2,3,4,5};
        int z[] = {1,2,88,4,5};
        
        System.out.println( Arrays.equals(x, y ) ); // true
        System.out.println( Arrays.equals(x, z ) ); // false
        System.out.println( x == y); // false
        
        //  Fill an array with a specified value
        
        int kp[] = {1,2,3,4,5};
        
        Arrays.fill(kp, 99);
        
        System.out.println( kp[3] ); // 99
        
        
        // Command Line Arguments
        
        if( args.length > 0 )
        {
            System.out.println( args[0] ); // look for args[1], args[2], etc
        }
        
        
        // The enhanced for-loop, aka the for-each loop:
        
        int xx[] = {9,8,7,6,5,4,3};
        
        int sum = 0;
        // original for-loop:
        for( int i = 0; i < xx.length; i++ )
        {
            sum += xx[i];
        }

        System.out.println();
        
        // Another version with a for-each loop:
        int xxx[] = {9,8,7,6,5,4,3};
        int sum2 = 0;
        for(int v : xxx)
        {
            sum2 += v;
        }

        // Note:  using a for-each loop gives READ-ONLY access to the array's elements
        String st[] = {"Moo", "Bark", "Meow" };
        for( String str : st )
        {
            str = "BLAH";  // This code does nothing to the array st
        }
        
        System.out.println( st[1] ); // Bark
        
    }
    
    public static void changeme( int[] arr )
    {
        arr[0] = 88;
    }
    
}
