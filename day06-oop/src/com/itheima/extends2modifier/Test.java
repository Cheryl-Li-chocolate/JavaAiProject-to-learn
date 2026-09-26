package com.itheima.extends2modifier;

public class Test {
    public static void main(String[] args) {
        Fu f=new Fu();
        f.defaultMethod();
        f.protectedMethod();
        f.publicMethod();
        //f.privateMethod(); //private修饰的方法，不能在类外访问

    }
}
