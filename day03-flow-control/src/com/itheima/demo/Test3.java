package com.itheima.demo;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(getCode(4));
        System.out.println(getCode(6));
    }

    public static String getCode(int len) {
        String code = "";
        for (int i = 0; i < len; i++) {

            int type = (int) (Math.random() * 3);
            switch (type) {
                case 0:
                    //生成一个数字
                    int num = (int) (Math.random() * 10);
                    code += num;
                    break;
                case 1:
                    //生成一个大写字母
                    char c = (char) (Math.random() * 26 + 'A');
                    code += c;
                    break;
                case 2:
                    char c2 = (char) (Math.random() * 26 + 'a');
                    code += c2;
                    break;


            }

        }
        return code;

    }

}

