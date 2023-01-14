package com.ExceptionDetail;

public class Detail03 {
    public static void main(String[] args) {
        /**
         * t-f:没有捕获异常,程序会执行完finally后退出
         * 应用场景:
         *  执行一段代码,无论是否异常,都必须执行某个逻辑业务
          */
        try{
            int n1 = 10;
            int n2 = 0;
            System.out.println(n1 / n2);
        }finally {
            System.out.println("执行了finally....");
        }
        System.out.println("程序继续...");
    }
}
