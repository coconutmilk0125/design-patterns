package com.keke.builder;

public class CommonHouse extends AbstractHouse{

    @Override
    public void buildBasic() {
        System.out.println("给普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("给普通房子糊墙");
    }

    @Override
    public void roofed() {
        System.out.println("给普通房子封顶");
    }
}
