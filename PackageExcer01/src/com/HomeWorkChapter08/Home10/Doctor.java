package com.HomeWorkChapter08.Home10;

import java.util.Objects;

/*编写一个Doctor类(name,age,job,gender,sal)
* 具有相应的setter和getter方法，五个参数的构造器，
* 重写父类的equals(),
* 方法：public boolean equals(Object obj),
* 并判断测试类中创建的两个对象是否相等。(就是判断属性是否相等)
* */
public class Doctor {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;

    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }
     public boolean  equals(Object obj){//重写父类中的equals方法
        if(this == obj)//this:本类的地址 == 传参的地址  (也就是)
            return true;
        //instanceof比较的是运行类型
        if (obj instanceof Doctor){//若obj是一个Doctor对象的话就进入
            Doctor d = (Doctor) obj;//向下转型(多态的内容)
           /* return this.name.equals(d.name) && this.age == d.age &&
                    this.job.equals(d.job) && this.gender == d.gender
                    && this.sal == d.sal;*/

        }
        return false;//若obj不是Doctor就直接返回false
     }

 /*   @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", gender=" + gender +
                ", sal=" + sal +
                '}';
    }*/

    /* @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Doctor doctor = (Doctor) o;
            return age == doctor.age &&
                    gender == doctor.gender &&
                    Double.compare(doctor.sal, sal) == 0 &&
                    Objects.equals(name, doctor.name) &&
                    Objects.equals(job, doctor.job);
        }
    */
    @Override
    public int hashCode() {
        return Objects.hash(name, age, job, gender, sal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
