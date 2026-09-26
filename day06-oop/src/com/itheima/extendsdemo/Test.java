package com.itheima.extendsdemo;

public class Test {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.setName("张三");
        t.setAge(30);
        t.setSkill("Java");
        System.out.println(t.getName()+" "+t.getAge()+" "+t.getSkill());
    }
}
