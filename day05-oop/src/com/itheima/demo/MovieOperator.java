package com.itheima.demo;

public class MovieOperator {
    private Movie[] movies;
    public MovieOperator(){}
    public MovieOperator(Movie[] movies){
        this.movies=movies;
    }
    public void printAllMovies(){
        for(int i=0;i<movies.length;i++){
            System.out.println(movies[i].getId()+"\t"+movies[i].getName()+"\t"+movies[i].getPrice());

        }
    }
    public void searchMovie(int i){
        for(int j=0;j<movies.length;i++)
        {
            if(movies[j].getId()==i){
                System.out.println(movies[j].getId()+"\t"+movies[j].getName()+"\t"+movies[j].getPrice());
                return;
            }
        }
        System.out.println("没有找到该电影");
    }

}
