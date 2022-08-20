package com.stuHsp.extend_.impove_;

public class Student {
    //属性父类
    public int age;
    public String name;
    private double score;

   //方法父类
    public void setScore(double score) {
        this.score = score;
    }
    public void Age() {
        System.out.println("大学生: " + name + "的年龄为：" + age);
    }
    public void info(){
        System.out.println("姓名: " + name + " 成绩: " + score + " 年龄: " + age);
    }
}
