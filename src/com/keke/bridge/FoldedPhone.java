package com.keke.bridge;

public class FoldedPhone extends Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("FoldedPhone open!!");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("FoldedPhone close!");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("FoldedPhone call!");
    }
}
