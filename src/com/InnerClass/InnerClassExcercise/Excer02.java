package com.InnerClass.InnerClassExcercise;
/*匿名内部类的练习
* 1.有一个铃声接口Bell,里面有一个ring方法
* 2.有一个手机类CellPhone,具有闹钟功能alarmClock,
* 参数就是Bell类型
* 3.测试手机类的闹钟功能,通过匿名内部类作为参数对象,打印:懒猪起床了
* 4.再传入另外一个匿名内部类(对象),打印:伙伴上课了
* */
public class Excer02 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("伙伴上课了");
            }
        });//括号里的内容以匿名内部类作为对象,并且书写好要实现的一次性内容

    }
}

//接口Bell
interface Bell{
    void ring();
}
class CellPhone{
    public void alarmclock(Bell bell){
        bell.ring();
    }
}
