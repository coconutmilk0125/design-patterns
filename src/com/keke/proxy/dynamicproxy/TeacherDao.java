package com.keke.proxy.dynamicproxy;

public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师正在授课中...");
    }
}
