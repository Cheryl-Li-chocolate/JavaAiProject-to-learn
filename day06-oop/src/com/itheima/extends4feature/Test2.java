package com.itheima.extends4feature;

public class Test2 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();

    }

}

//1.java的类只能是单继承，不支持多继承，支持多层继承
//2.一个类要么默认继承Object类，要么直接继承object类，要么间接继承object类
class Fu {
    String name = "Fu的name";

    public void run() {
        System.out.println("Fu的run方法");
    }

}

class Zi extends Fu {
    String name = "Zi的name";

    public void show() {
        String name = "show的name";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
        run();
        super.run();
    }
    //方法重写：方法名称，形参列表必须一样，这个方法就是方法重写
    @Override //方法重写的校验注解（标志）：要求方法名称和形参列表必须与被重写方法一致，否则报错！
    //更安全，可读性好，更优雅
    //子类重写父类方法时，访问权限必须大于或者等于父类该方法的权限
    //子类重写父类方法时，返回类型必须与父类方法的返回类型一致或者范围更小
    //私有方法、静态方法不能被重写
    public void run() {
        System.out.println("Zi的run方法");
    }
}