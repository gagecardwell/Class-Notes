
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

        // One way to define a 3x2 matrix:
        int mat1[][] = new int[3][2];

        mat1[0][0] = 2;
        mat1[0][1] = 4;
        mat1[1][0] = 1;
        mat1[1][1] = 6;
        mat1[2][0] = 0;
        mat1[2][1] = 9;

        // Let's print a 2-dim array (matrix)        
        printMatrix( mat1 );

        System.out.println();
        System.out.println();
        // Another way to define a 3x2 matrix:

        int mat2[][] = { {0,1} , {2,3} , {4,5} };

        printMatrix( mat2 );

        System.out.println();
        System.out.println();
        // How can we set up code to add mat1 and mat2 together as matrices?

        int sum[][] = addMatrices( mat1, mat2 );

        // Print the result of the sum:
        printMatrix( sum );

    }

    public static void printMatrix( int arr[][] )
    {
        for( int row = 0; row < arr.length; row++ )
        {
            for( int col = 0; col < arr[0].length; col++ )
            {
                System.out.print(arr[row][col] + "\t");
            }
            System.out.println();
        }

    }

    public static int[][] addMatrices( int mat1[][], int mat2[][] )
    {
        if( mat1.length == mat2.length && mat1[0].length == mat2[0].length )
        {
            // mat1 and mat2 have the same dimensions, we can add them!

            int sum[][] = new int[ mat1.length ][ mat1[0].length ];
            
            for( int row = 0; row < sum.length; row++ )
            {
                for( int col = 0; col < sum[0].length; col++ )
                {
                    sum[row][col] = mat1[row][col] + mat2[row][col];
                }
            }
            
            return sum;
        }
        
        System.out.println( "ERROR: Your matrices are not of the same dimensions." );
        return null;
    }

}
