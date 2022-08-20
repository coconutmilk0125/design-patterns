package com.keke.singleton.type3;

public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance = Singleton.getInstance();
        System.out.println(instance.hashCode() == instance1.hashCode());
    }
}

class Singleton {
    private static   Singleton instance;

    private Singleton() {

    }

    //当用到该方法时，才去创建instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
