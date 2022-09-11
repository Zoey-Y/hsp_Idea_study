package com.Poly.PolyParameter;
/* 经理类多了奖金bonus属性 和 管理manage方法
* 普通员工和经理要求分别重写getAnnual方法*/
public class Manager extends Employee{
    private double bonus;//奖金

    public Manager(String name, double monthSalary, double bonus) {
        super(name, monthSalary);
        setBonus(bonus);
    }
    public void manage(){
        System.out.println("经理： " + getName() + "正在管理...");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + getBonus();
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

}
