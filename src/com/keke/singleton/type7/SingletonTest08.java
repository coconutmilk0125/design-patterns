package com.keke.singleton.type7;

public class SingletonTest08 {
    public static void main(String[] args) {
        Singelton instance = Singelton.INSTANCE;
        Singelton instance1 = Singelton.INSTANCE;
        System.out.println(instance == instance1);
    }
}


enum Singelton {
    INSTANCE;
    public void sayOK() {
        System.out.println("OK!!!");
    }
}
