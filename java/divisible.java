// number is divisible by 2 or 3 or not
import java.util.Scanner;
public class divisible {
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num % 2 == 0 || num % 3 == 0) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
        sc.close();
    }
}
