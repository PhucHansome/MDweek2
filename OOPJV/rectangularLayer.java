package week1.Java.MD2week1.OOPJV;

import java.awt.*;
import java.util.Scanner;

public class rectangularLayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter height: ");
        double height = scanner.nextDouble();
        DrawRectangle rectangle1 = new DrawRectangle(width, height);
        System.out.println(rectangle1.display());
    }
    public static class DrawRectangle {
        private double width;
        private double height;
        public DrawRectangle() {}
        public DrawRectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        public double getWidth(){
            return width;
        }
        public void setWidth(double width) {
            this.width = width;
        }
        public void setHeight(double height) {
            this.height = height;
        }
        public double getHeight(){
            return height;
        }
        public double getArea(){
            return width * height ;
        }
        public double getPerimeter() {
            return (width + height) * 2;
        }
        public String display(){
            return "Area Rectangle = "
                    + getArea()
                    + "Perimeter Rectangle"
                    + getPerimeter();
        }
    }
}
