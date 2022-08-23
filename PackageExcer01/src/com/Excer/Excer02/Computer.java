package com.Excer.Excer02;

import sun.plugin2.gluegen.runtime.CPU;

import java.util.Set;

/*
 * 1.编写一个Computer类,包含CPU、内存、硬盘等属性，getDetail方法用于返回Computer
 * 2.编写PC子类，继承Computer类，添加特有属性(品牌brand)
 * 3.编写NotePad子类，继承Computer类，添加特有属性(颜色color)
 * 4.编写Test类，在main方法中创建PC和NotePad对象，
 *   分别给对象中特有的属性赋值，以及从Computer类继承的属性赋值，并使用方法并打印输出信息
 *   */
public class Computer {
    private String CPU;
    private int remember;
    private int disk;

    public Computer(String CPU, int remember, int disk) {
        setCPU(CPU);
        setRemember(remember);
        setDisk(disk);
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getRemember() {
        return remember;
    }

    public void setRemember(int remember) {
        this.remember = remember;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

}
