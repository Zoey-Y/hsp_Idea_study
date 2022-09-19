# 六、super关键字详解

## 一、super关键字用法 和 注意事项

~~~java
package com.Super_;

public class A {//父类
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public void test100() {
    }

    protected void test200() {
    }

    void test300() {
    }

    private void test400() {
    }
}

~~~

~~~java
package com.Super_;

//super代表的父类的引用，用于访问父类的属性、方法、构造器
public class B extends A {
    public void hi() {
        //访问父类属性，但不能访问父类的private属性 ——>super.属性名
        System.out.println(super.n1 + super.n2 + super.n3); //n4为private
    }

    public void method() {
        //访问父类的方法，不能访问父类的private方法 ——>super.方法名(参数列表)
        super.test100();
        super.test200();
        super.test300();
        //test400为private
    }
    //访问父类的构造器：super(参数列表);只能放在构造器的第一句，只能出现一句
    public B() {
        //调用父类的构造器只能在子类的构造器里调用
        super();
    }
}

~~~

~~~java
package com.Super_;

public class Super01 {
    public static void main(String[] args){
        B b = new B();
        b.method();
    }
}

~~~

## 二、superDetail

###  细节一：

* ## <font color="oaage">调用父类的构造器好处就是(分工明确，父类属性有父类初始化、子类属性由子类初始化)</font>.

### 细节二：

* ## <font color="oaage">当子类中有和父类中的成员(属性和方法)重名时，为了访问父类的成员，必须通过super。如果没有重名，使用super、this、直接访问是一样的效果</font>.

A父类：

![image-20220824133601193](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220824133601193.png)。

B子类：

![image-20220824134420984](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220824134420984.png).



结果运行:

![image-20220824133648714](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220824133648714.png)

二、访问属性也跟上面访问方法一样

![image-20220824163516781](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220824163516781.png)。

### 细节三：

* ## <font color="oaage">super的访问不限于直接父类,父类找不到还会往上找直到找到为止，若还是找不到就会报错,当然也需要遵守访问权限的规则</font>

## 三、super 和 this 的比较

![image-20220826184645336](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220826184645336.png)。