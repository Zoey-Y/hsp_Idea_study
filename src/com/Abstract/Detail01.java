package com.Abstract;

public class Detail01 {
    public static void main(String[] args) {
        //抽象类不可以被实例化(也就是说不能被new了)
        /*A a = new A();*/
    }
}

abstract class A{
    
}
//比如这个抽象类B，里头可以没有抽象方法
abstract class B{

}
//抽象类只能修饰类和方法，不能修饰其他的
abstract class C{
    /*private abstract int c;这样会报错*/
}
//若一个类继承了抽象类
abstract class E{
    public abstract void hi();
}
/*
    1.则子类必须实现抽象类的(所有)抽象方法
    2.除非这个子类自己也声明为抽象类
*/
//方法1：将F这个子类声明为抽象类
abstract class F extends E{

}
//方法2：实现抽象类的方法
class G extends E{
    @Override//重写父类的方法
    public void hi() {//实例化就是方法体内写功能写东西
        System.out.println("通过实例化父类的抽象方法");
    }
}
//解释：抽象方法不能使用private、final、static来修饰
abstract class H{
   public abstract void hi();
   /*
   * 1，若这里用了private
   * private abstract void hi();
   * 就会造成子类没有机会重写方法因为私有只能在本类中使用
   * 2.final(最终)
   * public final abstract void hi();
   * 也会造成子类没办法得到父类的抽象方法，
   * 因为执行final之后这个方法就截止了
   * 3.static
   * public static abstract void hi();
   * abstract 与 static 是不允许组合在一起的，没有这样的写法*/
}
