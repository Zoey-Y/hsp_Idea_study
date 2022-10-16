package com.HomeWorkChapter08.Home05;
/*题目：
 *   父类：员工类 子类：
 *   1.工人类  2.农民类(Peasant) 3.教师类
 *   4.科学家类scientist 5.服务生类waiter
 *
 *   (1)工人、农民服务生只有基本工资
 *   (2)教师除基本工资外,还有课酬(100/天)
 *   (3)科学家除基本工资外,还有年终奖
 *   (4)编写一个测试类,将各种类型的员工的全年工资打印出来
 * */
public class Scientist extends Staff02{
    private double bonus;//年终奖
    private double yearsal = getMonth() * getBaseSal()  + bonus;
    public Scientist(String name, double baseSal,double bonus) {
        super(name, baseSal);
        setBonus(bonus);
    }

    @Override
    public String toString() {
        return "科学家全年工资\n" + "Scientist{" + getName() + "\'"+
                ", 年终奖：" + bonus + ", 全年工资：" + yearsal +
                '}';
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
