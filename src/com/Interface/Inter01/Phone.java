package com.Interface.Inter01;

//Phone类为了插上usbInterface接口 要规定/声明方法
//解读1.Phone类需要实现 UsbInterface接口
public class Phone implements UsbInterface {//手机实现接口
    @Override
    public void start() {
        System.out.println("手机开始工作...");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作...");
    }
}
