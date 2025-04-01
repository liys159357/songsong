package com.itheima.Demo;

public class Test {
    public static void main(String[] args) {
        //目标：完成面向对象综合小案例
        //1.设计电影类Movie，以便创建电影对象,封装电影数据。
        //2.封装系统中的全部电影数据（自己造一些数据）
        Movie[] movies = new Movie[6];
        movies[0] = new Movie("战狼", 9.8, 1, "吴京");
        movies[1] = new Movie("战狼2", 9.5, 2, "5");
        movies[2] = new Movie("战狼3", 9.9, 3, "张小泉");
        movies[3] = new Movie("战狼4", 9.8, 4, "张小泉");
        movies[4] = new Movie("战狼5", 9.8, 5, "张小泉");
        movies[5] = new Movie("战狼6", 10, 6, "张小泉");
        //3.创建电影操作对象出来，专门负责带你赢数据的业务操作
        MovieOperator mo = new MovieOperator(movies);
        mo.printAllMovies();
        mo.searchMovieById();


    }
}
