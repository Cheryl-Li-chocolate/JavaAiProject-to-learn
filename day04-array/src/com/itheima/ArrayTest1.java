package com.itheima;

public class ArrayTest1 {
    public static void main(String[] args) {
        start();
    }
    public static void start(){
        String poker[]=new String[54];
        String colors[]={"♠","♥","♣","♦"};
        String numbers[]={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int index=0;
        for (int i=0;i<numbers.length;i++){
            for(int j=0;j<colors.length;j++){
                poker[index++]=colors[j]+numbers[i];
            }
        }
        poker[index++]="🃏";
        poker[index]="👑";
        System.out.println("生成新牌：");
        for(int i=0;i<poker.length;i++){
            System.out.print(poker[i]+'\t');
        }
        System.out.println("\n洗牌后：");
        String tmp="";
        for(int i=0;i<100;i++){
            int index1=(int)(Math.random()*poker.length);
            int index2=(int)(Math.random()*poker.length);

            tmp=poker[index2];
            poker[index2]=poker[index1];
            poker[index1]=tmp;
        }
        for(int i=0;i<poker.length;i++){
            System.out.print(poker[i]+'\t');
        }


    }
}
