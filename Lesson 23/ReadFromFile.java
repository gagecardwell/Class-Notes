import java.util.*; // Scanner
import java.io.*; // File

/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReadFromFile
{
    public static String[] returnStringArray(String path) throws IOException
    {
        File f = new File(path); 

        Scanner sc = new Scanner( f );

        String arr[] = new String[1000]; // to be safe, declare a really large size.

        int maxIndx = -1; // we start at -1 because we immediately add 1 to maxIndx in the loop

        while(sc.hasNext())
        {
            maxIndx++; // first index used is 0
            arr[maxIndx] = sc.nextLine();
        }

        // print all lines that were read from our file to the screen:

        //for(int i = 0; i <= maxIndx ; i++ )
        //{
        //    System.out.println( arr[i] );
        //}

        sc.close();

        String ret[] = new String[maxIndx + 1];

        for(int i = 0; i <= maxIndx ; i++ )
        {
            ret[i] = arr[i];
        }

        return ret;
    }
}
