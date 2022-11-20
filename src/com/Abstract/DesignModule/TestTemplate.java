package com.Abstract.DesignModule;

public class TestTemplate {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.calculateTime();//AA没有calculateTime(),由于继承会到父类找的
    }
}
