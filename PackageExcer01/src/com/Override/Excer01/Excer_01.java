package com.Override.Excer01;
/*在main中，分别创建Person 和 Student对象，
* 调用say方法输出自我介绍*/
public class Excer_01 {
    public static void main(String[] args){
        Person person = new Person("yzl",22);
        person.say();
        System.out.println("=============================");
        Student student = new Student(12342312,100,"lzy",23);
        student.say();
    }
}
