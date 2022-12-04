package com.Annotation;

public class Override_ {
    public static void main(String[] args) {

    }
}
class Father{
    public void fly(){
        System.out.println("father fly..");
    }
}
class son extends Father{
    /*解析:
    * 1.@Override 注解放在fly()上方,表示子类的fly方法重写了父类的fly方法
    * 2.这里若没有写 @Override 还是重写了父类fly()
    * 3.若写了@Override注解,编译器会检查方法是否重写了父类的方法,
    * 若的确重写了则编译通过,若没有重新,则编译错误*/
    @Override
    public void fly() {
        System.out.println("son fly...");
    }
}