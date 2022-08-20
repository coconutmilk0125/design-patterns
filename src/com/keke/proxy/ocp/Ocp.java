package com.keke.proxy.ocp;

public class Ocp {

}

class GraphicEditor {

}

abstract class Shape {
    int m_type;

    public abstract void draw();
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("绘制长方形");
    }
}

