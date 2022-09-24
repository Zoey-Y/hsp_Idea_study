package com.Object;
/*
* 1.演示：当对象被回收时,系统自动调用该对象的finalize方法,
* 子类可以重写该方法,做一些释放资源的操作
* 2.什么时候被回收：当某个对象没有任何引用时，则jvm就认为这个对象是垃圾对象，
* 就会用垃圾回收机制销毁该对象,在销毁前会先调用finalize方法
* 3.垃圾回收机制的调用,是由系统来决定(即有自己的GC[是一个算法]),也可以通过System.gc()
* 主动触发垃圾回收机制
* (老韩说：”无聊的面试官会问，实际开发时几乎不用”)哈哈哈哈哈哈哈哈哈！
*
* 总结:finalize方法是用于 让垃圾回收器调用，来回收(销毁)没有用的对象的*/
public class Finalize_ {
    public static void main(String[] args){
           Car GGBox = new Car("楼徐楼徐");
           GGBox = null;//此时GGBox啥也没了，没啥用
        /*1.GGBox对象就是一垃圾，垃圾回收器就会销毁对象,
        * 销毁前就会调用对象的finalize方法.(如果重写了就用重写的finalize方法,若非重写就用Object默认的finalize方法)
        * 2.程序员可以在finalize方法中写自己的业务逻辑(比如:
        * 释放资源; 数据库连接;或者打开文件..)
        * 3.如果程序员不重写finalize方法,那么就会调用Object类的finalize,
        * 即就是默认处理*/
        System.gc();//主动调用垃圾回收器
        System.out.println("运行结束..");
    }
}
class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }
    //重写finalize方法

    @Override
    protected void finalize() throws Throwable {
        /*super.finalize();*///默认情况下调的是父类的finalize方法
        System.out.println("释放了某些资源...");
    }
}