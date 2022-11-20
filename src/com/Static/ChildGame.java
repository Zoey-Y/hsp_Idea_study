package com.Static;

public class ChildGame {
    public static void main(String[] args) {
//        int count = 0;//统计人数
        Child dsaf = new Child("dsaf");
        Child dghh = new Child("dghh");
        dsaf.join();
//        count++;
        dsaf.count++;
        dghh.join();
//        count++;
        dsaf.count++;
//       类变量可以通过类名来访问
        System.out.println("现在有" + Child.count + "个人");
//        以下代码输出是一样的
        System.out.println(dsaf.count);//2
        System.out.println(dghh.count);//2
/*
* 1.count是一个独立的对象,Java是一给面向对象的语言
* 2.以后访问count很麻烦,没有使用到OOP
* 3.因此，引出 类变量(静态变量)
* */
    }
}

class Child {
    private String name;
    //定义一个count变量,此为类变量(或称静态变量) static
    //该变量最大的特点是会被Child类的所有对象实例共享
    public static int count = 0;
    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入了我们");
    }
}
