package com.stuHsp.extend_;

public class ExtendsDetail {
    /*细节一:
      1.子类继承了父类所有的属性和方法
    * 2.但是私有属性 和 方法不能在子类直接访问
    *   要通过公共的方法去访问*/
    public static void main(String[] args){
        Sub sub = new Sub();
        sub.sayOk();
    }
}
