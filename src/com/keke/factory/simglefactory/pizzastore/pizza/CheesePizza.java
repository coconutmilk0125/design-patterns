package com.keke.factory.simglefactory.pizzastore.pizza;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("准备制作奶酪披萨，材料准备中...");
    }
}
