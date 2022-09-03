package com.Poly.PolyDetail;

public class Cat extends Animal{
    @Override
    public void eat() {//方法重写
        System.out.println("猫吃鱼");
    }
    public void catchMouse(){
        System.out.println("猫吃老鼠");
    }
}
