package com.itheima.demo;

public class Test {
    public static void main(String[] args) {
        //1.设计电影类，以便创建电影对象，封装电影数据
        Movie movies[]=new Movie[3];
        //2.创建电影对象，并为对象的属性赋值,封装系统中的全部电影数据
        movies[0]=new Movie(1,"《教父》",9.9);
        movies[1]=new Movie(2,"《教父2》",9.9);
        movies[2]=new Movie(3,"《教父3》",9.9);
        //3.遍历电影数组，输出电影信息
        MovieOperator m=new MovieOperator(movies);
        m.printAllMovies();
        m.searchMovie(2);
    }
}
