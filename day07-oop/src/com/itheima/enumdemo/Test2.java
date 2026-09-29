package com.itheima.enumdemo;

public class Test2 {
    public static void main(String[] args) {

        move(Direction.DOWN);
    }
    public static void move(Direction direction){
        switch(direction){
            case UP:
                System.out.println("向上移动");
                break;
            case DOWN:
                System.out.println("向下移动");
                break;
            case LEFT:
                System.out.println("向左移动");
                break;
            case RIGHT:
                System.out.println("向右移动");
                break;
        }

    }
}
