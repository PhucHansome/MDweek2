package week1.Java.MD2week2.Demo.nhadai;

public class Main {
    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice();
        IMailBox IMailBox = new MailBox();
//        obesever.update("1");
        postOffice.addObesever(IMailBox);

        IMailBox IMailBox1 = new MailBox();
//        obesever1.update("alo");
        postOffice.addObesever(IMailBox1);

        IMailBox IMailBox2 = new MailBox();
        postOffice.addObesever(IMailBox2);
//        obesever2.update("ba");

        postOffice.newEmail();
        postOffice.notifyObesever();

    }
}

