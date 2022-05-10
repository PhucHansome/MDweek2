package MD22.Java.MD2week2.Inheritance.Point2DPoint3D;

import java.util.Arrays;

public class Point2D {
    public float x = 0.0f;
    public float y = 0.0f;
    Point2D() {
    }
    public void Point2D(float x, float y ){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float [] getXY(){
//        float [] arr = new float[2];
//        arr[0] = this.x;
//        arr[1] = this.y;
//        return arr;
        return new float[]{x,y};
    }


    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                ", Array=" + Arrays.toString(getXY()) +
                '}';
    }
}
