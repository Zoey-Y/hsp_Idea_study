package com.EnumExcer;
/*1.声明Week枚举类,其中包含周一到周日的定义
* MONDAY,TUESDAY,WEDENSAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
* 2.使用values返回枚举对象的所有数组,并遍历*/
public class Excer01 {
    public static void main(String[] args) {
        Week[] values = Week.values();
        for (Week day : values){
            System.out.println(day);
        }
    }
}
enum Week{
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");

    private String day;

    private Week(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    @Override
    public String toString() {
        return day ;
    }
}