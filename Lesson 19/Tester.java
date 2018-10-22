
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
        
        
        // Copy from one array to another array:
        
        // Signature of the method that we use:
        // System.arraycopy( theFromArray, fromIndex, theToArray, toIndex, howMany )
        
        // theFromArray - The Array you are copying from!
        // fromIndex - The index from theFromArray that we begin copying from
        // theToArray - The destination array!
        // toIndex - The index from theToArray that will begin receiving values
        // howMany - How many values that are copying from theFromArray
        
        
        
    }
}
