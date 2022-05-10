package week1.Java.MD2week2.java_collection_framework.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Phuc", 24, "hue");
        Student student1 = new Student("Phuoc", 23, "hue");
        Student student2 = new Student("Dai", 27, "sai gon");
        Student student3 = new Student("Phon", 23, "da nang");

        List<Student> list = new ArrayList<>();

        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);

        Collections.sort(list);
        for(Student st : list){
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("So sánh theo tuổi");
        for (Student st : list){
            System.out.println(st.toString());
        }
    }
}
