import java.lang.Math;
import java.util.Scanner;

public class Recursion2 {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );

        System.out.print("ENTER STARTING NUMBER: ");
        int start = scan.nextInt();
        System.out.print("ENTER ENDING NUMBER: ");
        int end = scan.nextInt();
        evenNumbers(start, end);
    }

    public static void evenNumbers ( int start, int end ) {
        if ( start == end ) {
            System.out.print(start);
        } else {
        
            if ( start % 2 == 0 ) {
                System.out.print((start) + " ");
                evenNumbers(start + 2, end);
            } else {
                System.out.print((start) + " ");
                evenNumbers(start + 2, end);
            }
        }
    }
}
