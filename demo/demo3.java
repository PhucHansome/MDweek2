package week1.Java.MD2week1.demo;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter height: ");
        double height = scanner.nextDouble();
        drawRectangle rectangle1 = new drawRectangle(width, height);
        System.out.println(rectangle1.display());

    }
    public static class drawRectangle{
        private double width;
        private double height;
        public drawRectangle(double width, double height){
            this.width = width;
            this.height = height;
        }
        public double getWidth(){
            return width;
        }
        public double getHeight(){
            return height;
        }
        public void setWidth(double width){
            this.width = width;
        }
        public void setHeight(double height){
            this.height = height;
        }
        public double getArea() {
            return width * height;
        }
        public double getPerimeter() {
            return (height + width) * 2;
        }
        public String display(){
            return "Area Rectangle = "
                    + getArea()
                    + "Perimeter Rectangle"
                    + getPerimeter();
        }

    }
}

