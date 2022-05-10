package MD22.Java.MD2week2.Abstrac_Interface.Animal_Edible_Fruit;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal ani : animals) {
//            System.out.println("Nó kêu là: " + animal.makeSoud());
//            System.out.println("Nó ngủ khi: " + animal.howToSleep());
//            System.out.println(animal.howToEat());
//            System.out.println();
            if (ani instanceof Chicken) {
                Edible edibler = (Chicken) ani;
                System.out.println(edibler.howToEat());
            }
            if (ani instanceof Tiger) {
                Edible edibler = (Tiger) ani;
                System.out.println(edibler.makeSoud());
                System.out.println(edibler.howToEat());
            }

        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fru : fruits){
            System.out.println(fru.howToEat());
        }




    }

}

