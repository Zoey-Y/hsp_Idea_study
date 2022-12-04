package com.InnerClass.MemberInnerClass;
/*成员内部类:
* 1.定义在外部类的位置上,并没有static
* 2.可以任意添加访问修饰符,因为他属于成员变量,
* 这与在方法内的内部类不同,因为这属于局部变量
*
* 作用域:与其它成员一样作用于整个类体
*
* 内部类想使用外部类成员:可以直接调用
* 外部类想使用内部类成员:写一个方法创建对象使用其方法
* */

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.print();

        /*外部其他类使用成员内部类的三种方式:*/
        //1.new Inner08相当于Outer08中的一个成员
        Outer08.Inner08 inner08 =  outer08.new Inner08();
        //2.在外部类中写一个返回Inner08的一个方法,再调用
        Outer08.Inner08 inner081 = outer08.getInner08();
    }
}
class Outer08{
    private int n1 = 10;//外部类成员n1
    public String name = "张三";

    public class Inner08{//成员内部类(特点:在外部类的成员位置上,并没有static修饰)
        private int n1 = 20;//内部类成员n1
        public void say(){
            //可以直接调用外部成员
            System.out.println("n1 = " + n1 + "\t名字:" + name);
            /*外部类成员 与 内部类成员 重名时的调用方式*/
            System.out.println("外部类成员n1 = " + Outer08.this.n1 +
                    "\t内部类成员n1 = " + n1);
        }
    }
    
    public Inner08 getInner08(){
        return new Inner08();
    }
    
    //创建成员内部类方法(使用)
    public void print(){
        Inner08 inner08 = new Inner08();
        inner08.say();
    }
}
