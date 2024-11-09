import java.util.Scanner;

public class ControlFlowandArrayHandling {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );

        int[][] value = new int [5][5];
        int number; 

        for ( int row = 0; row < 5; row++ ) {
            for ( int col = 0; col < 5; col++ ) {
                System.out.print("ENTER NUMBER: ");
                number = scan.nextInt();

                if ( row == 0 && col == 0 ) {
                    if ( number == 0 || number > 9 && number < 100 ) { 
                        value[0][0] = number;
                    }
                } else if ( row > 1 && col > 1 && row % 2 == 0 && col % 2 == 0 ) {
                    if ( number % 2 == 0 ) {
                        value[row][col] = number;
                    }
                } else {
                    value[row][col] = number;
                }
            }
        }

        for ( int row = 0; row < 5; row++ ) {
            for ( int col = 0; col < 5; col++ ) {
                System.out.print(value[row][col] + " ");
            }
            System.out.println();
        }
    }
}
