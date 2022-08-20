package com.stuHsp.extend_;

/*小学生在考试情况*/
public class Pupil {
    public int age;
    public String name;
    private double score;

    //某小学生考试的方法
    public void testing() {
        System.out.println("小学生: " + name + "正在考试");
    }

    //某小学生成绩的方法
    public void setScore(double score) {
        this.score = score;
    }

    //某小学生年龄
    public void Age() {
        System.out.println("小学生: " + name + "的年龄为：" + age);
    }

    //某小学生总信息
    public void info() {
        System.out.println("姓名: " + name + " 成绩: " + score + " 年龄: " + age);
    }
}
