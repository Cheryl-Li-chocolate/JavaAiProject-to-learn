package com.itheima.loop;

public class WhileDemo3 {
    public static void main(String[] args) {
        System.out.println("需要多少年"+test1());
    }
    public static int test1(){
        double money = 100000;
        double rate=0.017;
        int year=0;
        while(money<200000){
            year++;
            money=money*(1+rate);


        }
        return year;


    }
}
