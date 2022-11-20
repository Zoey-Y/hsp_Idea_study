package com.Abstract.Excer;
/*1.编写一个Employee类,声明为抽象类
* 2.属性：name、id、salary
* 3.提供必要的构造器 和 抽象方法方法：work()
* 4.Manager类既是员工，还具有奖金bouns属性
* 5.使用继承的思想,设计CommonEmployee类
* 和Manager类,要求类中提供必要的方法进行属性访问
* 实现work()*/

public class Excer01 {
    public static void main(String[] args) {
        /*Employee[] employees = new Employee[2];//创建对象数组
        //经理
        employees[0] = new Manager("杨大郎",100,20000.12,5000);
        //普通员工
        employees[1] = new CommonEmployee("杨小郎",101,5000);
        //输出
        employees[0].work();
        System.out.println("==============");
        employees[1].work();*/

        /*写法2*/
        Manager jack = new Manager("jack", 999, 500000);
        jack.setBouns(8000);
        CommonEmployee tom = new CommonEmployee("tom", 888, 5000);
        jack.work();
        System.out.println("========");
        tom.work();

    }
}
