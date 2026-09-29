package com.itheima.singleinstance;

public class A {
    //单例设计模式
    //public static final A a=new A();
    private static final A a=new A();
    //私有构造器，外部不能创建很多队形
    private A(){}
    public static A getInstance(){
        return a;
    }

}
