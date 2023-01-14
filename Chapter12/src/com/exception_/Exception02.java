package com.exception_;

public class Exception02 {
    public static void main(String[] args) {
        //1.空指针异常NullPointerException
       /* String name = null;
        System.out.println(name.length());*/
        //2.数组越界异常ArrayIndexOutOfBoundsException
       /* int[] arr = {1,2,3};
        for (int i = 0; i <= arr.length; i++){//越界异常
            System.out.println(arr[i]);
        }*/

        //3.类型转换异常ClassCastException
        /*A b = new B();
        B b2 = (B)b;//这样可以
        try {
            C b3 = (C)b;//b的对象是B类型是A,虽然继承了A,但与C无关,所以类型转化异常
        } catch (ClassCastException e) {
            e.printStackTrace();
        }*/

        //4.数字格式异常NumberFormatException
       /* String name = "这里不写数字就会报数字格式异常";
        //将String 转换成 int
        int num = Integer.parseInt(name);*/
    }
}

//3.类型转换异常
class A {
}

class B extends A {
}

class C extends A {
}
