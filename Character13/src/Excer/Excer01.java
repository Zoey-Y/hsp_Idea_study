package Excer;

public class Excer01 {
    public static void main(String[] args) {
        /*以下输出结果相同吗?分别是什么*/
        /*三元运算符,?前真取第一个,
        又因为三元算符看作一个整体,
        里头的类型取最大的那个这里最大的类型是的是Double
        所以虽然真取Integer但是最终结果按照Double来衡量
        结果为:1.0*/
        Object obj1 = true ? new Character('a') : new Double(2.0);
        System.out.println(obj1);//Integer的话:1.0,Character的话:97.0
    }
}
