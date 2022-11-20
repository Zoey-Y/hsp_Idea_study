package com.Interface.Inter02;

import com.Interface.Inter02.AInterface;

public class Interface02 {
    public static void main(String[] args) {

    }
}
/*1.如果一个类 implement实现 接口,
    就需要将该接口所有抽象类都实现
  */
class A implements AInterface {
    @Override
    //这是AInterface的抽象方法
    public void hi() {
        System.out.println("hi..");
    }
}
