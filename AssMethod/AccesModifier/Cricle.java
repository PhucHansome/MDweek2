package week1.Java.MD2week1.AssMethod.AccesModifier;

public class Cricle {
    private double radius = 1.0;
    private String color = "red";

    public Cricle(){

    }
    public Cricle(double radius) {
        this.radius = radius;
    }
    double getArea() {
        return Math.PI * radius * radius;
    }
    double getRadius(){
        return radius;
    }
}
