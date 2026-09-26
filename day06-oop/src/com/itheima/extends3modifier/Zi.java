package com.itheima.extends3modifier;

import com.itheima.extends2modifier.Fu;

public class Zi extends Fu {
    public void show(){
        //defaultMethod();//默认方法，不能在类外访问
        protectedMethod();//protected方法，可以在子孙类中访问
        publicMethod();
    }
}
