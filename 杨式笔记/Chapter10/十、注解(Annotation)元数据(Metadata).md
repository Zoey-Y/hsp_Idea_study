# 十、注解(Annotation)/元数据(Metadata)

## 一、介绍:

* #### Annotation使用时要在前面增加一个@符号,并把Annotation当成符号使用,用于修饰它支持的程序元素

* #### <font color="orange">三个基本元素Annotation</font>:

1. #### @Override:该注解只能用于方法,比如重写父类方法

2. #### @Deprecated:用于表示某些已经过失的程序元素(类,方法..)

3. #### @SuppressWarnings:抑制编译器警告(Suppress镇压)





### @Override:

```JAVA
package com.Annotation;

public class Override_ {
    public static void main(String[] args) {

    }
}
class Father{
    public void fly(){
        System.out.println("father fly..");
    }
}
class son extends Father{
    /*解析:
    * 1.@Override 注解放在fly()上方,表示子类的fly方法重写了父类的fly方法
    * 2.这里若没有写 @Override 还是重写了父类fly()
    * 3.若写了@Override注解,编译器会检查方法是否重写了父类的方法,
    * 若的确重写了则编译通过,若没有重新,则编译错误*/
    @Override
    public void fly() {
        System.out.println("son fly...");
    }
}
```

![image-20221203121008573](C:\Users\Alin\AppData\Roaming\Typora\typora-user-images\image-20221203121008573.png).![image-20221203121502584](C:\Users\Alin\AppData\Roaming\Typora\typora-user-images\image-20221203121502584.png).



### @Deprecated:

![image-20221203131633130](C:\Users\Alin\AppData\Roaming\Typora\typora-user-images\image-20221203131633130.png).

![image-20221203131812233](C:\Users\Alin\AppData\Roaming\Typora\typora-user-images\image-20221203131812233.png).

### @SuppressWarnings:

![image-20221203133317761](C:\Users\Alin\AppData\Roaming\Typora\typora-user-images\image-20221203133317761.png).

```java
package com.Annotation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
public class SuppressWarnings_ {
    /*解析:
    * 1.若不希望看到警告可以加@SuppressWarnings来抑制警告信息
    * 2.在{""}中写入你希望抑制的警告
    * 3. @SuppressWarnings({"all"})的作用范围和其放置的位置有关*/
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //内容为集合:后面会讲
        List list = new ArrayList();
        list.add("");
        list.add("");
        list.add("");
        int i;
        System.out.println(list.get(1));
    }
}
```





## 二、JDK元注解(了解)

![image-20221203133912217](C:\Users\Alin\AppData\Roaming\Typora\typora-user-images\image-20221203133912217.png).

![image-20221203134540812](C:\Users\Alin\AppData\Roaming\Typora\typora-user-images\image-20221203134540812.png).