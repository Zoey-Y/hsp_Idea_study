package com.Abstract.DesignModule;

public abstract class AbTemplet {
    public abstract void job();//抽象方法：目的是为了获得不同子类相应的job功能
    //把计算时间的功能封装起来
    public void calculateTime(){
        long start = System.currentTimeMillis();//开始时间
        job();//在其中间位置调用job()
        long end = System.currentTimeMillis();//结束时间
        System.out.println("所用时间：" + (end - start));
    }
}
