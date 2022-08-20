package com.keke.proxy.segregation.improve;

public class Segregation1 {

}


interface Interface1 {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interface1 {
    @Override
    public void operation1() {
        System.out.println("B 实现 1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现 2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现 3");
    }

    @Override
    public void operation4() {
        System.out.println("B 实现 4");
    }

    @Override
    public void operation5() {
        System.out.println("B 实现 5");
    }
}

class D implements Interface1 {
    @Override
    public void operation1() {
        System.out.println("D 实现 1");
    }

    @Override
    public void operation2() {
        System.out.println("D 实现 2");
    }

    @Override
    public void operation3() {
        System.out.println("D 实现 3");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现 4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现 5");
    }
}

class A { //A类通过接口Interface1 依赖（使用）B类，但是123
    public void depend1(Interface1 i) {
        i.operation1();
    }
    public void depend2(Interface1 i) {
        i.operation2();
    }
    public void depend3(Interface1 i) {
        i.operation3();
    }
}

class C { //A类通过接口Interface1 依赖（使用）B类，但是123
    public void depend1(Interface1 i) {
        i.operation1();
    }
    public void depend2(Interface1 i) {
        i.operation4();
    }
    public void depend3(Interface1 i) {
        i.operation5();
    }
}
