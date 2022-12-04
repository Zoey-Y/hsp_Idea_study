package com.HomeWork;

public class Home01 {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());//100100
        System.out.println(Frock.getNextNum());//100200
        Frock frock = new Frock();//100300
        Frock frock1 = new Frock();//100400
        Frock frock2 = new Frock();//100500
        //输出:
        System.out.println(frock.getSerialNumber());
        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());
    }
}
class Frock{
    //衣服出场的序列号起始值(由于static:所有new对象时值加载一次,下一次new便不再加载了)
    private static int currentNum = 100000;

    //提供对应的get()
    private int serialNumber;

    public Frock() {
        //为serialNumber获取唯一的序列号
        this.serialNumber = getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }



    //生成上衣唯一序列号的方法,没调用一次currentNum增加100,并返回值
    public static int getNextNum(){
        return currentNum += 100;
    }
}