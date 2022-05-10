package MD22.Java.MD2week1.demo.Interface.machine;

import MD22.Java.MD2week1.demo.Interface.iinterface.Runable;

public class Car extends Machine implements Runable {
    @Override
    public String Run() {
        return "Car Said: Bruuuuu Bruuuu";
    }
}
