package com.HomeWork;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import javax.swing.*;

/*考察匿名内部类的使用:*/
public class Home03 {
    public static void main(String[] args) {

        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Calculate() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        },10,3);


    }
}

interface Calculate {
    //计算功能接口方法
    double work(double n1, double n2);//前缀默认是:public static final
}

class Cellphone {
    //测试类要调用接口方法要传入接口对象
    public static void testWork(Calculate calculate, double n1, double n2) {
        double result = calculate.work(n1, n2);
        System.out.println("计算结果:" + result);
    }
}