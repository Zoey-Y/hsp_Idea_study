package com.Interface.Inter01;
/*这里定义的接口相当于现实中人为规定的
接口大小哇，线路，性能等等的规范,
这样才能让接口与设备之间吻合顺利插入后正常使用*/
public interface UsbInterface {
    //规定接口相关方法
    public void start();
    public void stop();
    //以后会规定更多的方法
}
