package MD22.Java.MD2week1.demo;

public class demo1 {
    private int id;
    private String fullName;
    Demo demo;

    public demo1(int id, String fullName, Demo demo) {
        this.id = id;
        this.fullName = fullName;
        this.demo = demo;
    }
    @Override
    public String toString(){
        return "Customer{" +
                "id = " + id +
                ", fullName =' " + fullName + '\'' +
                ", address = " + demo +
                '}';
    }

    public static void main(String[] args) {
//        Demo.Location location = new Demo.Location(234.34, 3435.43);
//        Demo demo = new Demo("28", "Nguyễn tri phương", "Huế", location);
//        demo1 Demo1 = new demo1(1,"Anh nguyen", demo);
//        System.out.println(demo);
    }


}
