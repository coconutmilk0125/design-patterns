package com.keke.builder.improve;

// 抽象的建造者
public abstract class HouseBuilder {

    protected House house = new House();

    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    // 建好房子后，把产品（房子）返回
    public House buildHouse() {
        return house;
    }
}
