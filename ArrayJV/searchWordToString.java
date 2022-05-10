package MD22.Java.MD2week1.ArrayJV;

public class searchWordToString {
    public static void main(String[] args) {
        String chuoi = "Anh Yeu Em nhieu lam";
        char Kytu= 'e';
        int count = 0;
        for (int i = 0; i < chuoi.length();i++){
            if (chuoi.charAt(i) == Kytu){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + Kytu +" trong chuỗi: " + chuoi + " = " + count );
    }

}
