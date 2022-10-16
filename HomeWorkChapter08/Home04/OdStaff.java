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
public class OdStaff extends Staff{
    private double level = 1.2;
    private double salary;

    //构造器初始化作用:把属性都初始化
    //子类的结构体要super上父类的属性(必须放在第一行)，再把自己的属性初始化上
    public OdStaff(String name, double salaryDay, int day) {
        super(name, salaryDay, day);
        setLevel(level);
        setSalary(salary);
    }

    //重写父类打印属性
    @Override
    public void printSalary() {
        super.printSalary();//子类找不到的属性去父类找
        //普通员工工资 = 单日工资 * 天数 * 等级 (1.0)
        salary = salaryDay * day * level;
        System.out.println("普通员工工资：" + salary);//子类有的属性就用
        System.out.println();
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
}
