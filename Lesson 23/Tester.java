
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
        // Call upon our method we just made:
        
        String arr[] = ReadFromFile2.readFile("/media/pi/WORKWORK/readme.txt");
        
        // Test and print out all the lines read in arr:
        for(int i = 0; i < arr.length; i++ )
        {
            System.out.println( arr[i] );
        }
        
        
    }
}
