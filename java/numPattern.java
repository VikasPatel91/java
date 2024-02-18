
import java.util.*;

class numPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int x = 1; x <= num; x++) {
            for (int y = num; y >= x; y--) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        sc.close();
    }

}
