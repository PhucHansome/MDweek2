package week1.Java.MD2week2.Demo.nhadai;

public class MailBox implements IMailBox {

    @Override
    public void update(String address) {
        System.out.println("Mail box received mail: " + address);
    }
}
