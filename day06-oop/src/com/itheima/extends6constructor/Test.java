package com.itheima.extends6constructor;
public class Test {
    public static void main(String[] args) {
    Zi z=new Zi();
    }
}
class Zi extends Fu {
    public Zi(){
        System.out.println("子类构造器执行");
    }
}
class Fu{
    public Fu(){
        System.out.println("父类构造器执行");
    }
}
