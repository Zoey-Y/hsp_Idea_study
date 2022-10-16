package com.HomeWorkChapter08.Home01;
//1.定义一个Person类(name,age,job)
public class Person {
    public String name;
    public int age;
    public String job;

    public Person(String name, int age,String job){
        setName(name);
        setAge(age);
        setJob(job);
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
    public String print(){
        return getName() + "\t" + getAge() + "\t" + getJob();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
