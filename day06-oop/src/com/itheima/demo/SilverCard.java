package com.itheima.demo;

public class SilverCard extends Card {
    public SilverCard(String cardID, String name, String phone, double money){
        super(cardID, name, phone, money);
        if (money<2000){
            throw new IllegalArgumentException("银卡办理时金额必须>=2000元");

        }
    }
    public void pay(double money){
        System.out.println( "您的银卡金额是"+getMoney()+"元");
        System.out.println("您使用银卡消费的原金额是"+money+"元");
        System.out.println("您使用银卡消费的优惠金额是"+money*0.1+"元");
        if (money*0.9>getMoney()){
            System.out.println("您的银卡余额不足");
            return;
        }
        setMoney(getMoney()-money*0.9);
        System.out.println("您使用银卡消费后的金额是"+getMoney()+"元");


    }
}