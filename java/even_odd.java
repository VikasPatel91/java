// number is even or odd
import java.util.*;
class even_odd {
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.print(num + " is an Even number");
        } else {
            System.out.print(num + " is an odd number");
        }
        sc.close();
    }
}