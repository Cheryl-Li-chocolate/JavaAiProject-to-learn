package com.itheima.constructor;

public class Test {
    public static void main(String[] args) {
        //实体类的基本作用：创建它的对象，存取数据（封装数据）
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println("===============");

        s1.name = "1";
        s1.age = 18;
        s1.sex = "男";
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.sex);

        Student s3 =new Student("2",23, "女");
        //实体类在开发中的应用场景
        //创建一个学生操作对象专门负责对学生对象的数据进行业务处理

    }
}
