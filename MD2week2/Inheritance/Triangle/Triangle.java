//package MD22.Java.MD2week2.Inheritance.Triangle;
//
//
//public class Triangle extends Shape {
//    private double side1, side2, side3;
//
//    public Triangle() {
//        side1 = 1;
//        side2 = 1;
//        side3 = 1;
//    }
//
//    public Triangle(String color) {
//        super(color);
//    }
//
//    public void setSide(double side1, double side2, double side3) {
//        if (this.side1 + this.side2 > this.side3 && this.side2 + this.side3 > this.side1 && this.side1 + this.side3 > this.side2) {
//            this.side1 = side1;
//            this.side2 = side2;
//            this.side3 = side3;
//        } else {
//            System.out.println("Your triangle doesn't exist");
//        }
//    }
//
//    public double getSide1() {
//        return side1;
//    }
//
//    public double getSide2() {
//        return side2;
//    }
//
//    public double getSide3() {
//        return side3;
//    }
//
//    public double getPrimeter() {
//        return side1 + side2 + side3;
//    }
//
//    public double getArea() {
//        if (side1 + side2 > side3
//                && side2 + side3 > side1
//                && side3 + side1 > side2) {
//            double p = getPrimeter() / 2;
//            return Math.ceil(Math.sqrt(p * (p - side1) * (p - side2) * (p - side3))*100)/100;
//        }
//        return -1;
//    }
//
//    @Override
//    public String toString() {
//        if (side1 + side2 > side3 && side1 + side3 > side2 && side3 + side2 > side1) {
//            return "This is a triangle with side length " + side1 + "cm \n" +
//                    "It has a perimeter of " + getPrimeter() + "cm \n" +
//                    " and an Area of " + Math.ceil(getArea() * 1000) / 1000 + "cm2. "
//                    + super.toString();
//        }
//        return "Your triangle doesn't exist";
//    }
//}
