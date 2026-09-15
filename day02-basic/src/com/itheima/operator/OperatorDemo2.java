package com.itheima.operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        //目标：掌握赋值运算符
        int a = 10;
        print(10);
        print2(a);
    }
    public static void print(int a) {
        a++;
        ++a;
        System.out.println(a);

        a--;
        --a;
        System.out.println(a);
    }
    //设计一个方法，理解自增和自减在变量前后的区别
    public static void print2(int a) {
        int b = a++;
        System.out.println(b);
        System.out.println(a);
        int c = ++a;
        System.out.println(c);
        System.out.println(a);
    }
}
