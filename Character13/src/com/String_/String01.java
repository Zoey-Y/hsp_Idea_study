package com.String_;

public class String01 {
    public static void main(String[] args) {
        /*1."jack",像这样用双引号括起来的是字符串序列
        * 2.String类有很多构造器重写(以上有常用的构造器重写)
        * 3.String 类实现了接口 Serializable (使得String
        * 可以[串行化:可进行网路传输])，
        * 接口Comparable(使得
        * String可以比较大小)
        * 4.String是final类，不能被其它的类继承
        *
        *
        * 5.一定要注意value是final类型，一旦被赋值,该值的地址
        * 是不能被修改,但该地址下的值可被修改
        * 这里的value不能指向新地址,但单个
        * 字符内容是可以变化的.*/
        String name = "jack";
        //5.例子：
        final char[] value ={'a','b'};
        char[] v2 = {'f','d'};
        value[0] = 'd';//value数组内单个字符是可以被修改的
        //value = v2;//由于final,不能将value的地址修改成v2的地址
    }
}
