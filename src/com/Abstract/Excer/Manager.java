package com.Abstract.Excer;
/* 4.Manager类既是员工，还具有奖金bouns属性
 * 5.使用继承的思想,设计CommonEmployee类
 * 和Manager类,要求类中提供必要的方法进行属性访问
 * 实现work()*/
public class Manager extends Employee{
    private double bouns;//经理专属拥有的奖金，非抽象类所以可以private
    public Manager(String name, int id, double salary){
        super(name,id,salary);
        setBouns(bouns);
    }
    //重写父类的抽象方法work

    @Override
    public void work() {
        System.out.println("经理名字："+super.name);
        System.out.println("id:"+super.id);
        System.out.println("奖金为："+ bouns);
        System.out.println("工资为："+ getSalary());
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }
}
