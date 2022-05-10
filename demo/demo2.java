package MD22.Java.MD2week1.demo;

public class demo2 {
   private double radius = 1.0;
   private String color = "red";
    public demo2(double radius){
        this.radius = radius;

    }
    double getArea(){
        return Math.PI * radius * radius ;
    }

    public double getRadius() {
        return radius;
    }

}