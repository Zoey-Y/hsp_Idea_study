package com.Annotation;

public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();//有个中划线,表示过时了,但可以用
        a.hi();
        System.out.println(a.n1);
    }
}
/*解析:
* 1.修饰某个元素(类),表示已经过时了
* 2.不推荐使用,但可以用
* 3.可以修饰:方法,类,字段,包,参数等等
* 4.可以作为升级过度的使用:比如:
* jdk8有个A类---要升级成--->jdk11的B类
* 就要将jdk8的A类标注过时,最好使用jdk11的B类
* */
@Deprecated
class A{
    @Deprecated
    public int n1 = 10;
    @Deprecated
    public void  hi(){}
}