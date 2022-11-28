package com.InnerClass;
/*
* 演示局部内部类的使用*/
public class LocalInnerClass {
    public static void main(String[] args) {
        //演示一遍
        Outer02 outer02 = new Outer02();
        outer02.m1();
    }
}
class Outer02{
    private int n1 = 100;
    private void m2(){System.out.println("Outer02 m2()");}
    public void m1(){//方法
        //1.局部内部类是定义在外部类的局部位置，通常在方法中
        //3.内部类 (不能)添加 访问修饰符,但是可以用final修饰
        //4.作用域:仅在定义它的 (方法) 或 (代码块) 中
        class Inner02{//局部内部类，若加了final则局部内部类是不能被继承的
            private int n1 = 800;//7.例子：与外部类的属性重名
            //2.可以直接访问外部类的所有成员,包括私有的
            public void f1(){
                //5.局部内部类可以直接访问外部类的所有成员，如下面的n1 和 m2()
                /*7.若 外部类 和 局部内部类 的成员重名时，
                * 默认遵循就近原则，若想访问外部类的成员
                * 则使用 (外部类名.this.成员) 去访问*/
                /*分析Outer02.this.n1 的写法原因:
                * 1.Outer02.this本质就是外部类的对象，
                * 即 在主方法中哪个对象调用了m1(),
                * Outer02.this就指向哪个对象。
                * 在这里Outer02在主方法中调用了m1()，所以Outer02.this就是Outer02对象*/
                System.out.println("n1= " + n1 + "外部类的n1：" + Outer02.this.n1);//7.此时n1遵循就近原则n1==800，要想访问外部类的n1成员,就写成Outer02.this.n1
                m2();//可以访问外部类的所有成员嘛~
            }
        }
        //4.1:局部内部类可以相互继承,除非父类有final
        class Inner03 extends Inner02{}

        //6.外部类想用内部类，只能在方法中创建这个Inner02对象,然后调用方法即可
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }
}
