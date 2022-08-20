package com.keke.builder.improve;

public class HighBuilding extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("high basic");
    }

    @Override
    public void buildWalls() {
        System.out.println("high walls");
    }

    @Override
    public void roofed() {
        System.out.println("transparent roof");
    }
}
