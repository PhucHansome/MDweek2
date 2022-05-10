package MD22.Java.MD2week1.demo;

public class overLoadding {
    public static void main(String[] args) {
        System.out.println(sum(2.0f, 4));
        System.out.println(sum(2.0f, 4));
//        int c = 1;
//        double z = 2.0f;
//        c = (int) z;
//        // nói rõ về việc muốn nói về gì??
//
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}
