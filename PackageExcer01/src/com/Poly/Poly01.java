package com.Poly;
/*完成一个主人给宠物喂食的信息
* 此类的作用就是汇总和创建对象并输出*/
public class Poly01 {
    public static void main(String[] args){
       /* Fish fish = new Fish("鱼");
        Cat cat = new Cat("加菲");
        Master master = new Master("飞哥");
        master.feed(cat,fish);

        System.out.println("======================");
        Dog dog = new Dog("十三");
        Bone bone = new Bone("排骨");
        master.feed(dog,bone);*/
        //总结如果动物类，食物类很多就要很多feed方法调用，不利于维护
        //问题：代码的复用性不高，不利于维护----------引出多态解决方案

        //方法的多态(重载的多种状态)
        Master master = new Master("主人");
        master.feed(new Dog("十三~"),new Bone("排骨~"));
        master.feed(new Cat("加菲~"),new Fish("刺身~"));
        master.feed(new Pig("猪~"),new Rice("大米~"));
    }
}
