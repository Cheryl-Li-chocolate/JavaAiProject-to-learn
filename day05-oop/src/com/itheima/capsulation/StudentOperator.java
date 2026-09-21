package com.itheima.capsulation;

public class StudentOperator {
    private Student s;

    public StudentOperator(){

    }
    public StudentOperator(Student s){
        this.s=s;

    }
    public void SetInfo(String name,int age,int chinese,int math){
        this.s.setName(name);
        this.s.setAge(age);
        this.s.setChinese(chinese);
        this.s.setMath(math);
    }
    public void printTotalScore(){

        System.out.println(s.getName()+"的总成绩是"+(s.getChinese()+s.getMath()));
    }
}
