package MD22.Java.MD2week1.demo.Instanceof;

//Xác định kiểu phần tử của mảng
public class Test1 {
    public static void main(String[] args) {
        Object[] objArray = new Object[4];
        objArray[0] = "hello";
        objArray[1] = 1000L;
        objArray[2] = 20;
        objArray[3] = 'c';

        for (int i = 0; i < objArray.length; i++) {
            if (objArray[i] instanceof Integer) {
                System.out.println("kiểu integer: " + objArray[i]);
            } else if (objArray[i] instanceof Long) {
                System.out.println("kiểu long: " + objArray[i]);
            } else if (objArray[i] instanceof Character) {
                System.out.println("kiểu char: " + objArray[i]);
            } else {
                System.out.println("Kiểu khác: " + objArray[i]);
            }
        }
    }
}
