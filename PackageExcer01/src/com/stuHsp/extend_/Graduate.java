package com.stuHsp.extend_;

/*大学生在考试情况*/
public class Graduate {
    public int age;
    public String name;
    private double score;

    //某大学生考试的方法
    public void testing() {
        System.out.println("大学生: " + name + "正在考试");
    }

    //某大学生成绩的方法
    public void setScore(double score) {
        this.score = score;
    }

    //某大学生年龄
    public void Age() {
        System.out.println("大学生: " + name + "的年龄为：" + age);
    }
    //某大学生总信息
    public void info(){
        System.out.println("姓名: " + name + " 成绩: " + score + " 年龄: " + age);
    }
}

