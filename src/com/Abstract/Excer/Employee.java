package com.Abstract.Excer;
/*1.编写一个Employee类,声明为抽象类
 * 2.属性：name、id、salary
 * 3.提供必要的构造器 和 抽象方法方法：work()
 * 4.Manager类既是员工，还具有奖金bouns属性
 * 5.使用继承的思想,设计CommonEmployee类
 * 和Manager类,要求类中提供必要的方法进行属性访问
 * 实现work()*/
public abstract class Employee {
    public String name;
    public int id;
    public double salary;
    //构造器
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public abstract void work();//提供一个抽象方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
