# final

## 一、基本介绍

* #### final可以修饰 <font color="bluex">类、属性、方法 和 局部变量</font>.

### <font color="orangedsadfcxzv">final使用时机</font>:

#### 1.<font color="purple">当不希望被继承时，可以用final修饰</font>.

![image-20221121113348642](C:\Users\Alin\AppData\Roaming\Typora\typora-user-images\image-20221121113348642.png).

#### 2.<font color="purple">当不希望父类的某个方法被子类 覆盖 或 重写时，可以用final</font>.

![image-20221121113717033](C:\Users\Alin\AppData\Roaming\Typora\typora-user-images\image-20221121113717033.png).

#### 3.<font color="purple">当不希望 类的某个属性的值 被修改，可以用final</font>.

![image-20221121114334222](C:\Users\Alin\AppData\Roaming\Typora\typora-user-images\image-20221121114334222.png).

#### 4.<font color="purple">当不希望 某个局部变量 被修改，可以用final</font>.

![image-20221121115001157](C:\Users\Alin\AppData\Roaming\Typora\typora-user-images\image-20221121115001157.png).

## 二、final细节：

### Detail 01：

1. #### <font color="pdasd">final属性又叫常量,一般用 XX_XX_XX来命名(比如更刚刚写的TAX_RATE变量名)</font>.

2. #### <font color="pdasd">final的属性定义时，必须赋值，以后都不能再修改。</font>（赋值可在如下区域）

* ```java
  public final double TAX_RATE = 0.08;//声明之后直接初始化
  ```

* #### <font color="blueg">在构造器中</font>.

* #### <font color="blueg">在代码块中</font>.

![image-20221121220249775](C:\Users\Alin\AppData\Roaming\Typora\typora-user-images\image-20221121220249775.png).

3. #### <font color="pdasd">若final修饰的属性是 静态的，则初始化的位置<只能是</font>.

* #### <font color="blueg">定义时</font>.

* #### <font color="blueg">在静态代码块</font>.

* #### <font color="blueg">不能在构造器中赋值</font>.

![image-20221121221305596](C:\Users\Alin\AppData\Roaming\Typora\typora-user-images\image-20221121221305596.png).

* ##### 因为属性为static，在加载类的时候 会先 调用static属性,调用完static之后 再 调用构造器的，所以final的这个属性 没有被赋值。

4. #### <font color="pdasd">final 类 不可以继承，但可以 实例化对象</font>.

5. #### <font color="pdasd">若 类 不是 final类，但含有final方法，则该方法不能重写，但可以被继承</font>.

### Detail 02:

1. #### <font color="pdasd">一般来说,一个类已经是final的话，本类中的方法就不用再写final了,因为 类 没有机会被继承， 方法也没有机会被重写</font>.

2. ![image-20221121223037337](C:\Users\Alin\AppData\Roaming\Typora\typora-user-images\image-20221121223037337.png)。

3. #### <font color="pdasd">final不能修饰构造方法</font>.

4. #### <font color="pdasd">final 和static往往搭配使用,效率更高，（不会导致类加载），底层编译器做了优化处理</font>.

![image-20221121225159485](C:\Users\Alin\AppData\Roaming\Typora\typora-user-images\image-20221121225159485.png)。

5. #### <font color="pdasd">包装类(Integer,Double,Float,Boolean,都是final),String 也是final类,所以不能够被继承的</font>.

## Excercise

### Excerpts01：

```java
package com.final_.Final_Excer;
/*编写能够计算圆形的面积，圆周率为3.14
* 赋值的位置3个三个方式都写一下
* 1.属性声明时直接赋值
* 2.构造器赋值
* 3.在代码块中赋值*/
public class Excer01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("面积：" + circle.calArea());
    }
}
class Circle{
    private double radius;
    private final double PI ;//= 3.14;//声明时直接赋值

    public Circle(double radius) {
        this.radius = radius;
       //构造器赋值 PI = 3.14;
    }
    {
        PI = 3.14;//代码块赋值
    }

    public double calArea(){
        return PI * radius * radius;
    }
}
```



### Excer02：

![image-20221122112641936](C:\Users\Alin\AppData\Roaming\Typora\typora-user-images\image-20221122112641936.png)。
