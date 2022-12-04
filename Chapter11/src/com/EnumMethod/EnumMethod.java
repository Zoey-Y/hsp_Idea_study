package com.EnumMethod;
/*
 *@author 杨宗霖
 *@version 1.0
 */
public class EnumMethod {
    public static void main(String[] args) {
        //使用Season2 枚举类来演示各种Enum方法
        Season2 autumn = Season2.AUTUMN;
        System.out.println(autumn);
        //输出枚举对象的名字
        System.out.println(autumn.name());
        //ordinal(),输出的是枚举对象的编号
        System.out.println(autumn.ordinal());
        //从反编译可以看出 values方法(隐藏的),返回Season2[]
        //含有定义的所有枚举对象
        Season2[] values = Season2.values();
        //强力for循环
        /*eg:
        int[] a = {1,2,3}
        for(int i : a){
              System.out.println(a);
        }*/
        for(Season2 season2 : values){
            System.out.println(season2);
        }

        //valueof将字符串转换成枚举对象,要求字符串必须为已有对象,否则报异常
        /*流程:
        * 1.根据你输入的"AUTUNM" 到 Season2的枚举对象去查找
        * 2.若找到了,则返回,若找不到则报错
        * */
        Season2 autumn1 = Season2.valueOf("AUTUMN");//输入的字符串应该在枚举数组内存在对应的对象,否则报错
        System.out.println("autumn1 = " + autumn1);
        System.out.println(autumn == autumn1);

        //compareTo:比较两个枚举常量,比较的就是编号
        /*解析:
        * 1.Season2.AUTUMN 的编号与 Season2.SUMMER的编号进行比较
        * 2.输出的结果是 前一个枚举对象的编号 - 后面的枚举对象编号*/
        System.out.println(Season2.AUTUMN.compareTo(Season2.SUMMER));
    }
}
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
