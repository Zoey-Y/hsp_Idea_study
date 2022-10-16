package com.HomeWorkChapter08.Home06;
/*题目：假定Grand、Father、Son在同一个包
* 问：父类和子类中通过this和super否可以调用哪些属性和方法*/
public class HomeWork06 {
}
class Grand{
    String name ="AA";
    private int age = 100;
    public void g1(){}
}

class Father extends Grand{
    String id = "001";
    private double score;
    public void f1(){}
    /*
    super可以访问那些成员(属性)和方法？ 答：可以访问父类的super.name、super.g1()
    this可以访问哪些成员？     答：this可以访问本类的this.id、this.score、this.f1()
                                还可以访问超类的this.name、this.g1()*/

}

class Son extends Father{
    String name ="BB";
    public void g1(){}
    private void show(){}
    /*
    super可以访问那些成员(属性)和方法？ 答：可以访问父类的supeer.id、super.f1(),
                                        超类的super.name、super.g1()
    this可以访问哪些成员？ 答：可以访问本类的this.name、this.g1()、this.show()
                            可以访问父类的this.id、this.f1()
                            f访问不了超类的name和g1()因为本类就已经有了不用再去找上面的类了*/

}