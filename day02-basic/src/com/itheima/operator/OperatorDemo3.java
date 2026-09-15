package com.itheima.operator;

public class OperatorDemo3 {
    public static void main(String[] args) {

    }
    public static void receive(){
        int a=10;
        a-=5;
        System.out.println(a);

        byte a1=10;
        byte a2=15;
        a1+=a2;//等价于a1=（byte）(a1+a2)
        System.out.println(a1);

    }
}
