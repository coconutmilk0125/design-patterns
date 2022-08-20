package com.keke.factory.simglefactory.pizzastore.order;

import com.keke.factory.simglefactory.pizzastore.pizza.CheesePizza;
import com.keke.factory.simglefactory.pizzastore.pizza.GreekPizza;
import com.keke.factory.simglefactory.pizzastore.pizza.Pizza;

public class OrderPizza {

    /*public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = "greek";
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            } else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }*/

    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory, "greek");
    }

    public void setFactory(SimpleFactory simpleFactory, String type) {
        String orderType = "";
        this.simpleFactory = simpleFactory;
        do {
            orderType = type;
            pizza = this.simpleFactory.createPizza(orderType);

            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购披萨失败！");
                break;
            }
        } while (true);
    }
}
