package com.itheima.demo;

public class GoldCard extends Card{
    public GoldCard(String cardID, String name, String phone, double money){
        super(cardID, name, phone, money);
        if (money<5000){
            throw new IllegalArgumentException("金卡办理时金额必须>=5000元");

        }
    }
    public void pay(double money){
        System.out.println( "您的金卡金额是"+getMoney()+"元");
        System.out.println("您使用金卡消费的原金额是"+money+"元");
        System.out.println("您使用金卡消费的优惠金额是"+money*0.2+"元");

        if (money*0.8>getMoney()){
            System.out.println("您的金卡余额不足");
            return;
        }
        setMoney(getMoney()-money*0.8);
        System.out.println("您使用金卡消费后的金额是"+getMoney()+"元");
        if(money*0.8>200){
            System.out.println("您使用金卡消费的优惠金额超过了200元,可以打印一张洗车票");
        }
    }
}
