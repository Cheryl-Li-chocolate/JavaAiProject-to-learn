package com.itheima.interfacedemo2;

public class ClassDataInterImpl2 implements ClassDataInter{

    private Student[] students;

    public ClassDataInterImpl2(Student[] students) {
        this.students = students;
    }
    @Override
    public void printAllStudentInfo() {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName()+"\t"+students[i].getSex()+"\t"+students[i].getScore());
            if (students[i].getSex().equals("男"))
                count++;


        }
        System.out.println("男生人数是:"+count);
        System.out.println("女生人数是:"+(students.length-count));


    }

    @Override
    public void AverageScore() {
        double sum=0;
        double max=students[0].getScore();
        double min=students[0].getScore();
        for (int i = 0; i < students.length; i++) {
            sum+=students[i].getScore();
            if (students[i].getScore()>max)
                max=students[i].getScore();
            if (students[i].getScore()<min)
                min=students[i].getScore();
        }
        System.out.println("平均分是:"+sum/students.length);
        System.out.println("最高分是:"+max);
        System.out.println("最低分是:"+min);

    }
}
