package com.exception_;

import sun.print.Win32MediaTray;

public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        /*1.由于分母为零,数学上是无穷,计算机上运行则会出错
        * 2.因此执行到这里为了能够使程序正常运行,则要抛出异常(ArithmeticException:算数异常)
        * 3.当抛出异常后,程序就退出,不执行下面代码
        *
        * 4.语法错误不是异常
        * 5.Error:java虚拟机无法解决的错误
        * 6.Exception:编程错误或偶然的外在因素导致的一般问题
        * eg:空指针访问,网络连接中断.....
        * 7.两大类异常:
        *       一,运行时异常(程序运行时发现的)--->一般是逻辑异常(可以不处理)
        *       二,编译时异常(编译器检测出来的)--->必须处理*/
        //int res = num1 / num2;
        /*可使用try-catch异常处理机制保证程序健壮性*/

        try {
            int res = num1 / num2;

        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());//e.getMessage()把你的异常现象输出来
        }
        System.out.println("程序继续运行...");
    }
}
