package com.keke.proxy.staticproxy;

//  静态代理
public class TeacherDaoProxy implements ITeacherDao{

    private ITeacherDao target; // 目标对象，通过接口来聚合

    private ITeacherDao target2;

    public TeacherDaoProxy(ITeacherDao target, ITeacherDao target2) {
        this.target = target;
        this.target2 = target2;
    }

    @Override
    public void teach() {
        System.out.println("开始代理...");
        target.teach();
        target2.teach();
        System.out.println("结束代理...");
    }
}
