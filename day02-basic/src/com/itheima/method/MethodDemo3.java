package com.itheima.method;

public class MethodDemo3 {
    public static void main(String[] args) {
    //掌握在无返回值的方法中单独使用return：提前结束方法

    }
    //设计一个除数的功能。
    public static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("除数不能为0");
            return; //提前结束方法        卫语言风格
        }
        System.out.println(a / b);
    }
}
