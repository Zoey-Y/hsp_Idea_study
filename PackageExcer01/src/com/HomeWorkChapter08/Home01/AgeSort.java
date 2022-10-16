package com.HomeWorkChapter08.Home01;

public class AgeSort {//年龄排序
    Person temp = null;
    //制作一个冒泡排序功能
    public void AgeBS(Person[] person){
        for(int i = 0 ;i < person.length - 1; i++){//循环排序的组数
            for(int j = 0 ;j < person.length - 1 - i; j++){//两两元素进行对比
                if(person[j].getAge() > person[j + 1].getAge()){
                    temp = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = temp;
                }
            }
        }
    }

    //打印
    public void print(Person[] person){
        //冒泡完的顺序
        for(int i = 0 ;i < person.length; i++){
            System.out.println(person[i] + " ");//Person类用重写所以直接调用即可打印
        }
    }
}
