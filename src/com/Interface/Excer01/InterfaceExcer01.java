package com.Interface.Excer01;

public class InterfaceExcer01 {
    public static void main(String[] args) {
        B b = new B();
        //B对象实现了A自然可以直接调用其属性
        System.out.println(b.a);//23
        //由于static所以A可以直接调用
        System.out.println(A.a);//23
        //同理因为B实现了A,有因为A的属性有static功能，B调用A的属性自然也有static功能
        System.out.println(B.a);//23
    }
}
interface A{
    int a = 23;//等价于 public static final  int a =23;
}
class B implements A{

}