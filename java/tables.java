
// take two number from user generate table of all the tables with in the range store the result into 2d array byb considering a size in sink with range given.
import java.util.*;

public class tables {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int from = sc.nextInt();
        int to = sc.nextInt();
        int array[][] = new int[(to - from) + 1][10];
        int m = 0;
        for (int i = from; i <= to; i++) {
            for (int j = 0; j < 10; j++) {
                // System.out.print(i * j + " ");
                array[m][j] = i * (j + 1);

            }
            m++;
            // System.out.println();
        }
        for (int j = 0; j < (to - from) + 1; j++) {
            for (int k = 0; k < 10; k++) {
                System.out.print(array[j][k] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

}
