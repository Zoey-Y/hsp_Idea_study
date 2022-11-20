package com.codeBlock;

public class Example02 {
    public static void main(String[] args) {
        A a = new A();
        /*分析:
        * 1.由于 (静态代码块) 和 (静态属性初始化)调用的优先级是一样的，
        * 若有 (多个代码块) 和 (多个静态变量) 初始化，
        * 则按他们定义的顺序调用
        * 2.所以此顺序是先执行n1属性，调用getN1(),在执行代码块，调用输出代码块内容*/
        //1.总结多个static的执行顺序是谁写在前面谁就先执行.
        /*多个普通代码块 和 多个普通变量 初始化 的调用顺序也是谁在前面就先调用谁*/
    }
}

class A{
    //静态的
    private static int n1 = getN1();
    //普通的
    private int n2 = getN2();
    static{
        System.out.println("A的静态代码块输出的代码1...");
    }

    {
        System.out.println("A的普通代码块2...");
    }

    public static int getN1(){
        System.out.println("静态方法getN1()的执行...");
        return 100;
    }

    public int getN2(){
        System.out.println("普通方法getN2()调用");
        return 200;
    }
}
