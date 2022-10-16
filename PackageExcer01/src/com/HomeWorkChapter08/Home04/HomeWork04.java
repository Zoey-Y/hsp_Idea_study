package com.HomeWorkChapter08.Home04;
/*题目:
*   通过继承实现员工工资核算打印功能：
*   1.部门经理工资 = 10000 + 单日工资 * 天数 * 等级 (1.2)
*   2.普通员工工资 = 单日工资 * 天数 * 等级 (1.0)
*   3.员工属性：姓名, 单日工资,工作天数
*   4.员工方法：打印工资
*   5.普通员工 及 部门经理都是员工子类，需要重写打印工资方法
*   6.定义并初始化普通员工的对象,调用打印工资方法输入工资,
*     定义并初始化部门经理对象,调用打印工资方法输入工资*/
public class HomeWork04 {
    public static void main(String[] args){
        Staff[] staff = new Staff[2];
        staff[0] = new OdStaff("张大壮",99.3, 360);
        staff[1] = new Manager("李小壮",199.2,360);
        staff[0].printSalary();
        staff[1].printSalary();
    }
}
