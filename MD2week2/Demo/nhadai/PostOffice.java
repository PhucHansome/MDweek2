package week1.Java.MD2week2.Demo.nhadai;

import java.util.ArrayList;
import java.util.List;

public class PostOffice implements IPostOffice {
    public String address;
    List<MailBox> mailBoxList;

    PostOffice() {
        mailBoxList = new ArrayList<>();
    }

    @Override
    public void addObesever(IMailBox IMailBox) {
        mailBoxList.add((MailBox) IMailBox);
    }

    @Override
    public void removeObesever(IMailBox IMailBox) {
        mailBoxList.remove(IMailBox);
    }

    @Override
    public void notifyObesever() {
        for (MailBox mailBox : mailBoxList) {
            mailBox.update(address);
        }

    }

    public void newEmail() {
        address = "14h30 hop tai 28 nguyen tri phuong ";
    }
}
