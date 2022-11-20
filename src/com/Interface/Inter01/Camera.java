package com.Interface.Inter01;

//与手机同理
//实现接口 本质：接口方法(此时的接口方法是start()、stop()来自与UsbIntrface)的实现
public class Camera implements UsbInterface {//照相机实现接口
    @Override
    public void start() {
        System.out.println("相机开始工作...");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作...");
    }
}
