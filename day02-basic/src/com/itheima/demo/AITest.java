package com.itheima.demo;

import java.util.Scanner;

public class AITest {
    public static void main(String[] args) {
        //目标：完成健康计算器
        //1.先让用户输入自己的个人信息、身高、体重、年龄、性别
        //2. 计算BMI指数
        //3.计算BMR指数
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入您的身高（单位：米）：");
        double height=sc.nextDouble();

        System.out.println("请输入您的体重（单位：千克）：");
        double weight=sc.nextDouble();

        System.out.println("请输入您的年龄（单位：岁）：");
        int age=sc.nextInt();

        System.out.println("请输入您的性别（男/女）：");
        String sex=sc.next();

        double bmi=calcBMI(height,weight);
        System.out.println("您的BMI指数是："+bmi);

        double bmr=calcBMR(sex,age,weight,height);
        System.out.println("您的BMR指数是："+bmr);

        isBMI(bmi);


    }
    public static  double calcBMI(double height, double weight) {
        return weight/(height*height);
    }
    public static double calcBMR(String sex,int age,double weight,double height) {
        if (sex.equals("男")) {
            return 13.7 * weight + 5.0 * height - 6.8 * age + 66;
        } else {
            return 9.6 * weight + 1.8 * height - 4.7 * age + 655;
        }
    }
        //判断BMI是否正常方法
        public static void isBMI(double bmi) {
            if (bmi<18.5) {
                System.out.println("BMI过轻");
            }else if (bmi>24) {
                System.out.println("BMI过重");
            }else {
                System.out.println("BMI正常");
            }
        }

}
