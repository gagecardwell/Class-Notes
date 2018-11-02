
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
        // How do we represent a matrix?  As a 2-dimensional array.
        
        // One way we can declare a two-dim array:
        int mat1[][] = new int[3][2];
        
        //Initialize each value here:
        mat1[0][0] = 1;
        mat1[0][1] = 2;
        mat1[1][0] = 3;
        mat1[1][1] = 4;
        mat1[2][0] = 5;
        mat1[2][1] = 6;
        
        // Print out a 2-dim array like a matrix:
        printMatrix( mat1 );
        
        System.out.println();
        System.out.println();
        // Another way we can declare and initialize a two-dim array in one line of code:
        int mat2[][] = { {9,5},
                         {3,3},
                         {-6,0} };

        // print it out:
        printMatrix( mat2 );
        
        System.out.println();
        System.out.println();
        
        // Add two matrices: 
        int sum[][] = addMatrices( mat1, mat2 );
        
        //print out the result:
        printMatrix( sum );
        
        System.out.println();
        System.out.println();
        
        // Calculate 3*mat1  (Scalar multiplication)
        
        int newArr[][] = scalarMult( mat1, 3 );
        
        printMatrix( newArr );
        
        System.out.println();
        System.out.println();
        // Create a method for calculating the difference between two matrices
        // by using the addMatrices method and the scalarMult method.
        
        int subtract[][] = subtractMatrices( mat1, mat2 );
        
        printMatrix(subtract);
    }
    
    public static void printMatrix( int[][] arr )
    {
        for( int row = 0; row < arr.length; row++ )
        {
            for( int col = 0; col < arr[0].length; col++ )
            {
                System.out.print( arr[row][col] + "\t" );
            }
            System.out.println();
        }
    }
    
    public static int[][] addMatrices( int[][] a, int[][] b )
    {
        int sum[][] = new int[a.length][a[0].length]; // same dimensions as 'a'
        
        for( int row = 0; row < sum.length; row++ )
        {
            for( int col = 0; col < sum[0].length; col++ )
            {
                sum[row][col] = a[row][col] + b[row][col];
            }
        }
        
        return sum;
    }
    
    public static int[][] scalarMult( int[][] arr, int scalar )
    {
        int newArr[][] = new int[arr.length][arr[0].length]; 
        
        for( int row = 0; row < newArr.length; row++ )
        {
            for( int col = 0; col < newArr[0].length; col++ )
            {
                newArr[row][col] = scalar*arr[row][col];
            }
        }
        
        return newArr;
    }
    
    public static int[][] subtractMatrices( int[][] a, int[][] b )
    {
        return addMatrices( a, scalarMult( b, -1 ) );
    }
}
