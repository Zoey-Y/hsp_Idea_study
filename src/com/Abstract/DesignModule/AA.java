package com.Abstract.DesignModule;
//统计该项目执行速度
public class AA extends AbTemplet{//继承
    public void job(){//重写(实现了AbTemplet的job方法)
        long num = 0;
        for (long i = 0;i <= 80000000;i++ ){
            num += i;
        }

    }
}
