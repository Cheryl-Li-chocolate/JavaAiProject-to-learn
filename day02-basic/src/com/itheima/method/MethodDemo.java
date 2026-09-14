package com.itheima.method;

public class MethodDemo {
    //目标：掌握方法的定义和调用
    public static void main(String[] args) {
        // 调用方法
        int sum=add(1,2);
        System.out.println(sum);
        System.out.println(getCode(6));
    }

    // 定义一个方法，求任意两个整数的和并返回
    public static int add(int a, int b) {
        return a + b;
    }

    //定义一个方法，获取一个指定位数的验证码返回
    //掌握方法的定义格式
    //需要接收数据吗？需要，接收位数，int len
    //需要返回数据吗？需要，返回验证码 String
    public static String getCode(int len) {
        //定义一个字符串变量，用来存储验证码
        String code = "";
        //定义一个for循环，循环len次
        for (int i = 0; i < len; i++) {
            //在0-9之间随机生成一个数字，并转换成字符串，添加到code中
            code += (int)(Math.random() * 10);
        }
        //返回验证码
        return code;
    }
}
