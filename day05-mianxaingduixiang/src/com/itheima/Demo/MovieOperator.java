package com.itheima.Demo;

import java.util.Scanner;

//电影操作类
public class MovieOperator {
    private Movie[] movies; //用来记录一个电影对象的数组

    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    public  void printAllMovies(){
        for (int i = 0; i <movies.length; i++) {
            Movie m=movies[i];
            System.out.println(m.getId()+"\t"+m.getName()+"\t"+m.getPrice()+"\t"+m.getActor()+"\t");
        }
    }
    Scanner sc = new Scanner(System.in);
    public void searchMovieById() {
        System.out.println("请输入要查询的id：");
        int id = sc.nextInt();
        switch (id) {
            case 1:
                System.out.println(movies[0].getId()+"\t"+movies[0].getName()+"\t"+movies[0].getPrice()+"\t"+movies[0].getActor());
                break;
            case 2:
                System.out.println(movies[1].getId()+"\t"+movies[1].getName()+"\t"+movies[1].getPrice()+"\t"+movies[1].getActor());
                break;
            case 3:
                System.out.println(movies[2].getId()+"\t"+movies[2].getName()+"\t"+movies[2].getPrice()+"\t"+movies[2].getActor());
                break;
            case 4:
                System.out.println(movies[3].getId()+"\t"+movies[3].getName()+"\t"+movies[3].getPrice()+"\t"+movies[3].getActor());
                break;
            case 5:
                System.out.println(movies[4].getId()+"\t"+movies[4].getName()+"\t"+movies[4].getPrice()+"\t"+movies[4].getActor());
                break;
            case 6:
                System.out.println(movies[5].getId()+"\t"+movies[5].getName()+"\t"+movies[5].getPrice()+"\t"+movies[5].getActor());
                break;
            default:
                System.out.println("没有找到该电影");
        }

    }
}
