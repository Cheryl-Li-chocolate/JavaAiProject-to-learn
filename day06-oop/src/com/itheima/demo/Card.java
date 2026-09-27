package com.itheima.demo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok技术可以实现为类自动添加getter和setter方法，以及toString方法，无参构造器
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private String cardID;
    private String name;
    private String phone;
    private double money;

    public void deposit(double money){
        this.money+=money;
    }
    public void pay(double money){
        this.money-=money;
    }

}
