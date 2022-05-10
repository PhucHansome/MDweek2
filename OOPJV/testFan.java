package MD22.Java.MD2week1.OOPJV;

public class testFan {
    public static void main(String[] args) {
        Fan f = new Fan();
        System.out.println(f.toString());
        f.setColor("red");
        f.setOn(true);
        f.setRadius(6.7);
        f.setSPEED(3);
//        f.setOff(false);
        System.out.println(f.toString());
    }
}
