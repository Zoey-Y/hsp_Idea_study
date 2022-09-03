package com.Override;

public class Dog extends Animal{
    //1.(名称、返回类型、参数)一样,
    //2.所有就说这个Dog类的Cry方法覆盖了父类的Cry方法
    public void Cry(){
        System.out.println("狗的哭声");
    }

    public String m1(){//此时也满足重写的条件
        /*细节二：
        * 1.子类 和 父类 方法返回的类型一样,则满足重写
        * 2.或者 父类 返回的类型是Object 子类是 String，
        * 则也满足重写
        */
        return null;
    }

    //这样可以
    /*public A m3(){//如果父类的返回类型是B就不行因为父类只调用了B没有A的部分
        return null;
    }*/
    //这样可以
    /*public B m3(){//因为A被B继承了，父类只是调用了A类
        return null;
    }*/

    //第四部分
    /*细节四：子类的方法不能缩小父类的访问权限,
    * private String m4(){
    * }*/
    //细节四:但子类可以扩大父类的访问权限
    public String m4(){
        return  null;
    }
}
//第三部分：同理当创建一个类
class A{

}
class B extends A{

}