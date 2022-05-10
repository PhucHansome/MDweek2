package MD22.Java.MD2week1.AssMethod.AccesModifier;

public class Main {
    public static void main(String[] args) {
        Cricle cricle = new Cricle(2.0);
        System.out.println(cricle.getRadius());
        System.out.printf("%.2f", cricle.getArea());
    }
}
