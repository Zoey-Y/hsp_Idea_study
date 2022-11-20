package com.codeBlock;



public class Block02 {
    public static void main(String[] args) {
        /*类被加载的情况：*/
        //1.创建对象实例时会加载类
        //new AA();
        //2.创建子类对象实例时，父类也会被加载
        //new BB();//两个静态代码块都执行,并且先执行父类的,因为先加载父类再加载子类
        //使用类的静态成员时,类也会被加载，静态代码块也会被执行
        //System.out.println(Cat.n1);//由于Cat类被加载了,所以静态代码块会被执行且只执行一次

        //调用对象的静态属性
        /*会调用h属性,静态代码块会被调用一次并且是先调用静态代码块,与普通代码块无关*/
        System.out.println(DD.h);
    }
}

class DD {
    public static  int h = 10;
    //静态代码块：类被加载时会被调用,而且只会被调用一次
    static {
        System.out.println("DD的静态代码块1.。");
    }
    //普通代码块：只有在new一个对象时会被调用,而且是每创建一个对象就会被调用一次
    {
        System.out.println("DD的普通代码块");
    }
}


class Cat{
    public static int n1 = 9;
    static {
        System.out.println("Cat 的静态代码1被执行..");
    }
}
class AA{
    //静态代码块
    static {
        System.out.println("AA 的静态代码块1被执行");
    }
}
class BB extends  AA{
    static {
        System.out.println("BB的静态代码块2被执行...");
    }
}

