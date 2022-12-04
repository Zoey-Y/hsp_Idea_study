package com.HomeWork;

public class Home02 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.shout();
        Dog dog = new Dog();
        dog.shout();
    }
}
//抽象类
abstract class  Animal{
    abstract public void shout();//抽象类必须公共,且没有static
}
//继承抽象类的类必须重写抽象类的方法 或者 自己本身也是抽象类,否则报错
class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("猫猫叫唤...");
    }
}
class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("狗会叫...");
    }
}