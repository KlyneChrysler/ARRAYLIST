import java.lang.Math;

public class Recursion3 {
    public static void main ( String[] args ) {
        
        int exNumber = 5;
        System.out.println("SUM = " + sumNaturals(exNumber));
    }  

    public static int sumNaturals ( int num ) {
        if ( num == 0 ) {
            return 0;
        } else {
            return num + sumNaturals(num - 1);
        }
    }
}
