import java.lang.Math;

public class Recursion1 {
    public static void main ( String[] args ) {

        int[] number = {1, 2, 3, 4, 5};
        System.out.println(arraySum(number, number.length));
    }
    
    public static int arraySum ( int[] number, int size ) {
        if ( size == 0 ) {
            return 0;
        } else {
            return (arraySum(number, size - 1) + number[size -1]);
        }
    }
}
