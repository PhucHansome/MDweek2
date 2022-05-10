package MD22.Java.MD2week1.demo.Interface;

import MD22.Java.MD2week1.demo.Interface.animal.Animal;
import MD22.Java.MD2week1.demo.Interface.animal.Bird;
import MD22.Java.MD2week1.demo.Interface.animal.Dog;
import MD22.Java.MD2week1.demo.Interface.animal.Fish;
import MD22.Java.MD2week1.demo.Interface.iinterface.Barkable;
import MD22.Java.MD2week1.demo.Interface.iinterface.Flyeable;
import MD22.Java.MD2week1.demo.Interface.iinterface.Runable;
import MD22.Java.MD2week1.demo.Interface.iinterface.Swimable;
import MD22.Java.MD2week1.demo.Interface.machine.Car;
import MD22.Java.MD2week1.demo.Interface.machine.Machine;
import MD22.Java.MD2week1.demo.Interface.machine.Planes;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Bird();
        animals[1] = new Dog();
        animals[2] = new Fish();

        Machine[] Mach = new Machine[2];
        Mach[0] = new Car();
        Mach[1] = new Planes();
        for (Animal ani : animals) {
            if (ani instanceof Barkable) {
                System.out.println("\n"+((Barkable) ani).Noise());
            }
            if (ani instanceof Flyeable) {
                System.out.println("\n"+((Flyeable) ani).Fly());
            }
            if (ani instanceof Runable) {
                System.out.println("\n"+((Runable) ani).Run());
            }
            if (ani instanceof Swimable) {
                System.out.println("\n"+((Swimable) ani).Swim());
            }
        }
        for (Machine mach : Mach) {
            if (mach instanceof Runable) {
                System.out.println("\n"+((Runable) mach).Run());

            }
            if (mach instanceof Flyeable) {
                System.out.println("\n"+((Flyeable) mach).Fly());
            }

        }
    }
}
