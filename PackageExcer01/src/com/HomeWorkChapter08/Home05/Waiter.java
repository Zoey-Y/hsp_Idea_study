package com.HomeWorkChapter08.Home05;

import com.HomeWorkChapter08.Home04.Staff;

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
public class Waiter extends Staff02 {
    public Waiter(String name, double baseSal) {
        super(name, baseSal);
    }
    @Override
    public String toString() {
        return "服务生的全年工资\n"  + super.toString();
    }
}
