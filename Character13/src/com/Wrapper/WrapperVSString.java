package com.Wrapper;

public class WrapperVSString {
    public static void main(String[] args) {
        //包装类(eg:Integer) --> String
        Integer i = 100;//自动装箱
        //方法1:
        String str1 = i + "";//加一个空串就能将100 --> "100"
        //方法2:
        String st2 = i.toString();
        //方法3:
        String str3 = String.valueOf(i);
        //传进去的i是一个对象(Integer本身就是来自于Object的)

        //String -->包装类
        String str4 = "1234";
        Integer i1 = Integer.parseInt(str4);
        //方法2:
        Integer i2 = new Integer(str4);//Integer构造器里又ParseInt转换代码
    }
}
