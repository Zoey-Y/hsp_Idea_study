package com.HomeWorkChapter08.Home11;
/*现有一个Person类,里面有run(),eat(),
* Student继承了Person类,并重写了run(),
* 自定义了study().
* 试写出对象向上转型 和 向下转型的代码,
* 并写出各自都可以调用哪些方法 和 写出方法输出什么*/
public class Person {
    public void run(){
        System.out.println("Person run");
    }
    public void eat(){
        System.out.println("Person eat");
    }
}
