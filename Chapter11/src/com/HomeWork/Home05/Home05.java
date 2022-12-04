package com.HomeWork.Home05;
/*实例化Person对象"唐僧"*/
public class Home05 {
    public static void main(String[] args) {
        Person tang = new Person("唐僧", new Boat());
        tang.common();//一般情况下用马车
        tang.passRiver();//过河用船只
        tang.passFireMountain();//过火焰山用飞机
    }
}

