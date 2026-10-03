package com.itheima.demo;

public class SmartControlSystem {
    private static final SmartControlSystem scs=new SmartControlSystem();
    private SmartControlSystem(){}
    public static SmartControlSystem getInstance(){
        return scs;
    }
    public void control(JD device){
        System.out.println(device.getName()+"当前的状态是"+(device.isStatus()?"开":"关"));
        device.press();
        System.out.println("操作成功，当前状态是"+(device.isStatus()?"开":"关"));
    }
    public void printDeviceStatus(JD[] devices){
        for (int i = 0; i < devices.length; i++) {
            System.out.println((i+1)+". "+devices[i].getName()+"当前的状态是"+(devices[i].isStatus()?"开":"关"));
        }
    }
}
