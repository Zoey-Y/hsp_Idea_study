package com.Enum;

/*
 *@author 杨宗霖
 *@version 1.0
 */public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
        System.out.println(Season2.AUTUMN);
        System.out.println(Season2.SUMMER);
        System.out.println(Season2.WINTER);

    }
}
//实现enum关键字
/*步骤:
1.使用enum关键字 代替 class
2.public static final (修饰符部分)
    Season (类型部分)
    SPRING (对象名部分) = new Season("春天","温暖");
直接代替成(两者等价)
SPRING("春天","温暖")
3.若有多个对象,使用 逗号 隔开即可
4.枚举对象必须写在枚举类的行首
5.若用无参构造器创建常量对象,则可以省略()
*/

enum Season2{//1.使用enum关键字 代替 class
    //要求将常量对象写在最前面
    SPRING("春天","温暖"),
    WINTER("冬天","寒冷"),
    AUTUMN("秋天","凉爽"),
    SUMMER("夏天","炎热");
    private String name;
    private String desc;

 /*   public static final Season SPRING = new Season("春天","温暖");
    public static final Season WINTER = new Season("冬天","寒冷");
    public static final Season AUTUMN = new Season("秋天","凉爽");
    public static final Season SUMMER = new Season("夏天","炎热");*/



    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }



    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
