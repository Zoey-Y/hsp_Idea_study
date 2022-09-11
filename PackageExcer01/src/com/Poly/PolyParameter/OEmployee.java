package com.Poly.PolyParameter;
/*普通员工多了work方法
* 普通员工和经理要求分别重写getAnnual方法*/
public class OEmployee extends Employee{
    public OEmployee(String name, double monthSalary) {
        super(name, monthSalary);
    }
    public double getAnnul(){
        return super.getAnnual();
    }
    public void work(){
        System.out.println("普通员工：" + getName() + "正在工作中...");
    }
}
