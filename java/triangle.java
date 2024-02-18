import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        // System.out.println("Enter the first angle:");
        int angle1 = scanner.nextInt();
        // System.out.println("Enter the second angle:");
        int angle2 = scanner.nextInt();
        // System.out.println("Enter the third angle:");
        int angle3 = scanner.nextInt();

        // Check if it forms a triangle
        if (angle1 + angle2 + angle3 == 180) {
            // Check for special types of triangle
            if (angle1 == angle2 && angle2 == angle3) {
                System.out.println("Triangle is equilateral");
            } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                    System.out.println("Triangle is right isosceles");
                } else {
                    System.out.println("Triangle is right");
                }
            } else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                System.out.println("Triangle is isosceles");
            } else {
                System.out.println("Triangle is not special");
            }
        } else {
            System.out.println("Not a Triangle");
        }

        scanner.close();
    }
}
