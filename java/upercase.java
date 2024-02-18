
// upercase or lowercase

import java.util.*;

public class upercase {
    public static void main(String[] args) {
        char alp;
        Scanner sc = new Scanner(System.in);
        alp = sc.next().charAt(0);
        if (Character.isUpperCase(alp)) {
            System.out.println(alp + " is uppercase letter");
        } else if (Character.isLowerCase(alp)) {
            System.out.println(alp + " is lowercase letter");
        } else {
            System.out.println(alp + " is neither an uppercase or lowercase letter");
        }
        sc.close();
    }
}
