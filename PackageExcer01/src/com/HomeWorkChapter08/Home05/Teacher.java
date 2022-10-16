package com.HomeWorkChapter08.Home05;
/*题目：
 *   父类：员工类 子类：
 *   1.工人类  2.农民类(Peasant) 3.教师类
 *   4.科学家类scientist 5.服务生类waiter
 *
 *   (1)工人、农民服务生只有基本工资
 *   (2)教师出基本工资外,还有课酬(100/天)
 *   (3)科学家出基本工资外,还有年终奖
 *   (4)编写一个测试类,将各种类型的员工的全年工资打印出来
 * */
public class Teacher extends Staff02{
    private double salary = 100;
    private double yearsal =  getMonth() * getBaseSal() + salary * getDay() ;
    public Teacher(String name, double baseSal) {
        super(name, baseSal);
    }

    @Override
    public String toString() {
        return "教师全年工资\n" + "Teacher{" + getName() + '\'' +
                ", 每天课酬：" + salary + ", 全年工资：" + yearsal +
                '}' ;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
