package com.single_;
/*饿汉式的单例模式*/
public class SingleTon01 {
    public static void main(String[] args) {
//        GirlFriend xh = new GirlFriend("小红");
//        GirlFriend xb = new GirlFriend("xb");
        //静态方法可直接通过类直接获取
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
    }
}
//只能有一个女朋友
class GirlFriend{
    private String name;

    //如何保障我们只能创建一个对象？
    /*步骤:
    * 1.将构造器私有化
    * 2.在类的内部创建对象(该对象为static)
    * 3.提供一个公共的静态方法,返回gf对象*/
    //为了能够在静态方法中返回gf方法，需要static
    private static GirlFriend gf = new GirlFriend("小红红");//在类内实例化唯一对象
    private GirlFriend(String name) {
        this.name = name;
    }
    public static GirlFriend getInstance(){//获取实例
       return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}