package MD22.Java.MD2week2.Abstrac_Interface.Interface_Comparator;

import MD22.Java.MD2week2.Abstrac_Interface.Comparable.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2){
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
