package com.keke.adapter.objectadapter;

public class Phone {
    public void charging(IVoltage5V voltage5V) {
        if (voltage5V.output5V() == 5) {
            System.out.println("电压是5V， 可以充电！");
        } else if (voltage5V.output5V() > 5) {
            System.out.println("电压大于5， 不能充电！");
        }
    }
}
