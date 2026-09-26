package com.itheima.extends6constructor;

public class Student {
    String name;
    int age;
    String major;
    char sex;
    public Student(int age, String name, char sex) {
        this(age,name,"计算机",sex);
        //this()在构造器中调用本类的其他构造器
    }

    public Student(){}
    public Student(int age, String name, String major, char sex) {
        this.age = age;
        this.name = name;
        this.major = major;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                ", sex=" + sex +
                '}';
    }
}
