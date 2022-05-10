package MD22.Java.MD2week2.Inheritance.ApjShape;

public class Square extends Rectangle {
    public Square() {
    }
    public Square(double side){
        super(side,side);
    }
    public Square (double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public  double getSide(){
        return getWidth();
    }
    public double setSide(){
        return getWidth();
    }
    public double setSide(double side){
        setWidth(side);
        setLength(side);
        return 0;
    }

    @Override
    public void setWidth(double width) {
        setWidth(width);
    }

    @Override
    public void setLength(double length) {
        setLength(length);
    }

    @Override
    public String toString() {
        return "A square with side = "
                + getSide()
                +", Which a subclass of"
                + super.toString();
    }
}
