package com.customException;
/*自定义异常案例:
*  1.接受一个Person对象年龄
*  2.要求:年龄范围在:18~120之间
* 3.不符合年龄范围标准的自定义一个异常
* (是继承RuntimeException的)*/
public class CustomException01 {
    public static void main(String[] args){/*默认了一个throws AgeException*/
        int age = 150;
        //要求年龄范围在:18~120之间否则抛出异常
        if (!(age >= 18 && age <= 120)){
            throw new AgeException("年龄不在反包围内");
        }
        System.out.println("年龄为:"+ age);
    }
}
//自定义一个异常
class AgeException extends RuntimeException{
    public AgeException(String message){//构造器
        super(message);
    }
}
/*解析:
* 1.一般我们都是用运行时异常
* 2.因为拥有默认异常处理机制,比较方便*/