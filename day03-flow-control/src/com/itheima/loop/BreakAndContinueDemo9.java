package com.itheima.loop;

public class BreakAndContinueDemo9 {
    public static void main(String[] args) {
        test();
    }
    public static void test() {
        //学习break和continue的使用
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("i = " + i);
        }
        System.out.println("循环结束");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("i = " + i);
        }
        System.out.println("循环结束");
    }
}
