public class function {
    static void display(int x, int y) {
        int z = x;
        x = y;
        y = z;
    }

    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println(a + " " + b);
        display(a, b);
        System.out.println(a + " " + b);
    }
}
