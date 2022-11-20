package com.Static;

public class VisitStatic {
    public static void main(String[] args) {
        //类名.类变量名
        //说明：类变量是随着类的加载而创建的，所以即使没有创建对象实例也可以访问
        System.out.println(A.name);
        A a = new A();
        System.out.println(a.name);
    }
}
class A{
    //类变量 强调:类变量依然遵守访问权限
    public static String name = "赚钱钱不寒掺";
}