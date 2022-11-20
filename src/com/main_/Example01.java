package com.main_;

public class Example01 {
    private static String name = "jojo";
    private int n = 1000;
    public static void main(String[] args) {
        //静态方法内可以调用静态属性
        System.out.println(name);
        //非静态方法需要new一个对象
        Example01 example01 = new Example01();
        System.out.println(example01.n);
    }
}
