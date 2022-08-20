package com.keke.prototype;

import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Sheep sheep1 = new Sheep("tom", 1, "white");

        List<Sheep> sheepList = new LinkedList<>();
        sheepList.add(sheep1);
        for (int i = 0; i < 10; i++) {
            sheepList.add(new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor()));
        }
        for (Sheep sheep: sheepList) {
            System.out.println(sheep.toString());
        }
    }
}
