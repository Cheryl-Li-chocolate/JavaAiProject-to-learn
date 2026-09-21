package com.itheima.staticmethod;

public class Test4 {
    public static void main(String[] args) {
        print();
    }
    //1.静态方法中可以直接访问静态成员，不可以直接访问实例成员
    public static int count = 100;

    public static void run(){};
    private void debug(){};
    private String name;
    public static void print(){
        System.out.println(count);
        Test4 t=new Test4();
        System.out.println(t.name);
        run();
        t.debug();
        //System.out.println(this);//报错，this代表的只能是对象，静态方法没有对象

    }
    //2.实例方法中既可以直接访问静态成员，也可以直接访问实例成员。
    public void go(){
        //到时候会有对象调用go方法，就可以接着这个对象去访问这个对象的实例成员和方法，都属于对象，可以互相调用
        System.out.println(count);
        System.out.println(name);
        run();
        debug();

    }
    //3.实例方法中可以出现this关键字，静态方法中不可以出现this关键字
    public void show(){
        System.out.println(this);//实例方法只能拿对象调，可以把对象传过来，即使是别的方法调别的方法也是对象调会一直传过来
    }
}
