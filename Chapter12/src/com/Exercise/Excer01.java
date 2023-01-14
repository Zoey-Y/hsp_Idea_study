package com.Exercise;

import java.util.Scanner;

public class Excer01 {
    public static void main(String[] args) {
        /*若用户输入的不是一个整数,
        就提示他重新输入,直到输入一个整数*/
        input.method();
    }
}

class input {

    public static void method() {
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        while (true) {
            System.out.println("请输入一个整数:");
            String num = scanner.next();
            try {
                res = Integer.parseInt(num);//执行到这里会自行判断是否为数字格式错误
                System.out.println("输入的整数为:" + res);
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入的不是一个整数,重新输入..");
            }
        }
    }
}