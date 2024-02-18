import java.util.Scanner;

public class factorial {
    public static void main(String args[]) {
        int num, fact = 1;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int x = num; x >= 1; x--) {
            fact = fact * x;
        }
        System.out.println(fact);
        sc.close();
    }

}
