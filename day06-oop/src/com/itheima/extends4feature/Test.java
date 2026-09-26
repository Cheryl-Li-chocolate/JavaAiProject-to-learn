package com.itheima.extends4feature;

public class Test {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.equals(a));

    }
}
//1.java的类只能是单继承，不支持多继承，支持多层继承
//2.一个类要么默认继承Object类，要么直接继承object类，要么间接继承object类
class A{}
class B extends A{}
class C extends B{}
