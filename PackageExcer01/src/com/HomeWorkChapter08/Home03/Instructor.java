package com.HomeWorkChapter08.Home03;

public class Instructor extends Teacher{
    private String salary = "1.1w";
    public Instructor(String name, int age, String post) {
        super(name, age, post);
        setSalary(salary);
    }
    //重写父类introduce()
    @Override
    public String introduce() {
        return super.introduce() + "\t讲师的工资为" + getSalary();
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
