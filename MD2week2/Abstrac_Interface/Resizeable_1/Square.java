package MD22.Java.MD2week2.Abstrac_Interface.Resizeable_1;

public class Square extends Shape implements Resizeable{
    public double width;
    Square(){}
    public Square(double width){
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return width * width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width + "Diện tích là : "+getArea() +
                '}';
    }

    @Override
    public void resize(double ratio) {
        width = width * Math.sqrt(ratio);

    }
}
