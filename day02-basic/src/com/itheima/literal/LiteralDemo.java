package com.itheima.literal;

public class LiteralDemo {
    public static void main(String[] args) {
        printLiteral();
    }

    static void printLiteral() {
        //请帮我直接输出常见的字面量
        System.out.println("Hello World");
        //1.整型字面量，直接写
        System.out.println(123);
        //2.浮点型字面量，直接写
        System.out.println(123.45);
        //3.布尔型字面量，直接写
        System.out.println(true);
        System.out.println(false);
        //4.字符型字面量，单引号括起来
        System.out.println('a');
        //5.字符串型字面量，双引号括起来
        System.out.println("Hello World");
        //掌握一些特殊字符，只作为一个字符，\n换行，\t制表符，\\反斜杠，\'单引号，\"双引号
        System.out.println("1\n1");
        System.out.println("\t1");
        System.out.println("1\\1");
        System.out.println("1'1");
        System.out.println("1\"1");

    }
}
