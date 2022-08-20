package com.keke.singleton.type2;

import com.keke.singleton.type2.Singleton;

public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance = Singleton.getInstance();
        System.out.println(instance.hashCode() == instance1.hashCode());
    }
}

class Singleton {
    private Singleton() {

    }

    private static Singleton instance;

    static { // 在静态代码块中，创建单例对象
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }

}
