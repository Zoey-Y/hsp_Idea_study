package com.Wrapper;

public class Integer01 {
    public static void main(String[] args) {
        /*演示int <--> Integer 的装箱 和 拆箱
        * 1.jdk5前是手动装箱和拆箱
        * 2.*/
        //手动装箱
        int n1 = 100;
        Integer integer = new Integer(n1);//装箱方法1
        Integer integer1 = Integer.valueOf(n1);//装箱方法2
        //手动拆箱 Integer --> int
        int i = integer.intValue();

        //jdk5之后,就可以自动装箱和拆箱了
        /*int n2 = 200;
        Integer integer2 = n2;*///底层使用的方法就是Integer.valueOf(n2)
        //简写:
        Integer n2 = 200;
    }
}
