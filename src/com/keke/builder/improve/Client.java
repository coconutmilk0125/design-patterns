package com.keke.builder.improve;

public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.construct();

        HighBuilding highBuilding = new HighBuilding();
        houseDirector = new HouseDirector(highBuilding);
        House house1 = houseDirector.construct();

        StringBuilder stringBuilder = new StringBuilder("1232");

    }
}
