package com.stuHsp.extend_;

public class Base {//父类
    public int n1 = 100;
    protected  int n2 = 200;
    int n3 = 300;
    private int n4 = 400;
    public int getN4() {
        return n4;
    }
    //父类的无参构造器
    public  Base() {
        System.out.println("base()...");
    }
    public void test100(){
        System.out.println("test100");
    }
    protected void test200(){
        System.out.println("test200");
    }
    void test300(){
        System.out.println("test300");
    }
    private void test400(){
        System.out.println("test400");
    }
    public void calltest400(){
        test400();
    }

}
