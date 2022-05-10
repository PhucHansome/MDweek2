package MD22.Java.MD2week1.demo.Interface.animal;

import MD22.Java.MD2week1.demo.Interface.iinterface.Swimable;

public class Fish extends Animal implements Swimable {
    @Override
    public String Swim() {
        return "Fish said: I can't Swim";
    }
}
