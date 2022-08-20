package com.keke.singleton.type1;

public class SingletonTest01 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance = Singleton.getInstance();
        System.out.println(instance.hashCode() == instance1.hashCode());
    }
}


class Singleton {


    private Singleton() {

    }

    private final static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
