package com.PolyApplication;
/*1.数组的定义类型为父类类型，里面保存的实际类型为子类型
* 2.应用实例：
*       现有一个继承结构,如下：
*        创建1个Person对象,2个Student对象和
*        2个Teacher对象,统一放在数组中，并调用say方法
*        Teacher有一个teach，Student有一个score怎么用？*/
public class PolyArr {
    public static void main(String[] args){
        Person[] people = new Person[5];//我想创造五个人
        people[0] = new Person("Jack",33);//第一种人叫jack，33岁，父类
        people[1] = new Student("Hasck",12,77);//第二种人是学生
        people[2] = new Student("Basca",19,100);//第三种人是学生
        people[3] = new Teacher("wtxas",33,"线性代数");
        people[4] = new Teacher("sadsx",45,"Webssa");

        for (int i = 0;i < people.length;i++){
            people[i].say();//循环每个父类、子类的say()
        }
    }
}
