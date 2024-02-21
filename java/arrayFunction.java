import java.util.*;

// create a table of given number store it into a array and pass array as
// argument to a function to print an elements;
public class arrayFunction {
    void table(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = new int[10];
        int tab;
        Scanner sc = new Scanner(System.in);
        tab = sc.nextInt();
        for (int i = 1; i <= 10; i++) {

            a[i - 1] = tab * i;

        }
        arrayFunction ar = new arrayFunction();
        ar.table(a);
        sc.close();
    }

}
