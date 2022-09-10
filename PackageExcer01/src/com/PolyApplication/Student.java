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
    public void say(){
        super.say();
        System.out.println("成绩：" + getScore());
    }
}
