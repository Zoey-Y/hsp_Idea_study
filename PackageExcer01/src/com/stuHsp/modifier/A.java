package com.stuHsp.modifier;

public class A {
    //创建四种访问修饰符,并在本类中使用
    public int n1 = 100;//公共级别
    protected int n2 = 20;//保护级别
    int n3 = 43;//默认级别
    private int n4 = 70;//私有级别

    //输出前要弄一个输出方法
    public void printA() {
        //验证在同类中是否能使用不同修饰符修饰的属性
        System.out.println("n1= " + n1 + " n2= " + n2 + " n3=" + n3 + " n4=" + n4);
    }

}
