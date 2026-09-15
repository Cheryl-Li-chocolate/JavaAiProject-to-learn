package com.itheima.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        //目标：理解关系运算符
        print(10, 20);
        print(10, 10);
    }
    static void print(int a, int b) {
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
    }
}
