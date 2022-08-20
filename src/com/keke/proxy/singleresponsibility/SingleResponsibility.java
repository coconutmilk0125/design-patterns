package com.keke.proxy.singleresponsibility;

public class SingleResponsibility {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("");
    }
}

class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " run .... ");
    }
}
