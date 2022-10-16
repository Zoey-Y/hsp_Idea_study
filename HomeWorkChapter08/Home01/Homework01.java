package com.HomeWorkChapter08.Home01;

/*定义一个Person类(name,age,job),初始化Person对象数组
* 有3个Person对象,并按照age从大到小进行排序(用冒泡排序)*/
public class Homework01 {
    public static void main(String[] args){
        //2.初始化Person对象数组
        int len = 3;
        Person[] person = new Person[len];
        //3.有3个Person对象
        person[0] = new Person("jak",25,"快递圆儿");
        person[1] = new Person("bak",23,"打金佬");
        person[2] = new Person("cak",12,"程序员儿");

        //4.按照age从大到小进行排序 的输出
        System.out.println("原来年龄的顺序");
        for(int i = 0 ;i < len ; i++){
            System.out.println(person[i] + " ");//Person对象已经重写了toString(),因此在这里可以直接打印Person内容
        }
        System.out.println();
        //排序后的顺序
        System.out.println("排序后的顺序");
        AgeSort ageSort = new AgeSort();
            ageSort.AgeBS(person);
            ageSort.print(person);

    }
}
