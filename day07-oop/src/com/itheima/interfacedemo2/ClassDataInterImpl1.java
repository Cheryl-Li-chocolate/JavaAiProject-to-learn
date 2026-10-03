package com.itheima.interfacedemo2;

public class ClassDataInterImpl1 implements ClassDataInter{

    private Student[] students;
    public ClassDataInterImpl1(Student[] students){
        this.students=students;
    }

    @Override
    public void printAllStudentInfo() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName()+"\t"+students[i].getSex()+"\t"+students[i].getScore());
        }

    }

    @Override
    public void AverageScore() {
        double sum=0;
        for (int i = 0; i < students.length; i++) {
            sum+=students[i].getScore();
        }
        System.out.println("平均分是:"+sum/students.length);

    }
}
