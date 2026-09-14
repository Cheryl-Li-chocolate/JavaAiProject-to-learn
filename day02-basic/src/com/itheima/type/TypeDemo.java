package com.itheima.type;

public class TypeDemo {
    public static void main(String[] args) {
        //目标：认识自动类型转换，强制类型转换
        byte b = 10;
        print(b);
        print2(b);
        int a=11;
        //强制类型转换
        print3((byte)a);
        byte j=(byte)a;
        print3(j);
        int c=1500;
        print3((byte)c);//强转会溢出

    }
    //定义一个打印整数的方法
    public static void print(int num) {
        System.out.println(num);
    }

    public static void print2(double num) {
        System.out.println(num);
    }
    public static void print3(byte num) {
        System.out.println(num);
    }
}

