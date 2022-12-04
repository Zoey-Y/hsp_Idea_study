package com.HomeWork.Home06;
/*1.属性:temperature
* 2.这内有空调Air类:
*   有吹风功能flow
*   Air有监视车内温度的功能(若超过40度则吹冷气,若低于0度则吹暖气)
*   若在这之间则关掉空调.
*   实例化具有不同温度的Car对象,
*   调用空调flow方法,测试空调吹的风是否正确*/
public class Car {
    private double temperature;//车室内温度

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air{
        public void flow(){//吹风功能
            if (temperature > 40){
                System.out.println("空调吹冷气");
            }else if(temperature < 0){
                System.out.println("空调吹暖气");
            }else{
                System.out.println("空调关闭");
            }
        }
    }
    public Air getAir(){
        return new Air();
    }
}
