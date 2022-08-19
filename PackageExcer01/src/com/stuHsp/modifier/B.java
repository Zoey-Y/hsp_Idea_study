package com.stuHsp.modifier;
//B类是验证在不同类中用不同修饰符修饰的属性能否被使用
public class B {
    public void printB(){
        A a = new A();
        //1.创建一个方法，其中执行A中的属性
        //私有的访问修饰符(private)不能跨类使用
        System.out.println("n1= " + a.n1 + " n2= " + a.n2 + " n3=" + a.n3);
    }

}
