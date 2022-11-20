package com.Abstract;

public class Abstract01 {
    public static void main(String[] args) {

    }
}
abstract class Animal {//这是整个类也要设置为抽象类 abstract + class + 某类名
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    /*  场景：
        Animal范围太广了eat不能具体表明什么动物吃什么的问题
        1.这里的eat方法其实没什么意义
        2.即父类方法不确定性的问题
        3.引出将该方法设计为抽象方法abstract()
        4.所谓抽象方法就是没有实现的方法,(没有实现就是没有方法体)
        5.一般来说,抽象类会被继承, 这些抽象方法就有子类实现*/
    /*public void eat(){
        System.out.println("这是一个动物,但是不知道吃什么。。");
    }*/
    public abstract void eat();//因此直接将这个方法设置为abstract方法，整个类就要设置为抽象类

}