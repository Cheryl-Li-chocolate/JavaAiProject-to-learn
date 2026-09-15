package com.itheima.operator;

public class OperatorDemo6 {
    public static void main(String[] args) {
        System.out.println(ismatch(25, 170, "本科", true, 600));
        System.out.println(ismatch(25, 158, "本科", true, 5000000));
        ismatch2();
        ismatch3();
    }

    //需求：判断某个人的条件是否满足择偶要求，满足返回true，不满足返回false
    public static boolean ismatch(int age, double height, String education, boolean isHealthy, int income) {
        boolean result = (age > 22 & age < 30 & height > 160 & education.equals("本科") & isHealthy) | income >= 5000000;
        return result;
    }

    //！
    public static void ismatch2() {
        System.out.println(false ^ false);
        System.out.println(true ^ false);
        System.out.println(true ^ true);
        System.out.println(false ^ true);

    }
    //判断&&、||和&和｜的区别
    public static void ismatch3() {
     int a=111;
     int b=2;
        System.out.println(a>1000 && ++b>1);
        System.out.println(b);
        System.out.println(a>1000 & ++b>1);
        System.out.println(b);
        int i=10;
        int j=20;
        System.out.println(i>5 || ++j>1);
        System.out.println(j);
        System.out.println(i>5 | ++j>1);
        System.out.println(j);
        System.out.println(i>100 | ++j>1);
        System.out.println(j);


    }
}
