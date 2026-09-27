package com.itheima.demo;



import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        GoldCard g=new GoldCard("粤A12345","张三","12345678901",10000);
        g.deposit(1000);
        pay(g);
        SilverCard s=new SilverCard("粤A12345","张三","12345678901",2000);
        s.deposit(1000);
        pay(s);
    }
    public static void pay(Card card){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入消费金额:");
        double money=sc.nextDouble();
        card.pay(money);
    }
}
