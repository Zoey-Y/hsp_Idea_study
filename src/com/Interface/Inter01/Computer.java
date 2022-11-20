package com.Interface.Inter01;

public class Computer {
    /*由于手机 和 相机都实现了接口功能
    * work入参调用接口类相当于
    * Computer可以识别Phone 和 Camera了*/
    public void work(UsbInterface usbInterface){
        //接下来调方法
        usbInterface.start();
        usbInterface.stop();
    }
}
