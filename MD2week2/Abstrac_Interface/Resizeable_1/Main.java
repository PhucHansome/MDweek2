package MD22.Java.MD2week2.Abstrac_Interface.Resizeable_1;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        System.out.println("diện tích hình tròn trước khi thay đổi: " + ((Circle) shapes[0]).getArea());
        ((Circle) shapes[0]).resize(90);
        shapes[1] = new Rectangle(2,6);
        System.out.println("diện tích hình chữ nhật trước khi thay đổi là: " + ((Rectangle) shapes[1]).getArea());
        ((Rectangle) shapes[1]).resize(7);
        shapes[2] = new Square(4);
        System.out.println("Diện tích hình vuông trước khi thay đổi là: " + ((Square)shapes[2]).getArea());
        ((Square) shapes[2]).resize(4);

        for (Shape sh : shapes){
            if (sh instanceof Circle){
                System.out.println("Diện tích hình tròn sau khi thay đổi là: " + ((Circle) sh).getArea());
            }
            if (sh instanceof Rectangle){
                System.out.println("Diện tích hình chữ nhật sau khi thay đổi là: " + ((Rectangle) sh).getArea());
            }
            if (sh instanceof Square){
                System.out.println("Diện tích hình vuông sau khi thay đổi là: "+ ((Square) sh).getArea());
            }

        }
    }
}
