
import java.util.*;

class starPatter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int x = 1; x <= num; x++) {
            for (int y = 1; y <= num; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }
}
