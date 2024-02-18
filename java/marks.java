import java.util.*;

public class marks {
    public static void main(String[] args) {
        int m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        float avg = (m1 + m2 + m3) / 3f;
        if (avg >= 90) {
            System.out.println("The grade is A");
        } else if (avg < 90 && avg >= 80) {
            System.out.println("The grade is B");

        } else if (avg < 80 && avg >= 70) {
            System.out.println("The grade is C");

        } else if (avg < 70 && avg >= 60) {
            System.out.println("The grade is D");

        } else if (avg < 60 && avg >= 50) {
            System.out.println("The grade is E");

        } else {
            System.out.println("The grade is F");

        }
        sc.close();
    }
}
