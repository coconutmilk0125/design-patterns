package com.keke.proxy.cglib;

public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        //获取到代理对象，并将目标对象传递给代理对象
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(teacherDao).getProxyInstance();
        //执行代理对象的方法，触发intercept方法，从而实现对目标对象的调用
        proxyInstance.teach();
    }
}
