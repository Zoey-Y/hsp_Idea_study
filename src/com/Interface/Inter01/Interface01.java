package com.Interface.Inter01;

public class Interface01 {
    public static void main(String[] args) {
        //创建手机和相机
        Camera camera = new Camera();
        Phone phone = new Phone();
        //创建计算机
        Computer computer = new Computer();
        computer.work(phone);//把手机接入到计算机
        computer.work(camera);
    }
}
