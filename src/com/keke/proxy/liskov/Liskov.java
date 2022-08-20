package com.keke.proxy.liskov;

public class Liskov {
}

class Base {

}

class A extends Base{
    public int func1(int a, int b) {
        return a - b;
    }
}

class B extends Base{

    private A a = new A();

    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }

    public int func1(int a, int b) {
        return a+b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 0;
    }
}
