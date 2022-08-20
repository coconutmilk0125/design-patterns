package com.keke.bridge;

public class Client {
    public static void main(String[] args) {

        Phone phone1 = new FoldedPhone(new XiaoMi());
        phone1.open();
        phone1.close();
        phone1.call();

    }
}
