package com.itheima.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        printVariable();
    }
    /**
     * 用 Java 8 种基本数据类型定义变量并赋值
     * 8 种基本数据类型：byte, short, int, long, float, double, char, boolean
     */
    public static void printVariable() {
        byte b = 1;           // 字节型，占 1 字节，范围 -128 ~ 127
        short s = 1;          // 短整型，占 2 字节，范围 -32768 ~ 32767
        int i = 1;            // 整型，占 4 字节，最常用
        //注意：随便写一个整数字面量默认是int类型的，这个数据虽然没有超过long的范围，但是超过int的范围，所以报错
        //如果希望这个数据是long类型，必须在后面加 L
        long l = 18955786666669L;          // 长整型，占 8 字节，后缀必须加 L
        //注意：随便写一个浮点数字面量默认是double类型的，如果希望是float类型，必须在后面加 f
        float f = 1.1f;       // 单精度浮点，占 4 字节，后缀必须加 f
        double d = 1.1;       // 双精度浮点，占 8 字节，最常用
        char c = 'a';         // 字符型，占 2 字节，用单引号包裹
        boolean b2 = true;    // 布尔型，只有 true / false 两个值
    }

}
