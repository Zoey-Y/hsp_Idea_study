package com.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws01 {
    public static void main(String[] args) {

    }
    public void f1() throws FileNotFoundException,NullPointerException {//也可以写成Exception
        //创建一个文件流对象
        /*解析:
        *   1.这里的异常是FileNotFoundException 编译异常
        *   2.可使用t-c-f处理
        *   3.也可使用throws抛出异常到调用该方法的调用者
        *   4.throws关键字后可以抛出多个不同种类的异常*/
        FileInputStream fis = new FileInputStream("d://aa.txt");
    }
}
