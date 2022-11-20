package com.codeBlock;
/*1.三个构造器构成了重载
 * 2.三个构造器都有相同的语句,代码复用性低
 * 3.我们可以把相同的语句放入到一个代码块中
 * 4.这样无论调用哪个构造器,在创建对象之后,都会先调用代码块的内容*/
public class Block01 {
    public static void main(String[] args) {
        //创建完这个对象后就已经先调用了代码块了
        Movie the_liangzai_lin = new Movie("The liangzai Lin");
        Movie north = new Movie(22.2, "North");

    }
}
class Movie{
    private String name;
    private double price;
    private  String director;
    //普通代码块
    {
        System.out.println("语句1：");
        System.out.println("语句2：");
        System.out.println("语句3：");
    }
    //构造器
    public Movie(String name) {
        this.name = name;
    }
    //构造器
    public Movie(double price, String director) {
        this.price = price;
        this.director = director;
    }
    //构造器
    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }

}
