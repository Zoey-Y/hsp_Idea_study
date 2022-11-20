package com.Abstract.Excer;
/* 4.Manager类既是员工，还具有奖金bouns属性
 * 5.使用继承的思想,设计CommonEmployee类
 * 和Manager类,要求类中提供必要的方法进行属性访问
 * 实现work()*/
public class CommonEmployee extends Employee{
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员名字为："+super.name);
        System.out.println("id:"+super.id);
        System.out.println("工资为："+super.salary);
    }
}
