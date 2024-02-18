public class opps {
    public static void main(String args[]) {
        class a {
            protected int x;

            a(int a) {
                x = a;
            }

            public void display() {
                System.out.print(x);
            }
        }
        a obj = new a(5);
        obj.display();

    }
};