package com.Object;

public class Equals {
    public static void main(String[] args){
        A a = new A();
        A b = a;//将引用类型a赋给以A为类型的b
        A c = b;//将引用类型b赋给以A为类型的c
        System.out.println(a == c);//true
        /*B b1 = new B();
        b1 = a;*/
        //第二种写法：
        B b1 = a;
        System.out.println(b1 == a);//true

        //1. ctrl + 鼠标点击对应的Object方法类
        //2. ctrl + b也行
        "hello".equals("asd");
        //Object
       /* 看Object类的 equals
       * 即Object的equals方法默认就是比较对象的地址是否相同(判断两个对象是否是同一个对象)
       * public boolean equals(Object obj){
       *    return (this == obj);
       * }*/




    }
}
class B{}
class A extends B{}
