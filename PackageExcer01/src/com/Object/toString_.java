package com.Object;

import com.sun.org.apache.xpath.internal.objects.XObject;

public class toString_ {
    public static void main(String[] args){
        /*toString的原码：
        1.getclass().getName() 是toString的全类名
        2.Integer.toHexString(hashCode) 将对象的hashCode值转换成16进制字符串
            public String toString() {
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
            }
        * */

        //没有重写时，使用toString的结果
        Monster monster = new Monster("妖怪01","巡山",1000);
        System.out.println(monster.toString());//调用toString由于没有重写，所以调用的就是父类(Object)的toString方法
                                              //此时Object的toString方法是将monster对象的hashCode的值转化成十六进制的值
                                              //重写之后输出的是对象的属性值
        System.out.println("看monster的hashCode值 = " + monster.hashCode());
        System.out.println(monster);//直接调用monster，等价于调用monster.toString()
    }
}
class Monster{
    private String name;
    private String job;
    private double sal;
    //重写toString方法，输出对象的属性值
    //使用快捷键即可:alt + insert -> toString
    @Override
    //重写后，一般是把对象的属性值输出，当然程序员也可以自己制定
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }
}

