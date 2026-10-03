package com.itheima.interfacedemo;

public class Test {
    public static void main(String[] args) {
        Driver d1=new Student();
        Driver d2=new Teacher();

    }
}
interface Driver{}
interface Boyfriend{}
class People{}
class Student extends People implements Driver,Boyfriend{}
class Teacher extends People implements Driver,Boyfriend{}




