package week1.Java.MD2week1.OOPJV;

import java.util.Scanner;

class quadraticEquation2 {
    public float a, b, c;
    double delta;
    double x1, x2;
    Scanner input = new Scanner(System.in);

    public void insert() {
        System.out.print("Nhập a: ");
        this.a = input.nextFloat();
        System.out.print("nhập b: ");
        this.b = input.nextFloat();
        System.out.print("Nhập c: ");
        this.c = input.nextFloat();
    }

    public double caculatorDelta() {
        delta = ((Math.pow(b, 2)) - 4 * a * c);
        return delta;
    }

    public double nghiemDuyNhat() {
        x1 = -c / b;
        return x1;
    }

    public double nghiemkep() {
        x1 = -b / (2 * a);
        return x1;
    }

    public void nghiemPhanBiet() {
        x1 = ((-b + Math.sqrt(delta)) / (2 * a));
        x2 = ((-b - Math.sqrt(delta)) / (2 * a));
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}

class dieukien {
    quadraticEquation2 pt = new quadraticEquation2();

    public void nhappt() {
        pt.insert();
    }

    public void kiemtra() {
        if (pt.a == 0) {
            if (pt.b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình có 1 nghiệm duy nhất: " + pt.nghiemDuyNhat());
            }
        } else {
            if (pt.caculatorDelta() < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else {
                if (pt.caculatorDelta() == 0) {
                    System.out.println("Phương trình có nghiệm kép: " + pt.nghiemkep());
                } else {
                    System.out.println("Phương trình có 2 nghiệm phân biệt: ");
                    pt.nghiemPhanBiet();
                }
            }
        }
    }
}

public class quadraticEquation {
    public static void main(String[] args) {
        dieukien dk = new dieukien();
        dk.nhappt();
        dk.kiemtra();
    }
}


