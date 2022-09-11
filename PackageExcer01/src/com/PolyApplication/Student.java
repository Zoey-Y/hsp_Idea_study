package com.PolyApplication;

public class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public String say(){
        return super.say() + " 成绩：" + getScore();
    }
    //Student的特有方法
    public String Study(){
        return "学生" + getName() + "正在上课...";
    }
}
