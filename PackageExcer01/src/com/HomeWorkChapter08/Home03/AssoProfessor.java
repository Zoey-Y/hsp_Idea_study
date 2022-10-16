package com.HomeWorkChapter08.Home03;

public class AssoProfessor extends Teacher{
    private String salary = "1.2w";
    //子类构造器内需要super父类的属性
    public AssoProfessor(String name,int age,String post){
        super(name,age,post);
        setSalary(salary);
    }
    //重写父类introduce()
    @Override
    public String introduce() {
        return super.introduce() + "\t副教授的工资为：" + getSalary();

    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
