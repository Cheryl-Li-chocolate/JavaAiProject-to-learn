package com.itheima.capsulation;

public class Test {
    public static void main(String[] args) {
        Student s1=new Student();
        //不可以直接
        StudentOperator operator = new StudentOperator(s1);
        operator.SetInfo("1",18,100,100);
        operator.printTotalScore();

    }
}
