package com.itheima.type;

public class TypeDemo2 {
    public static void main(String[] args) {
        //理解表达式的自动转换
        byte a = 120;
        byte b = 110;
        int c = add2(a, b);
        System.out.println(c);
    }

    //定义一个多类型数据输入的加法
    public static double add(int a, int b, char c, byte d, double f) {
        //表达式的最终结果类型是由最高类型决定
        return a + b + c + d + f;

    }

    public static byte add2(byte a, byte b) {
        byte c = (byte) (a + b);
        return c;
    }

    public static int add3(byte a, byte b) {
        //byte char short运算时会直接提升为int运算
        return a + b;
    }
}
