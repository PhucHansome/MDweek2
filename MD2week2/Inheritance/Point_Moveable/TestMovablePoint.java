package MD22.Java.MD2week2.Inheritance.Point_Moveable;

public class TestMovablePoint {
    public static void main(String[] args) {
        MoveablePoint m = new MoveablePoint();
        System.out.println(m);
        m.setXY(2,3);
        m.setX(4);
        m.setY(6);
        m.setSpeed(4, 5);
        System.out.println(m.toString());
        m.move();
        System.out.println(m);
    }
}
