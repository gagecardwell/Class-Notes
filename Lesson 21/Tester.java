
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
        // Wrapper classes
        
        // declare an Integer object
        Integer ic = new Integer( 9 );
        System.out.println( ic );
        
        Integer ic2 = new Integer( 4 );
        Integer ic3 = ic + ic2;
        System.out.println(ic3); // 13
        
        Integer ic4 = ic3;
        ic3 = ic - ic2; //5
        System.out.println( ic4 ); // 13
        
        Integer ic5 = 100; // automatically changes 100 (int) into an Integer object.
        
        int i = 1000;
        Integer ic6 = i;
        
        // Replace Integer with Double and int with double for examples of those.
        
        
        // Character class examples:
        
        Character cc = new Character('y');
        Character cc2 = 'y'; 
        
        Character cc3 = 84; // cc3 has the char value at position 84 of the ascii table
        System.out.println( cc3 ); // T
        
        Character cc4 = (char)(cc3 - 1);
        
        
        // Boolean class examples:
        
        Boolean bc = true;
        Boolean bc2 = new Boolean(true);
        
        Boolean bc3 = bc2; // bc3 = new Boolean(bc2);
        
        // Convert from Wrapper class into primitive data type:
        
        int j = ic;
        int jj = ic.intValue();
        // both previous lines do the same thing
        
        int product = ic * ic2;
        
        boolean b = bc;
        
        // conversion is automatic if setting a primitive equal to a Wrapper object
        
        
        // Lesson 22
        
        // Main purpose of Wrapper classes:  Is to convert the primitive data types into their
        //                                   object equivalent to be used in algorithms and methods
        //                                   that only use objects.
        
        
        
        // The following methods have NOTHING to do with the objects the Wrapper classes produce.
        // These methods are all STATIC methods.
        
        // Conversion from a String to an int type:
        
        String s = "139";
        int num = Integer.parseInt( s );
        
        System.out.println( (num + 1) ); // 140
        
        
        // Converstion from a String to a double type:
        
        String s2 = "139.9234876";
        double dd = Double.parseDouble( s2 );
        
        // Convert a String number from base 16 into an int (automatically base 10):
        
        String s3 = "a5c"; // base 16 number as a String
        
        int num2 = Integer.parseInt( s3, 16 );
        
        System.out.println(num2);
        
        
        String s4 = "3w4br";
        int base = 35;
        System.out.println( Integer.parseInt(s4, base) ); // 5879187
        
        
        // Base conversion methods
        
        // Convert int to a String:
        int i6 = 44;
        String ww = Integer.toString( i6 );
        
        // Convert double to a String:
        
        double d6 = 44.44;
        String www = Double.toString( d6 );// or = "" + d6;
        
        // Convert int to base 16 number String
        String wwww = Integer.toHexString( i6 );
        System.out.println( wwww );
        
       
        // Convert int to base 8
        System.out.println( Integer.toOctalString( i6 ) );
        
        // Convert int to base 2
        System.out.println( Integer.toBinaryString( i6 ) );
        
        // Other values from Integer class:
        
        // Integer.MIN_VALUE has a value of -2,147,483,648 = -2^32
        // Integer.MAX_VALUE has a value of 2^32 - 1 = 2,147,483,647
        
        
        // SIZE constants in Wrapper classes
        // This method returns how many bits the primitive data types hold in memory
        // that are in that particular Wrapper class
        
        // Integer.SIZE has value 32
        
        // Double.SIZE has value 64
        
        // Character.SIZE has value 16
        
        // Boolean does not have a SIZE.
        
        
        
        
    }
}
