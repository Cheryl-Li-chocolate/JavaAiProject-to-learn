package com.itheima.abstractdemo;

import com.sun.tools.javac.Main;

public abstract class People {
    public void write(){
        System.out.println("\t\t\t《我的爸爸》");
        writeMain();
        System.out.println("\t\t我爸爸真好！");
    }
    public abstract void writeMain();
}
