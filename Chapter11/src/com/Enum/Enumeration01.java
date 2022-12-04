package com.Enum;
/*
 *@author 杨宗霖
 *@version 1.0
 */
/*引出枚举法:
* 例如:四个季节,只有春夏秋冬,不可能有其他情况
* 那么这种固定情况就可以用枚举法来限定.
* 特点:
* 1.季节的值是有限的几个值(spring,summer,autumn,winter)
* 2.只读,不需要修改
* 枚举属于一种特殊的类,里面只包含一组(有限的)(特定的)对象*/

public class Enumeration01 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
        System.out.println(Season.SUMMER);
        System.out.println(Season.WINTER);
        System.out.println(Season.SPRING);
    }
}
class Season{
    private String name;
    private String desc;
    /*枚举法的写法:
    * 1.将构造器私有化,目的防止,直接 new
    * 2.去掉set相关方法,防止属性被修改
    * 3.在Season类内部,直接创建固定的对象
    * 4.优化,可以再添加final,目的是可以防止static多次加载*/

    public static final Season SPRING = new Season("春天","温暖");
    public static final Season WINTER = new Season("冬天","寒冷");
    public static final Season AUTUMN = new Season("秋天","凉爽");
    public static final Season SUMMER = new Season("夏天","炎热");

    private Season(String name, String desc) {
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
