package com.keke.decorator;

public class CoffeeBar {
    public static void main(String[] args) {
        Drink order = new LongBlack();
        System.out.println("费用1："+order.cost());
        System.out.println("描述信息："+order.getDes());

        order = new Milk(order);
        System.out.println("费用2："+order.cost());
        System.out.println("描述信息："+order.getDes());

        order = new Chocolate(order);
        System.out.println("费用3："+order.cost());
        System.out.println("描述信息："+order.getDes());

        order = new Chocolate(order);
        System.out.println("费用4："+order.cost());
        System.out.println("描述信息："+order.getDes());

    }
}
