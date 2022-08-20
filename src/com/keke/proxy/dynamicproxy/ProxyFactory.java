package com.keke.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    // 维护一个目标对象，Object
    private Object target;

    // 构造器，对target进行初始化
    public ProxyFactory(Object target) {
        this.target = target;
    }

    //
    public Object getProxyInstance() {
        /**
         * 1. ClassLoader loader: 指定当前目标对象使用的类加载器，获取方法固定
         * 2.
         *
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JDK代理开始。。。");
                // 反射机制调用目标对象的方法 返回值类型调用方法的返回值
                Object returnVal = method.invoke(target, args);
                System.out.println("JDK代理提交。。。");
                return returnVal;
            }
        });
    }

}
