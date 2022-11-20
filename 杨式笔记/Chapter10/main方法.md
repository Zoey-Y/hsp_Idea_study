# main方法

## 一、main方法的语法

* #### public static void main(String[] args){}

* #### <font color="red"> main()是虚拟机调用的 (基本常识)</font>.

1. #### <font color="orange"> java虚拟机调用类的main()，所以该方法的访问权限必须是public</font>.

2. #### <font color="orange"> java虚拟机在执行main()时不必创建对象,所以该方法必须是static</font>.

3. #### <font color="orange">该方法接收String类型的数组参数,该数组中保存执行java命令时传递给所运行的类的参数</font>.

4. #### <font color="orangesd"> +执行的程序 + 你输入的参数 ------->就能执行你输入的语句</font>.

![image-20221117165251629](C:\Users\Alin\AppData\Roaming\Typora\typora-user-images\image-20221117165251629.png).

### 1.演示的代码：

![image-20221117165331738](C:\Users\Alin\AppData\Roaming\Typora\typora-user-images\image-20221117165331738.png)。

### 2.执行的过程：

![image-20221117165507803](C:\Users\Alin\AppData\Roaming\Typora\typora-user-images\image-20221117165507803.png)。

## 二、main方法与static注意事项

```java
package com.Static.Excer;

public class Test {
    public static void main(String[] args) {
        new Test().count();//9
        new Test().count();//10
        System.out.println(Test.count);//有调用了一次11
    }
    static int count = 9;
    public void count(){//非静态变量可以访问所有成员
        System.out.println("count = " + (count++));
    }
}
```

* ##### idea中main方法传值给args[]，操作如下：Program argument处添加

![image-20221117172033254](C:\Users\Alin\AppData\Roaming\Typora\typora-user-images\image-20221117172033254.png)。