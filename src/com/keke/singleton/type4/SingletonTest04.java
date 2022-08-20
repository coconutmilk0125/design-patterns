package com.keke.singleton.type4;

public class SingletonTest04 {
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
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
