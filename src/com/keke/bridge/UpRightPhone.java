package com.keke.bridge;

public class UpRightPhone extends Phone{
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("UpRightPhone open!");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("UpRightPhone close!");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("UpRightPhone call!");
    }
}
