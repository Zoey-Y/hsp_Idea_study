package com.PolyApplication;

public class Teacher extends Person{
    private String teach;

    public Teacher(String name, int age, String teach) {
        super(name, age);
        setTeach(teach);
    }

    public String getTeach() {
        return teach;
    }

    public void setTeach(String teach) {
        this.teach = teach;
    }
   //重写say方法
    public void say(){
        super.say();
        System.out.println(getName() + "老师是教:" + getTeach());
    }
}
