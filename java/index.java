
public class index {

    public static void main(String[] arg) {
        int x = 34566;
        int digit = 0;
        int sum = 0;
        int value = x / 10;
        while (x != 0) {
            x = x / 10;
            digit++;
        }
        while (digit > 0) {
            int lastdigit = x % 10;
            sum = value;
            System.out.println(value);
            digit--;
        }
        System.out.println(sum);
        // int n1 = x / 1000;
        // int n2 = (x / 100) % 10;
        // int n3 = (x / 10) % 10;
        // int n4 = x % 10;
        // int sum = n1 + n2 + n3 + n4;
        // if (sum%3==0||sum%5==0||sum%7==0) {
        // System.out.println("perfect number "+sum);
        // } else {
        // System.out.println("not perfect number");
        // }

    }
}