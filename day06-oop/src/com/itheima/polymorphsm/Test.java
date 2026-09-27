package com.itheima.polymorphsm;

public class Test {
    public static void main(String[] args) {
        //1.多态的好处1：右边对象是解耦合的
        //对象多态：小范围可以给到大范围
        //方法多态：编译看左边，运行看右边
        //成员变量：编译看左边，运行也看左边

        Animal w = new Wolf();
        System.out.println(w.name);
        w.run();
        Animal t = new Turtle();
        System.out.println(t.name);
        t.run();

        go(w);
        go(t);


    }

    //2.多态的好处2：父类类型的变量作为参数可以接收一个子类对象
    public static void go(Animal a) {
        a.run();
        System.out.println(a.name);
        //a.eat();多态下不能使用子类独有功能，因为编译看左边在父类找不到这个方法无法编译
        if (a instanceof Wolf)
        {
            Wolf w1=(Wolf)a;
            w1.eat();
        }else if(a instanceof Turtle)
        {
            Turtle t1=(Turtle)a;
            t1.eat();
        }
    }
}
