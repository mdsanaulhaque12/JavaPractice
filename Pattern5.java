package patternquestion;
/*

 *  *  *  *  *  *  *  *  *
 *                       *
 *                       *
 *                       *
 *  *  *  *  *  *  *  *  *

 * */
public class Pattern5 {
    public static void main(String [] args) {
        int row = 5;
        int column = 9;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if (i == 1 || i == row) {
                    System.out.print(" * ");
                } else if (j == 1|| j == column ) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

