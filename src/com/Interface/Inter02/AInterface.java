package com.Interface.Inter02;
/*1.在jdk7之前 接口里的方法必须全是抽象方法不可以有实现了的方法
    在jdk8之后 接口里的方法可以有实现过后的方法了,
    但是需要default关键字修饰
  2. 在jdk8之后,可以实现静态方法*/
public interface AInterface {
    //属性
    public int n1 = 10;
    //方法
    //在接口中，抽象方法，可以省略abstract关键字
    public void hi();
    //在接口这实现一个方法
    default public void ok(){
        System.out.println("ok..");
    }
    //jdk8之后在接口这实现一个静态方法
    public  static void cry(){
        System.out.println("cry..");
    }
}
