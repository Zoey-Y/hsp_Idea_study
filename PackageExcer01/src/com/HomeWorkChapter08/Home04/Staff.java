package com.HomeWorkChapter08.Home04;
/*题目:
 *   通过继承实现员工工资核算打印功能：
 *   1.部门经理工资 = 10000 + 单日工资 * 天数 * 等级 (1.2)
 *   2.普通员工工资 = 单日工资 * 天数 * 等级 (1.0)
 *   3.员工属性：姓名, 单日工资,工作天数
 *   4.员工方法：打印工资
 *   5.普通员工 及 部门经理都是员工子类，需要重写打印工资方法
 *   6.定义并初始化普通员工的对象,
 *   调用打印工资方法输入工资,定义并初始化部门经理对象,
 *   调用打印工资方法输入工资*/
public class Staff {
    private String name;
    private double salaryDay;
    private int day;

    public Staff(String name, double salaryDay, int day) {
        setName(name);
        setSalaryDay(salaryDay);
        setDay(day);
    }
    //打印工资
    public void printSalary(){
        System.out.println("员工姓名：" + getName() + "\n单日工资：" + getSalaryDay()
                + "\n工作天数" + getDay());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaryDay() {
        return salaryDay;
    }

    public void setSalaryDay(double salaryDay) {
        this.salaryDay = salaryDay;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
