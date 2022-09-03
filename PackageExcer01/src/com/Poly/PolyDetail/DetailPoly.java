package com.Poly.PolyDetail;

import com.stuHsp.modifier.A;

public class DetailPoly {
    public static void main(String[] args){
        //向上转型：父类的引用指向了子类的对象
        //语法：父类类型  引用名 = new 子类类型();
        Animal animal = new Cat();
        //也可以不影响,因为遵守父类指向子类的对象，子类的对象引进了父类
        Object object = new Cat();
        //调用不到子类特有的成员
        //因为在编译阶段，能调用哪些成员是由编译类型决定的
        //animal.catchMouse();//错误
        //最终运行结果是看子类(运行类型)的具体实现
        //即调用方法时，按照从子类的(运行类型)开始查找
        animal.eat();//先看子类的运行类型、因为先javac编译 -进入虚拟机-> java 从子类开始查找
        animal.run();
        animal.show();
        animal.sleep();

        //希望调用Cat的 catchMouse方法
        //多态的向下转型
        //一、语法:子类类型   引用名 = (子类类型)    父类引用
        Cat cat = (Cat) animal;
        /*解释:
        *   1.左边看: cat编译类型是Cat
        *   2.运行类型是Cat，因为animal被强转了*/
        cat.catchMouse();
        //二、要求父类的引用必须指向当前目标类的对象
        //1.所以没有没有继承关系的不能强转
        /*2.若父类被强转成子类了，
         那么该父类不能再被其它子类强转，
         因为此时这个父类披上了上一次穿上的羊皮伪装过了*/
        //Dog dog = (Dog) animal;所以再样子写就错
    }
}
