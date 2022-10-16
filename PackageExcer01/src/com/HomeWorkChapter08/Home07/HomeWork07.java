package com.HomeWorkChapter08.Home07;
/*题目：判断输出结果*/
public class HomeWork07 {
    public static void main(String[] args){
        new Demo().test();
        /*Test
          Demo
          Rose
        * Jack*/
        new Demo("John").test();
        /*John
        * Jack */
    }
}
class Test{
    String name ="Rose";//变成了John
    Test(){
        System.out.println("Test");
    }
    Test(String name){//John
        this.name = name;//John
    }
}

class Demo extends Test{
    String name = "Jack";
    Demo(){
        super();//Test，这里的super不写也有默认的super
        System.out.println("Demo");
    }
    Demo(String s){//John
        super(s);
    }
    public void test(){
        System.out.println(super.name);//1.Rose  2.John
        System.out.println(this.name);//1.Jack   2.Jack
    }

}
