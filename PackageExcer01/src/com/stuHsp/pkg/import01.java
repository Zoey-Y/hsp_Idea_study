package com.stuHsp.pkg;

import java.util.Arrays;

/*建议:需要什么类就导入什么类,不建议全部导入*/
//import  java.util.Scanner;//表示引入java.util包下的Scanner
//import  java.util.*;//表示引入java.util下的所有包
public class import01 {
    public static void main(String[] args){
        //使用系统提供 Arrays 完成 数组的排列
        int[] arr = {-1 ,2 ,64 , 14 ,-52};
        //传统方法是自己编写冒泡排序
        //系统提供了相关的类，可以方便完成Arrays
        Arrays.sort(arr);
        for(int i = 0 ;i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
