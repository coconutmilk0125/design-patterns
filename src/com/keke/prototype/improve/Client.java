package com.keke.prototype.improve;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep1 = new Sheep("tom", 1, "white");
        sheep1.setFriend(new Sheep("jack", 2, "black"));
        Sheep sheep2 = (Sheep) sheep1.deepClone();
        System.out.println(sheep2.getFriend());
        Sheep sheep3 = (Sheep) sheep1.deepClone();
        System.out.println(sheep2.getFriend().hashCode() == sheep3.getFriend().hashCode());
    }
}
