package com.itheima.staticmethod;

public class VerifyCodeUtil {
    private VerifyCodeUtil() {}
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
