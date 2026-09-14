package com.itheima.method;

///
public class MethodDemo2 {
    public static void main(String[] args) {
        printInt(10);
        printInt("Alice");
        printInt(5, 3.5);
    }

    //定义一个方法，打印一个整数
    public static void printInt(int num) {
        System.out.println(num);
    }

    //定义一个重载方法
    public static void printInt(String str) {
        System.out.println(str);
    }

    //定义一个重载方法
    public static void printInt(int a, double b) {
        System.out.println(a + b);
    }

    //定义一个重载方法
    public static void printInt(double b, int a) {
        System.out.println(a + b);
    }

    //注意：方法重载只关心方法名称相同，形参列表不同（类型，数量，顺序不同），其他无所谓
}


