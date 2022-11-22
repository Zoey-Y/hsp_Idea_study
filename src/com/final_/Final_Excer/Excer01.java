package com.final_.Final_Excer;
/*编写能够计算圆形的面积，圆周率为3.14
* 赋值的位置3个三个方式都写一下
* 1.属性声明时直接赋值
* 2.构造器赋值
* 3.在代码块中赋值*/
public class Excer01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("面积：" + circle.calArea());
    }
}
class Circle{
    private double radius;
    private final double PI ;//= 3.14;//声明时直接赋值

    public Circle(double radius) {
        this.radius = radius;
       //构造器赋值 PI = 3.14;
    }
    {
        PI = 3.14;//代码块赋值
    }

    public double calArea(){
        return PI * radius * radius;
    }
}