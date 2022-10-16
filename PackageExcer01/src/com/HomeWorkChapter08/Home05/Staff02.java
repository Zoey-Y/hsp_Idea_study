package com.HomeWorkChapter08.Home05;
/*题目：
 *   父类：员工类
 *   子类：
 *   1.工人类  2.农民类(Peasant) 3.教师类
 *   4.科学家类scientist 5.服务生类waiter
 *   (1)工人、农民服务生只有基本工资
 *   (2)教师出基本工资外,还有课酬(100/天)
 *   (3)科学家出基本工资外,还有年终奖
 *   (4)编写一个测试类,将各种类型的员工的全年工资打印出来
 * */
public class Staff02 {
    private String name;
    private double baseSal;
    private int Month = 12;
    private int day = 280;
    public Staff02(String name, double baseSal) {
        this.name = name;
        this.baseSal = baseSal;
    }

    //打印全年工资


    @Override
    public String toString() {
        return "Staff02{"  + name + '\'' +
                ", 全年基本工资：" + baseSal * 12  +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSal() {
        return baseSal;
    }

    public void setBaseSal(double baseSal) {
        this.baseSal = baseSal;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        Month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
