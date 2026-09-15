package com.itheima.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入两个数字进行运算：");
        System.out.println("请输入第一个数：");
        double a = sc.nextDouble();
        System.out.println("请输入第二个数：");
        double b = sc.nextDouble();
        System.out.println("请输入运算符：（）+,-,*,/,%");
        String operator = sc.next();
        double result = result(a,b,operator);
        System.out.println("结果是："+result);
    }
    public static double result(double a,double b,String operator){
        double result=0;
        switch (operator){
            case "+":
                result=a+b;
                break;
            case "-":
                result=a-b;
                break;
            case "*":
                result=a*b;
                break;
            case "/":
                result=a/b;
                break;
            case "%":
                result=a%b;
                break;
            default:
                System.out.println("输入的运算符有误");
        }
        return result;
    }

}
