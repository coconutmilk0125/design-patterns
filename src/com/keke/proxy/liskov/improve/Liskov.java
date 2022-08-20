package com.keke.proxy.liskov.improve;

public class Liskov {
}

class A {
    public int func1(int a, int b) {
        return a - b;
    }
}

class B extends A{
    @Override
    public int func1(int a, int b) {
        return a+b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 0;
    }
}
