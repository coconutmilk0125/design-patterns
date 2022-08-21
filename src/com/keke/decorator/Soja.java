package com.keke.decorator;

public class Soja extends Decorator{
    public Soja(Drink obj) {
        super(obj);
        setDes("豆浆");
        setPrice(1.5f);
    }
}
