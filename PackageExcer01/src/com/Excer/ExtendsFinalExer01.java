package com.Excer;

public class ExtendsFinalExer01 {
    public static void main(String[] args){
        B b = new B();//步骤1.首先先加载B类中内容
        /*步骤8：最后才会在这里打印
        * a
        * b name
        * b*/
    }
}
class A{//A是B的父类
    A(){//A类的无参构造器
        System.out.println("a");//步骤5就进来打印了一个a
    }
    A(String name){//A类的有参构造器构造器
        System.out.println("a name");
    }
}
class B extends A{//B继承A
    B(){//因为此处构造体内第一行是this，所有没有继承A类的结构体，传的是本类中的方法
        this("abc");//this()是传本类中的方法 //步骤2进到方法this("abc")代指了B(String name)
                          //步骤6执行完传参过来就传 a 和 b name
        System.out.println("b");//步骤7：再打印b，执行完这里再回传到主函数创建的对象
    }
    B(String name){//所有这里是步骤3
        //步骤4来到了这里默认继承的A类默认无参结构体，super()传了一个a来
        System.out.println("b name");//步骤6：打印了一个 b name
    }
}