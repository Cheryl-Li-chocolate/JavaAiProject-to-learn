package com.itheima.demo;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        guess();
    }
    public static void guess() {
        //1.生成随机数：1-100之间
        //方式一：
        //Math.random()生成0-1之间的随机数
        int num = (int)Math.random()*100+1;
        //[0,100)=>[0,99]+1=>[1,100]
        //方式二：
        Random r =new Random();
        int luckNumber=r.


    }
}
