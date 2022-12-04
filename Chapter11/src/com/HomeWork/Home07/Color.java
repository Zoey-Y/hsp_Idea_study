package com.HomeWork.Home07;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

/*1.有三个属性：redValue，greenValue，blueValue
 * 2.创建构造方法，参数包括这三个属性
 * 3.每个枚举值都要给这三个属性赋值，
 * 三个属性对应的值分别是：
 * red：255,0,0 blue：0,0,255 black: 0,0,0 yellow: 255,255,0 green:0,255,0
 * 4.定义接口，里面有show()，要求Color实现接口
 * 5.show()显示三个属性值
 * 9.将枚举对象在switch语句中匹配使用*/
public enum Color implements print {
    /*写法等价于public static final Color RED = new Color(255, 0, 0);
    * 此写法是: 类为非enum时使用 */
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0),
    YELLOW(255, 255, 0),
     GREEN(0, 255, 0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    private Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }


    public int getRedValue() {
        return redValue;
    }

    public int getGreenValue() {
        return greenValue;
    }

    public int getBlueValue() {
        return blueValue;
    }

    @Override
    public void show() {
        System.out.println("属性值：" +
                getRedValue() + "," +
                getGreenValue() + "," +
                getBlueValue());
    }
}
