package com.Static;

public class StaticMethod {
    public static void main(String[] args) {
        Stu.payFee(100);
        Stu.showFee();//100
        Stu.payFee(200);
        Stu.showFee();//300因为在payFee()已经累计了
        //对象调用静态方法
        Stu s1 = new Stu("兔八哥");
        Stu s2 = new Stu("三娃");
        s1.payFee(100);
        s1.showFee();
        s2.payFee(100);
        s2.showFee();
    }
}
class Stu{
    //普通成员
    private String name;
    //定义静态变量 来累计学费
    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }
    public static void payFee(double fee){
        Stu.fee += fee;//fee为静态变量，可以直接 类变量.静态变量名
        //不能用this.fee因为fee现在已经是该类对象共有，而非某个该类的对象了
    }

    public static void showFee(){
        System.out.println("收到的学费累计："+Stu.fee);
    }
}