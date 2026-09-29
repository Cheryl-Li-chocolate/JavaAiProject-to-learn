package com.itheima.singleinstance;

public class Test {
    public static void main(String[] args) {
//        A a1=A.a;
//        A a2=A.a;
//        System.out.println(a1==a2);
//        a2=null;
//        System.out.println(a2);
//        System.out.println(a1);
        //A.a=null;//错误，不能修改final修饰的变量,所以是没能改到内部的这个单例
        A a1=A.getInstance();
        A a2=A.getInstance();
        System.out.println(a1==a2);

        System.out.println("====================");

        B b1=B.getInstance();
        B b2=B.getInstance();
        System.out.println(b1==b2);



    }
}
