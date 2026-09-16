package com.itheima.demo;

public class Test4 {
    public static void main(String[] args) {
        //目标：找出101-200之间的全部素数
        System.out.println("101-200之间的素数有：");
        int count = 0;
        for (int i = 101; i < 200; i += 1) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count ++;
            }
        }
        System.out.println();
        System.out.println("一共有"+count+"个");
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
