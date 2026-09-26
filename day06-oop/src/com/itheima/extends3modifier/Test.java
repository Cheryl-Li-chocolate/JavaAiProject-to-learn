package com.itheima.extends3modifier;

import com.itheima.extends2modifier.Fu;

public class Test {
    public static void main(String[] args) {
        Fu f=new Fu();
        f.publicMethod();//public方法，可以在任何地方访问
        //f.defaultMethod();//默认方法，可以在包内访问
        //f.protectedMethod();//protected方法，可以在子孙类中访问
    }
}
