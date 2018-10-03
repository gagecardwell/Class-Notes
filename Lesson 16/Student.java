
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private String name;
    private double sum;
    public int numGrades;

    public Student(String nm)
    {
        // What code needs to go here for this class to work correctly?
        name = nm;
        sum = 0;
        numGrades = 0;
    }

    public void setGrade( int grd )
    {
        numGrades++;
        sum = sum + grd;
    }
    
    public double getAverage()
    {
        // What code needs to go here?
        
        return sum / numGrades;
    }
    
}
