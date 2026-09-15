package com.itheima.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        //目标：掌握基本的算术运算符
        int a = 10;
        int b = 3;
        print(a, b);

        System.out.println("---------------");
        print2();

    }

    public static void print(int a, int b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a / b);
        System.out.println((double) a / b);
        System.out.println(1.0 * a / b);
        System.out.println(a / b);
        System.out.println(a % b);
    }

    public static void print2() {
        int a = 5;
        System.out.println("abc" + a);
        System.out.println(5 + a);
        System.out.println('a' + a + "itheima");//能算就会先算，不能算的才拼接

    }
}
