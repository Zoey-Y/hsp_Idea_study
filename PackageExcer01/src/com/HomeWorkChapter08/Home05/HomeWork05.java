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
public class HomeWork05 {
    public static void main(String[] args){
        int len = 5;
        Staff02[] staff = new Staff02[len];
        staff[0] = new Worker("豹子",555);
        staff[1] = new Peasant("老农",1000);
        staff[2] = new Waiter("弗西斯",661);
        staff[3] = new Teacher("老大哥",5000);
        staff[4] = new Scientist("柯基",10000,5000);
        //打印全年工资
        for(int i = 0 ;i < len ; i++){
            System.out.println(staff[i].toString() + " ");
            System.out.println();
        }
    }
}
