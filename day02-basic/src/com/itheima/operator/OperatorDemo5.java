package com.itheima.operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
        print(10, 20);
        System.out.println("最大值是"+print(10,20,30.8));
    }

    public static int print(int a, int b) {
        int max = a > b ? a : b;
        System.out.println(max);
        return max;
    }
    public static double print(int a,int b,double c){
        double max =a>b?a:b;
        max=max>c?max:c;
        //max=a>b?a>c?a:c:b>c?b:c;
        System.out.println(max);
        return max;
    }
    public static String print(int a){
        String result=a>60?"及格":"不及格";
        return result;
    }
}
