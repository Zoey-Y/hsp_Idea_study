package com.Poly;

import jdk.nashorn.internal.ir.CallNode;

//总结主任喂宠物的情况(调用有关元素和方法，然后结合在一起)
public class Master {
    private String name;

    public Master(String name) {
        setName(name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //该类的重点内容
   /* public void feed(Cat cat, Fish fish) {//此时这里传的形参是某两个对象
        System.out.println("主人： " + getName() + "给" +
                cat.getName() + "喂了" + fish.getName());
    }

    //方法重载
    public void feed(Dog dog, Bone bone) {
        System.out.println("主人： " + getName() + "给" +
                dog.getName() + "喂了" + bone.getName());
    }*/

    //利用父类统一管理主人喂食信息
    /*分析：animal 的编译类型是Animal,可以接受子类的对象
    *      food 的编译类型是Food,可以接受子类的对象*/
    public void feed(Animal animal,Food food) {
        System.out.println("主人： " + getName() + "给" +
                animal.getName() + "喂了" + food.getName());
    }
}
