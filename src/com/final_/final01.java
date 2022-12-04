package com.final_;

//import com.Abstract.E;

public class final01 {
    public static void main(String[] args) {
        /*E e = new E();
        e.TAX_RATE = 1;*/
         System.out.println(BBB.n);
        /*BBB bbb = new BBB();*/

    }
}
/*final class  A{//希望A类不被任何的类继承，可以用final

}
class B extends A{

}*/
/*class C{
    //若要求hi()不能被重写,可以用final
    public final void hi(){}
}
class D extends C{
    @Override
    public void hi() {
        System.out.println("重写了C类的hi()");
    }
}*/
/*
//当不希望某个属性的值被修改，可以final
class E{
    public final double TAX_RATE = 0.08;
}
*/
/*//当不希望某个局部变量被修改
class F{
    public void G(){
        //这时NUM称为局部常量
        final double NUM =0.03;
        NUM = 0;
    }
}*/
class BBB{
    public static int n = 1090;//先执行了这个但是输出是在静态代码块执行之后，在主函数中输出的所以1090在后面
    static {
        System.out.println("BBB的静态代码块...");
    }


}
