# 九、Object详解(面试题)

## 一、Object的方法摘要：

* ##### equals(Object obj) ——>返回类型是boolean型(看看他的某个对象是否与此相等)
* ##### finalize() ——>返回类型是void
* ##### getClass() ——> 返回object运行时类
* ##### hashCode() ——> 返回对象的哈希码值
* ##### toString() ——> 返回该对象的字符串表示

### 1. ==方法：

* #### ==是比较运算符:既可以判断 基本类型 也可以判断 引用类型

* #### ==如果判断 (基本类型)，判断的是 (值 ) 是否相等

* #### ==如果判断 (引用类型)，判断的是 (地址)  是否相等

### 2.==的使用例子

~~~java
package com.Object;

public class Equals {
    public static void main(String[] args){
        A a = new A();
        A b = a;//将引用类型a赋给以A为类型的b
        A c = b;//将引用类型b赋给以A为类型的c
        System.out.println(a == c);//true
        /*B b1 = new B();
        b1 = a;*/
        //第二种写法：
        B b1 = a;
        System.out.println(b1 == a);//true

    }
}
class B{}
class A extends B{}


~~~

## 二、equals方法：

* ### equals：是Object类中的方法 (只能) 判断 (引用类型)

* ### 默认判断的是  (地址)  是否相等，子类中往往重写该方法，用于判断内容是否相等

