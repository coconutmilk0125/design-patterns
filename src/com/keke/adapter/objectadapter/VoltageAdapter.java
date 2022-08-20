package com.keke.adapter.objectadapter;

public class VoltageAdapter implements IVoltage5V {

    private Voltage220 voltage220; // 关联关系里面的聚合

    public VoltageAdapter(Voltage220 voltage220) {
        this.voltage220 = voltage220;
    }

    /*@Override
    public int output5V() {
        int srcV = voltage220.output220V();
        int dstV = srcV / 44;
        return dstV;
    }*/

    @Override
    public int output5V() {
        int dstV = 0;
        if (null != voltage220) {
            int srcV = voltage220.output220V();
            System.out.println("************使用对象适配器进行转换************");
            dstV = srcV / 44;
            System.out.println("************适配完成，输出电压为："+dstV+"**************");
        }
        return dstV;
    }
}
