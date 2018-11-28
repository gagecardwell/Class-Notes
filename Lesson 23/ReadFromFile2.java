import java.util.*;
import java.io.*;

/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReadFromFile2
{
    public static String[] readFile(String pathOfFile ) //throws IOException
    {
        // Lesson 23:  Input from a disk file

        try
        {
            File f = new File(pathOfFile);

            Scanner sc = new Scanner( f );

            String lines[] = new String[1000]; // to be safe, declare plenty

            int logicalSize = 0;

            // Reading in line by line from our file
            // and saving those lines in a String array
            while( sc.hasNext() )
            {
                lines[logicalSize] = sc.nextLine();
                logicalSize++;
            }

            String arrayToReturn[] = new String[logicalSize];
            
            // Copying each line we read from our file
            // from lines to arrayToReturn
            for(int i = 0; i < logicalSize; i++ )
            {
                arrayToReturn[i] = lines[i];
            }
            
            sc.close();
            return arrayToReturn;
        }
        catch( Exception e )
        {
            System.out.println("This file does not exist!");
            System.out.println( e );
            return null;
        }

    }
}
