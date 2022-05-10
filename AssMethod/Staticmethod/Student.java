package MD22.Java.MD2week1.AssMethod.Staticmethod;

public class Student {
    private int id;
    private String name;
    private static String college = "ĐH";
    Student(int r, String n) {
        id = r;
        name = n;
    }
    static void change() {
        college = "Codegym";
    }
    void display() {
        System.out.println(id + " - " + name + " - " + college);
    }
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");
        s1.display();
        s2.display();
        s3.display();
    }
}
