package com.itheima.extends5override;

public class Test {
    public static void main(String[] args) {
        Student s=new Student("张三",18,'男');
        System.out.println(s.toString());//直接输出对象，默认会调用Object的toString方法，返回对象的地址信息
        //输出对象的地址实际上时没有什么意义的，开发中更希望输出对象时看对象的内容信息，所以子类需要重写Object的toString方法
        //以便以后输出对象时默认就近调用子类重写的toString方法返回对象的内容

    }
}
class Student extends Object{
    private String name;
    private int age;
    private char sex;

    public Student(){}
    public Student(String name,int age,char sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return "Student:"+name+" Age:"+age+" Sex:"+sex;
    }

}