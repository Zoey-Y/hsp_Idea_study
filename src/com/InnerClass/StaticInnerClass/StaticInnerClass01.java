package com.InnerClass.StaticInnerClass;
/*静态内部类:
* 1.依然是定义在外部类的成员位置上,只是多了static修饰
* 2.可以访问外部类的所以静态成员,不能直接访问非静态成员
* 3.可以任意添加访问修饰符
* 4.作用域:整个外部类
* 5.外部类访问静态内部类的方式就是创建一个方法new一个对象
* 6.重名问题也是一样处理(只不过内部类调用外部类重名的成员语法:外部类名.外部类重名成员的名字)*/


public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m1();
        /*外部其他类,使用静态内部类*/
        //1.
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();
        //2.编写一个方法可以返回静态内部类的实例
        Outer10.Inner10 inner101 = outer10.getInner10();
        inner101.say();
        //3.编写一个静态方法返回静态内部类的实例
        //不用new Outer10
        Outer10.Inner10 inner10_ = Outer10.getInner10_();

    }
}
class Outer10{
    private int n1 = 10;
    private static String name = "张三";

    //加了个访问修饰符public
    public static class Inner10{
        //可以直接访问外部类所有静态成员
        public void say(){
            System.out.println("name: "+ name);
        }
    }
    //第五点例子
    public void m1(){
        Inner10 inner10 = new Inner10();
        inner10.say();
    }

    public Inner10 getInner10(){
        return new Inner10();
    }

    public static Inner10 getInner10_(){
        return new Inner10();
    }
}
