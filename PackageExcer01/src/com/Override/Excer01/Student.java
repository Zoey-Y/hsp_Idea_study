package com.Override.Excer01;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/*编写一个Student类，继承Person类，增加id、score属性/private，
* 以及构造器，定义say方法(返回自我介绍的信息)*/
public class Student extends Person{
    private int id;
    private int score;
    public Student(int id,int score,String name,int age){
        super(name,age);
        setId(id);
        setScore(score);
    }
    public void say(){//输出父子类的say()
        super.say();//复用
        System.out.println("id: " + getId() + "   score: " + getScore());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
