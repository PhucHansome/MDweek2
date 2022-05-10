package MD22.Java.MD2week2.Inheritance.Circle_Cylinder;

public class Circle {
    public double radius = 3.0 ;
    public String color = "Red";

    Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius= " + radius +
                ", color='" + color + '\''
                + " Area: " + Math.ceil(getArea() * 100)/100 +
                '}';
    }
}
