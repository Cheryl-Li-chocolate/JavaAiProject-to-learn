package com.itheima.branch;

public class IfDemo1 {
    public static void main(String[] args) {
        printPerformance(95);
    }

    //需求：有个绩效系统，每个月由主管给员工打分
    //会输出绩效级别：A+，A，B，C，D
    public static void printPerformance(int score) {
        if (score >= 95) {
            System.out.println("A+");
        } else if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 0 && score <= 60) {
            System.out.println("D");
        } else
            System.out.println("Invalid score");
    }
}
