package com.Interface.InterfacePloy;

public class InterfacePoly01 {
    public static void main(String[] args) {
        //接口多态的体现
        /*1.解读：IF是接口类型, if01是其变量 Monkey 和 Fish 是实现了IF接口的对象
          2.接口类型的变量 if01 可以指向 实现了IF接口的对象*/
        IF if01 = new Monkey();
        if01 = new Fish();

        //继承体现的多态
        /*父类类型的变量 a 可以指向 继承了AA的子类对象*/
        AA a = new BB();//向上转型
        a = new CC();

        /*//向下转型：例如AA强转成了BB
        AA aa = new AA();
        BB bb = (BB) aa;*/
    }
}
interface IF{//某种接口

}
class Monkey implements IF{}
class Fish implements IF{}

//继承体现的多态
class AA{}
class BB extends AA{}
class CC extends AA{}