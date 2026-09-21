package com.itheima.staticmethod;

public class Test2 {
    public static void main(String[] args) {
        //静态方法，直接用类名调用即可，调用方便，也能节省内存
        String code=VerifyCodeUtil.getCode(6);
        System.out.println(code);
    }
}
