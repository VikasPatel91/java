import java.util.*;

public class string {

  public static String reverseString(String s) {
    char[] charArray = s.toCharArray();
    int start = 0;
    int end = s.length() - 1;
    while (start < end) {
      char temp = charArray[start];
      charArray[start] = charArray[end];
      charArray[end] = temp;
      start++;
      end--;
    }
    return new String(charArray);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    int s1Length = s1.length();
    int s2Length = s2.length();
    System.out.println("Length of the first string is " + s1Length);
    System.out.println("Length of the second string is " + s2Length);
    String s1Reverse = reverseString(s1);
    System.out.println("The reverse of the first string is " + s1Reverse);
    String s2Reverse = reverseString(s2);
    System.out.println("The reverse of the second string is " + s2Reverse);
    String s3 = s1 + s2;
    System.out.println("The concatenated string is " + s3);
    System.out.println(s2 + " appears before " + s1);
    sc.close();
  }
}
