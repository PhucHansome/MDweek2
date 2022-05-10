package MD22.Java.MD2week1.demo.Interface.animal;

import MD22.Java.MD2week1.demo.Interface.iinterface.Flyeable;

public class Bird extends Animal implements Flyeable {

    @Override
    public String Fly() {
        return "Bird said: I can't Flying now";
    }
}
