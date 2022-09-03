package com.Override.Excer01;
/*编写一个Person类,包括属性/private(name、age),
 * 构造器、方法say(返回自我介绍的字符串)*/
public class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        setAge(age);
        setName(name);
    }
    public void say(){//只输出父类的say()
        System.out.println("name: " + getName() + "  age: " + getAge());
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
}
