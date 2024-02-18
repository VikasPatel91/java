import java.util.Scanner;

public class binaryIntoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input binary, octal, and hexadecimal strings
        System.out.println("Enter the binary number");
        String binaryStr = scanner.nextLine();

        System.out.println("Enter the octal number");
        String octalStr = scanner.nextLine();

        System.out.println("Enter the hexadecimal number");
        String hexadecimalStr = scanner.nextLine();

        // Parse strings to integer values using parseInt() method
        int binaryValue = Integer.parseInt(binaryStr, 2);
        int octalValue = Integer.parseInt(octalStr, 8);
        int hexadecimalValue = Integer.parseInt(hexadecimalStr, 16);

        // Output the results
        System.out.println("The integer value of the binary number " + binaryStr + " is " + binaryValue);
        System.out.println("The integer value of the octal number " + octalStr + " is " + octalValue);
        System.out.println("The integer value of the hexadecimal number " + hexadecimalStr + " is " + hexadecimalValue);

        scanner.close();
    }
}
