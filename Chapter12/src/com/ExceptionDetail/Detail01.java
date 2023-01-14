package com.ExceptionDetail;

public class Detail01 {
    public static void main(String[] args) {
        /**
         * Detail:
         *  1.若异常发生,则一异常后面的代码不会执行,直接进入到catch块
         *  2.若无异常,则不执行catch
         *  3.若有无论发生异常都要执行的代码(eg:关闭连接,释放资源)
         *  则使用finally代码块
         */

        //t-c快捷键:ctrl + atl + t
        try {
            String str = "就就机甲";
            int a = Integer.parseInt(str);
            System.out.println("数字:" + a);
        } catch (NumberFormatException e) {
           System.out.println("异常输出:" + e.getMessage());
        }
        System.out.println("程序继续...");
    }
}
