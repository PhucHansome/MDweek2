package week1.Java.MD2week1.AssMethod.StaticProperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mazda 6", "Skyactive 6");
        System.out.println(Car.numberOfCars);
    }
}

