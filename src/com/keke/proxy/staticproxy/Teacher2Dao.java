package com.keke.proxy.staticproxy;

public class Teacher2Dao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("教师2授课中...");
    }
}
