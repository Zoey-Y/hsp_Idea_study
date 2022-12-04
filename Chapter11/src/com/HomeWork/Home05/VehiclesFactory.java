package com.HomeWork.Home05;
/*创建交通工具工厂,可以获得Horse,Boat*/
public class VehiclesFactory {
    //马是同一匹马(如果这里先用static声明对象,下一次实例化时就不用再次加载一个新的马匹了)
    private static Horse horse = new Horse();//饿汉式
    private static Plane plane = new Plane();
    public static Horse getHorse(){
       //return new Horse();
        return horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }
    public static  Plane getPlane(){
        return plane;
    }
}
