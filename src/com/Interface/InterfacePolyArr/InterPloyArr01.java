package com.Interface.InterfacePolyArr;

public class InterPloyArr01 {
    public static void main(String[] args) {
        //接口有数组,数组可实例化(即new),但单纯的接口不能被实例化与抽象类一样
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone();
        usbs[1] = new Camera();

        //遍历数组
        for (int i = 0; i < usbs.length ; i++){
            usbs[i].work();//动态绑定机制 ,因为统一都有work()
            //和前面一样,我们任然需要进行类的向下转型
            /*解释instance：判断数组的运行类型是不是Phone*/
            if(usbs[i] instanceof Phone){
                //向下转型
                ((Phone) usbs[i]).call();//解释：将usbs[i]强转成 Phone,再‘ . ’调用专属于Phone的call方法
            }
        }
    }
}
interface Usb{
    void work();
}
interface Rsb{}
class Phone implements Usb,Rsb{
    public void call() {
        System.out.println("手机正在接听电话...");
    }

    @Override
    public void work() {
        System.out.println("手机正在工作...");
    }
}
class Camera implements Usb{
    @Override
    public void work() {
        System.out.println("相机正在工作...");
    }
}
