package com.itheima.branch;

public class SwitchDemo2 {
    public static void main(String[] args) {

        print();
    }
    //目标：掌握switch的注意事项，穿透性作用
    public static void print() {
        int number = 1;
        switch (number) {
            case 1:
                System.out.println("星期一");
            case 2:
                System.out.println("星期二");
            case 3:
                System.out.println("星期三");
            default:
                System.out.println("其他");
        }
    }

}
