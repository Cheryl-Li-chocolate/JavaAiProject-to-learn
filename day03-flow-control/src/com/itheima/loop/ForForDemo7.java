package com.itheima.loop;


public class ForForDemo7 {
    public static void main(String[] args) {
        test();
        test2();
    }
    public static void test() {
        for(int i=1;i<5;i++){
            for(int j=1;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void test2(){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++) {
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
            }
        }
    }

