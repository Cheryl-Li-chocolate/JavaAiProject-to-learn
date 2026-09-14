package com.itheima.speedkey;

public class SpeedKeyDemo {
    public static void main(String[] args) {
        System.out.println("Hello World"); //打印helloworld
        System.out.println("----------------");
        printHelloWorld();
        System.out.println("----------------");
        printSum(10, 20);
    }
    /**
     * 打印三行 HelloWorld
     * 该方法会连续输出三行 "Hello World"，用于练习方法定义与调用
     */
    public static void printHelloWorld() {
        // 第一行输出
        System.out.println("Hello World");
        // 第二行输出
        System.out.println("Hello World");
        // 第三行输出
        System.out.println("Hello World");
    }
    //求任意两个整数的和
    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }
}
