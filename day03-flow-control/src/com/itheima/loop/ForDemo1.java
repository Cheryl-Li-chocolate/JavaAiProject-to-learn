package com.itheima.loop;

public class ForDemo1 {
    public static void main(String[] args) {
        int n = 100;
        int sum = test1(n);
        System.out.println("1-"+n+"之间的整数和是" + sum);

    }

    public static int test1(int n) {
        //需求：打印1-10之间的整数
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }
}
