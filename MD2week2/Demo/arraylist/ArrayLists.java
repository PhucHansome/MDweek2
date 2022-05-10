package week1.Java.MD2week2.Demo.arraylist;


import java.util.ArrayList;
import java.util.List;

public class ArrayLists {


    public static class ArrayLis {
        public static void main(String[] args) {
            List<String> obj = new ArrayList<>();
            System.out.println("Add phần tử");
            obj.add("obj 1");
            obj.add("obj 2");
            obj.add("obj 3");
            obj.add("obj 4");
            obj.add("obj 5");
            obj.add("obj 5");
            obj.add("obj 3");
            System.out.println("Array list" + obj);
            System.out.println("duyệt qua vòng lặp");
            for (String ob : obj) {
                System.out.println(ob);
            }

            System.out.println("Mảng Array cũ : "+obj);
            obj.remove("obj 5");
            System.out.println("Xóa obj 5: "+obj);
            obj.remove(3);
            System.out.println("Xóa phần tử thứ 3"+obj);
            obj.set(2, "update");
            System.out.println("Set trong array: " + obj);
            int pos = obj.indexOf("obj 3");
            System.out.println(pos);
            System.out.println("Lấy ra phần tử ở vị trí thứ 3: "+obj.get(3));
            System.out.println("Độ dài mảng"+obj.size());
            System.out.println("Có phần tử obj 2 trong mảng không: "+obj.contains("obj 2"));
            obj.clear();
            System.out.println("Đã xóa toàn bộ mảng "+obj);
        }
    }
}


