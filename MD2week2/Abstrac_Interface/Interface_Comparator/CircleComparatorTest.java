package MD22.Java.MD2week2.Abstrac_Interface.Interface_Comparator;

import MD22.Java.MD2week2.Abstrac_Interface.Comparable.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(4.0);
        circles[1] = new Circle(5.0);
        circles[2] = new Circle(3.5,"indigo", true);
        System.out.println("pre-sorted:");
        for (Circle circle: circles){
            System.out.println(circle);
        }
        Comparator circleComparator = (Comparator) new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted: ");
        for(Circle circle : circles){
            System.out.println(circle);
        }



    }
}
