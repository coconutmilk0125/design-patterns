package com.keke.singleton.type6;

public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance = Singleton.getInstance();
        System.out.println(instance.hashCode() == instance1.hashCode());
    }
}

class Singleton {
    // volatile 立即同步到主存，防止指令重排
    private static volatile Singleton instance;

    private Singleton() {

    }

    //提供一个静态的公有方法， 加入双重检查代码，解决线程安全和懒加载问题, 同时保护了效率
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
