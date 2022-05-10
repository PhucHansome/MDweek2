package MD22.Java.MD2week2.Abstrac_Interface.Animal_Edible_Fruit;

public class Tiger extends Animal implements Edible{
    @Override
    public String makeSoud() {
        return "Tiger: roarrrr!";
    }

    @Override
    public String howToEat() {
        return "Tiger is fired";
    }

    @Override
    public String howToSleep() {
        return "sleep after sun down";
    }
}
