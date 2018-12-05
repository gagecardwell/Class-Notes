import java.io.*;
import java.util.*;

/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args) throws IOException
    {
        // Read from a file to get some info:

        String lines[] = ReadFromFile2.readFile("/home/pi/Desktop/temp_nerd/NumData.in");

        // Writing to a text file

        // Create a FileWriter and PrintWriter objects

        FileWriter fw = new FileWriter("/home/pi/Desktop/temp_nerd/NumData.out");
        PrintWriter pw = new PrintWriter(fw);

        // According to a previous project, we wanted to print to the screen
        // the sum of all the numbers per line in NumData.in

        // Solution: (but now print to file)

        for( int i = 0; i < lines.length; i++)
        {
            String s = lines[i];
            Scanner sc = new Scanner( s );
            int sum = 0;

            while(sc.hasNext() )
            {
                sum += sc.nextInt();
            }

            pw.println( sum );
        }
        
        // To close the file before we end the program.
        // Sometimes, writing to the file does not occur until we close.
        pw.close();
        fw.close();
    }
}
