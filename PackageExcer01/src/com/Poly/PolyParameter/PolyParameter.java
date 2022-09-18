package com.Poly.PolyParameter;

import java.util.Optional;

public class PolyParameter {
    public static void main(String[] args){
        /*Method 1：动态绑定机制的写法(直接创建对象来调用相关消息)
         * OEmployee Jasx = new OEmployee("Jasx",5000);
         * PolyParameter polyParameter = new PolyParameter();
         * polyParameter.showEmpAnnual(Jasx);
         * */

        /*Method 2：(通过创建父类的数组，用父类的数组接收子类的相关内容)*/
        Employee[] employees = new Employee[3];
        //向上转型
        employees[0] = new OEmployee("Jasx",5000);
        employees[1] = new OEmployee("gasz",3000);
        employees[2] = new Manager("kasd",10000,20000);
        PolyParameter polyParameter = new PolyParameter();
        System.out.println("所有员工的年收入：");
        for(int i = 0;i < employees.length;i++){
            polyParameter.showEmpAnnual(employees[i]);
        }
        System.out.println("各工种的工作状态：");
        for(int i = 0 ;i < employees.length; i++){
            polyParameter.testWork(employees[i]);
        }
    }
    //获取对任何员工年收入的方法
    public void showEmpAnnual(Employee e){//创建Employee 的父类对象 名为e
        System.out.println(e.getName() + "的年收入：" + e.getAnnual());//意思是调用Employee中的getAnnual
    }
    //父类Employee子类有独自的方法，调用父类可以调用到子类的方法，但是调用子类则不能父类的方法的
    //如果是普通员工则调用work方法
    //如果是经理则调用manage方法
    public void testWork(Employee e){//调用父类
            if(e instanceof OEmployee){//若父类像行转型与子类型相等
                ((OEmployee) e).work();//父类就向下转型调用子类的work()
                /*第二种写法:
                  OEmployee worker = (OEmployee) e;
                worker.work();
               */
            }else if(e instanceof Manager){
                ((Manager) e).manage();
            }
    }
}
