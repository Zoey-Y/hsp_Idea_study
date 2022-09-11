package com.Poly.PolyParameter;
/*定义员工类Employee 包含：姓名、月工资(private)
* 计算年工资getAnnual的方法
* 普通员工 和 经理 继承了员工类
* 经理类多了奖金bonus属性 和 管理manage方法
* 普通员工多了work方法
* 普通员工和经理要求分别重写getAnnual方法*/
public class Employee {
    private String name;
    private double monthSalary;

    public Employee(String name, double monthSalary) {
        setName(name);
        setMonthSalary(monthSalary);
    }
    public double getAnnual(){//计算员工年工资
       return 12 * monthSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }
}
