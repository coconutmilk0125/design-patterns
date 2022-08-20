package com.keke.proxy.inversion.improve;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}
class Email {
    public String getInfo() {
        return "info: Hello world!";
    }
}
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
