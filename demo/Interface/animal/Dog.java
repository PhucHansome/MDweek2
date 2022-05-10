package MD22.Java.MD2week1.demo.Interface.animal;

import MD22.Java.MD2week1.demo.Interface.iinterface.Barkable;
import MD22.Java.MD2week1.demo.Interface.iinterface.Runable;

public class Dog extends Animal implements Runable, Barkable {
    @Override
    public String Noise() {
        return "Dog Said: Grau Grau Grauuuuu";
    }

    @Override
    public String Run() {
        return "Dog said: gau gau gau gấu";
    }
}
