package com.stuHsp.pkg;

import com.stuHsp.modifier.A;

//C类是验证四种访问修饰符在(不同包中)是否能被使用(只有public类可以被使用)
public class C {
    public void printC(){
        A a = new A();
        System.out.println("n1= " + a.n1);
    }
}
