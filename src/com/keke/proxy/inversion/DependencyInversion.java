package com.keke.proxy.inversion;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        Email email = new Email();
        person.receive(email);
    }
}
interface IReceiver {
    public String getInfo();
}
class Email implements IReceiver {

    @Override
    public String getInfo() {
        return "Email info: Hello world!";
    }
}

class Weixin implements IReceiver {

    @Override
    public String getInfo() {
        return "Weixin info: Hello world!";
    }
}
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
