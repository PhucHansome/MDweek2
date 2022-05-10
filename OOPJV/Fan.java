package MD22.Java.MD2week1.OOPJV;

import static sun.security.ssl.SSLLogger.isOn;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int SPEED = 1;
    private boolean on;
    private boolean off;
    private  double radius = 5.0;
    private String Color = "Blue";
    Fan(){}
    public void fan(){}

    public String getColor() {
        return Color;
    }

    public double getRadius() {
        return radius;
    }

    public int getFAST() {
        return FAST;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getSPEED() {
        return SPEED;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setOff(boolean off) {
        this.off = off;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setSPEED(int SPEED) {
        this.SPEED = SPEED;
    }

    private boolean isOn() {
//        this.on = on;
        return on;
    }

    public String toString() {
        return "  speed: " +  SPEED + " radius: " +radius +" color: " + getColor()
                + (isOn()? " fan on " : " fan off ");
    }
}


