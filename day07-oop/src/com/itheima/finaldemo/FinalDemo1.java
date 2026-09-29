package com.itheima.finaldemo;

public class FinalDemo1 {
    //final修饰静态成员变量
    //这个变量今后被称为常量，不能被修改，作为系统的配置信息
    public static final String SCHOOL_NAME="SZU";
    //final修饰实例变量（一般没有意义）
    private final String name="张三";

    public static void main(String[] args) {
        final double PI=3.14;
        //PI=3.1415;//错误，不能修改final修饰的变量

        buy(0.8);
        //final 修饰引用类型的变量，变量存储的地址不能被改变，但地址所指向的对象的内容是可以被改变的
        final int[] arr={11,22,33,44};
        //arr=new int[]{22,33,44,23};
        arr[2]=90;
        System.out.println(Constant.SYSTEM_NAME);

    }
    public static void buy(final double amount){
        //amount=1.0;//错误，不能修改final修饰的局部变量
    }
}
/*
变量有哪些呢？
1. 局部变量
2. 成员变量
    2.1 实例变量
    2.2 静态变量

* */