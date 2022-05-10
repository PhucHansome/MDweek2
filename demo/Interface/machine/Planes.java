package MD22.Java.MD2week1.demo.Interface.machine;

import MD22.Java.MD2week1.demo.Interface.iinterface.Flyeable;

public class Planes extends Machine implements Flyeable {
    @Override
    public String Fly() {
        return "Planes said: I'm Fly like You!!";
    }
}
