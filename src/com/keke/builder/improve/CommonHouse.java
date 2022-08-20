package com.keke.builder.improve;

public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("common basic");
    }

    @Override
    public void buildWalls() {
        System.out.println("build common walls");
    }

    @Override
    public void roofed() {
        System.out.println("common roof");
    }
}
