import java.util.Scanner;

public class matrix {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int row = scanner.nextInt();
    int col = scanner.nextInt();

    int[][] matrix = generateMatrix(n);

    // Print the matrix
    printMatrix(matrix, n, row, col);
    scanner.close();
  }

  public static int[][] generateMatrix(int n) {
    int[][] matrix = new int[n][n];
    int num = 1;

    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        for (int j = 0; j < n; j++) {
          matrix[i][j] = num++;
        }
      } else {
        for (int j = n - 1; j >= 0; j--) {
          matrix[i][j] = num++;
        }
      }
    }

    return matrix;
  }

  public static void printMatrix(int[][] matrix, int n, int row, int col) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println(matrix[row - 1][col - 1]);
  }
}
