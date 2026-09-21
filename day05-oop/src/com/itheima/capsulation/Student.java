package com.itheima.capsulation;

public class Student {
    //javaBean规范
    //1.私有成员变量
    private String name;
    private int age;
    private int chinese;
    private int math;
    //2.必须提供无参数构造器

    public Student() {
    }

    public Student(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    //3.提供公开的setter和getter方法
    public void setAge(int age) {
        if (age > 0 && age < 200) {
            this.age = age;
        } else {
            System.out.println("年龄设置错误");
        }

    }

    public int getAge() {
        return this.age;

    }
}
