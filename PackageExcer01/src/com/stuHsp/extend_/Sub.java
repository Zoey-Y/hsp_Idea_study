package com.stuHsp.extend_;

public class Sub extends Base{//子类
    public Sub(){//子类必须调用父类的构造器,完成父类的初始化
        /*细节三:
        当创建子类对象时,不管使用子类哪个构造器,默认情况下
        * 总会去调用父类的无参构造器
        * 如果父类没有提供无参构造器,则必须在子类构造器中用super去指定
        * 父类的任意构造器完成对父亲的初始化工作,
        * 否则编译不通过*/
        //细节二：在这里已经默认了一个父类的super()的无参构造器
        System.out.println("sub()...");
    }
    public void sayOk(){
        //我们发现 父类的非private属性和方法都可以访问
        System.out.println(n1 + " " + n2 + " " + n3 + " ");
        System.out.println("n4 = getN4()");
        test100();
        test200();
        test300();
        calltest400();
    }
}
