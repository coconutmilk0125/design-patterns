package com.keke.adapter.classadapter;

public class VoltageAdapter extends Voltage220 implements IVoltage5V {
    @Override
    public int output5V() {
        int srcV = output220V();
        int dstV = srcV / 44;
        return dstV;
    }
}
