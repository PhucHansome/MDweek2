package MD22.Java.MD2week2.Abstrac_Interface.Animal_Edible_Fruit;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSoud() {
        return "Chicken: cluck - cluck!";
    }

    @Override
    public String howToEat() {
        return "Baked Up ";
    }

    @Override
    public String howToSleep() {
        return "Sleeping after sun down";
    }
}
