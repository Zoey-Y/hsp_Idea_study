package com.Super_;

//super代表的父类的引用，用于访问父类的属性、方法、构造器
public class B extends A {
    public void hi() {
        //访问父类属性，但不能访问父类的private属性 ——>super.属性名
        System.out.println(super.n1 + super.n2 + super.n3); //n4为private
    }

    public void method() {
        //访问父类的方法，不能访问父类的private方法 ——>super.方法名(参数列表)
        super.test100();
        super.test200();
        super.test300();
        //test400为private
    }
    //访问父类的构造器：super(参数列表);只能放在构造器的第一句，只能出现一句
    public B() {
        //调用父类的构造器只能在子类的构造器里调用
        super();
    }
}
