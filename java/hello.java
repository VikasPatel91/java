import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int x = Scan.nextInt();
        int y = Scan.nextInt();
        if (x > y) {
            System.out.println("x is grater than y " + x);
        } else if (y > x) {
            System.out.println("y is grater than x " + y);
        } else {
            System.out.println("both are equal");

        }
    }
}