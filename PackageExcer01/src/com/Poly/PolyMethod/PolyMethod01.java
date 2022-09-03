package com.Poly.PolyMethod;

public class PolyMethod01 {
    public static void main(String[] args){
        //方法重载的多态(方法的多种状态)
        //用不同的参数调用相同的重载的方法就是方法多种状态的体现
        A a = new A();
        System.out.println(a.sum(1,2));
        System.out.println(a.sum(1,2,3));

        //方法重写的多态(重写的多种状态)
        B b = new B();
        //调用对象不一样所有say()有所不同
        a.say();
        b.say();
    }
}
class B {
    public void say(){
        System.out.println("B say() 方法被调用...");
    }
}
class A extends B{
    public int sum(int n1,int n2){//sum重载1
        return n1 + n2;
    }
    public int sum(int n1,int n2,int n3){//sum重载2
        return n1 + n2 + n3;
    }

    //此处在写一个say()与父类构成重写
    public void say(){
        System.out.println("A say() 方法被调用...");
    }
}
