package com.itheima.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //目标：面向对象编程实现智能家居控制系统
        //角色：设备
        //具备功能：开和关
        //智能控制系统控制调用设备的开和关（单例对象）
        //1.定义设备类，创建设备对象
        //2.准备这些设备对象，放到设备组
        JD[] device=new JD[3];
        device[0]=new TV("电视",false);
        device[1]=new Lamp("台灯",false);
        device[2]=new WashingMachine("洗衣机",false);
        //3.为每个设备制定一个开和关的功能，定义一个接口，设备类实现接口
        //4.定义智能控制系统类，控制设备的开和关
        SmartControlSystem scs=SmartControlSystem.getInstance();
        while(true){
            System.out.println("请选择要操作的设备");
            System.out.println("当前设备列表为");
            scs.printDeviceStatus(device);
            System.out.print("请输入要操作的设备编号，输入exit退出系统：");
            Scanner sc=new Scanner(System.in);
            String control =sc.next();
            System.out.println("当前操作如下：");
            switch(control) {
                case "1":

                    scs.control(device[0]);
                    break;
                case "2":
                    scs.control(device[1]);
                    break;
                case "3":
                    scs.control(device[2]);
                    break;
                case "exit":
                    System.out.println("退出系统");
                    return;
                default:
                    System.out.println("输入错误，请重新输入");

            }
            System.out.println();

        }

    }
}
