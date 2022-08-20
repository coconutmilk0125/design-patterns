package com.keke.singleton.type8;

public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance = Singleton.getInstance();
        System.out.println(instance.hashCode() == instance1.hashCode());
    }
}

class Singleton {
    private static volatile  Singleton instance;

    private Singleton() {

    }

    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static synchronized Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
