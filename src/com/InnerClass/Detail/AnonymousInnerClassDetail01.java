package com.InnerClass.Detail;
/*内部类:(外部类成员的调用细节)
* 1.可以直接访问外部类的所有成员
* 2.不能添加访问修饰符(public,protect,private..),
* 内部类的地位就是一个局部变量
* 3.内部类的作用域:只在定义它的 方法 或 代码块 中
* 4.匿名内部类---访问--->外部类成员[访问方式:直接访问]
* 5.外部其他类 不能访问 匿名内部类(因为其本质是局部变量)
* 6.若 外部类 和 匿名内部类的成员重名时,
*   若想访问匿名内部类 默认是就近原则,
*   若想访问外部成员,则可以使用 (外部类名.this.成员) 去访问*/

public class AnonymousInnerClassDetail01 {
    public static void main(String[] args) {
        OuterClassD1 outerClassD1 = new OuterClassD1(1);
        outerClassD1.method();//调用创建了匿名内部类的方法
    }
}
class OuterClassD1{
    private int n1;

    public OuterClassD1(int n1) {
        this.n1 = n1;
    }
    public void method(){//匿名内部类的创建之地
        new Person(){//类 的 匿名内部类还可以这样写
            private int n1;
            {//此代码块充当构造器的作用
                n1 = 2;
            }
            //重写一个print()
            @Override
            public void print(String name) {
                super.print(name);
                System.out.println("1.金山词霸");
                System.out.println("访问n1(就近原则):" + n1 + "\n" +
                        "访问外部类成员n1(写法:OuterClassD1.this.n1)" + OuterClassD1.this.n1);
            }
        }.print("大靓仔");
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }
}


class Person{
    public void print(String name){
        System.out.println("打印目录:");
        System.out.println("打印人:" + name);
    }
}