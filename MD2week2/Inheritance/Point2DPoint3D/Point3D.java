package MD22.Java.MD2week2.Inheritance.Point2DPoint3D;

import java.util.Arrays;

public class Point3D extends Point2D {
    public float z = 0.0f;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float[] getXYZ(){
        float [] arr = new float[3];
        arr[0] = x;
        arr[1] = y;
        arr[2] = z;
        return arr;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", Array=" + Arrays.toString(getXYZ()) +
                '}';
    }
}
