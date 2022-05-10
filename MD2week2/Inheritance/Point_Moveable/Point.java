package MD22.Java.MD2week2.Inheritance.Point_Moveable;

import java.util.Arrays;

public class Point {
    public float x = 0.0f;
    public float y = 0.0f;
    Point(){
    }

    public Point(float x, float y) {
    }

    public void Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        return new float[]{x,y};
    }

    @Override
    public String toString() {
        return "Array" + Arrays.toString(getXY());
    }
}
