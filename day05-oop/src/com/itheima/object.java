package com.itheima;

public class object {
    //简单构造一个学生对象有对应的成绩和成绩计算方法
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张三");
        student.setAge(18);
        student.setScore(90);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getScore());
        System.out.println(student.getSum());
    }
}
class Student {
    private String name;
    private int age;
    private int score;

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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getSum() {
        return score + age;
    }
}

