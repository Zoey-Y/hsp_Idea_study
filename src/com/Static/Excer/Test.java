package com.Static.Excer;

public class Test {
    public static void main(String[] args) {
        new Test().count();//9
        new Test().count();//10
        System.out.println(Test.count);//有调用了一次11
    }
    static int count = 9;
    public void count(){//非静态变量可以访问所有成员
        System.out.println("count = " + (count++));
    }
}
