package com.stuHsp.modifier;
/*A类是验证四种访问修饰符在(本包，本类中)是否可被使用(都可以被使用)
* B类是验证四种访问修饰符在(本包的其它类中)是否可以被使用(private不可以被使用)
* C类是验证四种访问修饰符在(不同包中)是否能被使用(只有public类可以被使用)
* 子类的情况学到继承时才讲.*/
//成员方法 访问规则 与 属性(成员变量)一样
import com.stuHsp.pkg.C;

public class test {
    public static void main(String[] args){
        //运行A(本类)的属性
        A a = new A();
        a.printA();
        //运行B类中的方法(该方法调用了A类中的属性）
        B b = new B();
        b.printB();
        //C运行B类中的方法(该方法调用了A类中的属性)
        C c = new C();
        c.printC();
    }
}
//只有 public 和 默认可以修饰类
class t{

}
