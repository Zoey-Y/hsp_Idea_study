package com.Poly.PolyDetail;

public class PolyDetail03 {
    public static void main(String[] args){
        //编译类型是 BB，运行类型也是BB
        BB bb = new BB();
        //instanceof比较操作符,用于判断对象是否是XX类型 或者 是否为 XX类型的子类型
        System.out.println(bb instanceof BB);//bb是否是BB的类型
                                             //bb是运行类型BB的类型
        System.out.println(bb instanceof AA);//bb是否是AA的类型发子类型
                                             //bb是运行类型AA的子类型

        //AA是编译类型，BB是运行类型
        AA aa = new BB();
        System.out.println(aa instanceof AA);//aa是否是AA的类型
                                             //答：aa是运行类型AA的子类型
        System.out.println(aa instanceof BB);//aa是否是BB的类型或子类型
                                             //aa是运行类型BB的类型

        Object obj = new Object();
        System.out.println(obj instanceof AA);//问:obj是运行类型AA的类型吗？是子类型吗？
                                              //答：obj都做AA的爸爸了肯定不是运行类型AA的子类型，也不是运行类型AA。
                                              //所以是false

        //总结：对象 + instanceof 某对象的类型
        //以上语法的作用就是用来判断 对象(引用名) 是否为 某对象类型的类型 或者 某对象类的子类型
        //是就输出true 不是就 输出false
        //注意判断的是与运行类型进行判断
    }

}
class AA {}
class BB extends AA{}