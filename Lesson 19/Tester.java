import java.util.Arrays;
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
        // Array of objects

        Circle cir[] = new Circle[10]; // 10 circles in an array

        // Each circle has not been initialized!

        //System.out.println( cir[3].area() ); // runtime crash, null pointer (not been initialized)

        // let's initialize each Circle in the array cir:

        cir[0] = new Circle(2);
        cir[1] = new Circle(5);
        cir[2] = new Circle(6);
        cir[3] = new Circle(10);
        cir[4] = new Circle(1);
        cir[5] = new Circle(3);
        cir[6] = new Circle(2);
        cir[7] = new Circle(3);
        cir[8] = new Circle(7);
        cir[9] = new Circle(8);

        System.out.println( cir[3].area() ); // runs with no errors

        // Another way to create an array of objects:
        Circle cir2[] = { new Circle(2), new Circle(5), new Circle(6),
                new Circle(10), new Circle(1), new Circle(3),
                new Circle(2), new Circle(3), new Circle(7),
                new Circle(8) };

        System.out.println( cir2[8].area() );

        // set all circles from cir2 to have radius of 3:
        for( int r = 0; r < cir2.length; r++ )
        {
            cir2[r] = new Circle(3);
        }

        System.out.println( cir2[8].area() );
        
        
        // Comparison of array values (on board)
        
        // Watch for the NullPointerException:
        
        int mxz[];
        
        //mxz[4] = 6; // Null pointer, mxz has not been initialized!  We can't access
                    // a value from the array if the array has not been given a size yet
                    
                    
                    
                    
        // Different references to the SAME array:
        
        int frst[] = {1, 2, 3, 4, 5};
        int sec[];
        
        sec = frst;
        
        sec[2] = 99;
        
        System.out.println( frst[2] ); // What is printed? 99
        
        
        // Removing an array from memory:
        
        int myArray[] = new int[500];
        // code that does stuff....
        myArray = null;
        
        frst = null;
        sec = null;
        
        
        // Copy from one array to another array:
        
        // Signature of the method that we use:
        // System.arraycopy( theFromArray, fromIndex, theToArray, toIndex, howMany )
        
        // theFromArray - The Array you are copying from!
        // fromIndex - The index from theFromArray that we begin copying from
        // theToArray - The destination array!
        // toIndex - The index from theToArray that will begin receiving values
        // howMany - How many values that are copying from theFromArray
        
        char ch[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
        char nn[] = { '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        
        System.arraycopy( ch, 2, nn, 4, 3 );
        
        // How ch or nn changed after this line of code?
        
        for( int i = 0; i < nn.length; i++ )
        {
            System.out.println( nn[i] );
        }
        
        System.out.println();
        // Note: be careful of IndexOutOfBounds errors when using System.arraycopy
        
        
        
        // Convert a String into a character array:
        
        String s = "Hello";
        
        char c[] = s.toCharArray();
        
        for( int i = 0; i < c.length; i++ )
        {
            System.out.println( c[i] );
        }
        
        // Convert a character array into a String:
        
        String ss = "";
        
        for( int i = 0; i < c.length; i++ )
        {
            ss = ss + c[i];
        }
        
        System.out.println( ss ); // test to see if this is the right String we wanted
        
        // Another way:
        
        String sss = String.copyValueOf( c );
        
        System.out.println( sss );
        
        
        
        // Logical size versus physical size of an array
        
        int kj[] = new int[30]; // physical size is 30
        
        int max = 5;
        
        for( int j = 0; j < max; j++ )
            kj[j] = j * 3;
            
        // The logical size of kj is the number of positions it is currently using
        // logical size of kj is 5 (at this point in the code)
        
        // Note:  logical size <= physical size
        
        
        //  The Arrays class
        //  1. Sorting arrays
        
        int b[] = {67, 45896, -6754, 1, 567, 3};
        
        Arrays.sort( b ); // sorted from least to greatest
        System.out.println();
        for( int i = 0; i < b.length; i++ )
        {
            System.out.println( b[i] ); // testing to make sure
        }
        System.out.println();
        // How would you sort b from greatest to least values?
        
        
        
        // Binary search:  If you wanted to search through an array to see if it contained
        //                 a certain value, here's how you would it:
        
        // 1st step:  sort your array first. (This is required for a binary search)
        
        // 2nd step:  use the method Arrays.binarySearch to search for your value
        
        int index = Arrays.binarySearch( b, 55 );
        
        System.out.println( index ); // a negative number (-4), 55 was not found
        
        System.out.println( Arrays.binarySearch( b, 3 ) );  // 2
        
        System.out.println( Arrays.binarySearch( b, 567 ) ); // 4
        
        
        //  Check to see if two arrays contain the same values:
        
        int x[] = {1, 2, 3, 4, 5};
        int y[] = {1, 2, 3, 4, 5};
        int z[] = {1, 2, 10, 4, 5};
        
        System.out.println( Arrays.equals( x, y ) ); // true
        System.out.println( Arrays.equals( x, z ) ); // false
        System.out.println( x == y ); // false, different memory location
        System.out.println();
        
        // Fill an array with some specified value:
        
        int pk[] = {1,2,3,4,5};
        
        Arrays.fill( pk, 99 );
        
        for(int i = 0; i < pk.length; i++ )
            System.out.println( pk[i] );
        
        
    }
}
