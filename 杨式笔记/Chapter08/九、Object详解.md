# 九、Object详解(面试题)

## 一、Object的方法摘要：

* ##### equals(Object obj) ——>返回类型是boolean型(看看他的某个对象是否与此相等)
* ##### finalize() ——>返回类型是void
* ##### getClass() ——> 返回object运行时类
* ##### hashCode() ——> 返回对象的哈希码值
* ##### toString() ——> 返回该对象的字符串表示

### 1. ==方法：

* #### ==是比较运算符:既可以判断 (基本类型) 也可以判断 (引用类型)

* #### ==如果判断 (基本类型)，判断的是 (值 ) 是否相等

* #### ==如果判断 (引用类型)，判断的是 (地址)  是否相等

### 2.==的使用例子

~~~java
package com.Object;

public class Equals {
    public static void main(String[] args){
        int h = 9;
        A a = new A();
        A b = a;//将引用类型a赋给以A为类型的b
        A c = b;//将引用类型b赋给以A为类型的c
        System.out.println(a == c);//true
        /*B b1 = new B();
        b1 = a;*/
        //第二种写法：
        B b1 = a;
        System.out.println(b1 == a);//true

    }
}
class B{}
class A extends B{}


~~~

## 二、equals方法：

* ### equals：是Object类中的方法, (只能) 判断 (引用类型)、(判断两个对象是否相等）

* ### 默认判断的是  (地址)  是否相等，子类中往往重写该方法，用于判断内容是否相等（要判断值是否相同，必须重写一下equals方法）；例如：Integer,String

### 一、重写equals练习(懂得重写的含义，为啥重写作用是啥)

~~~java
package com.Object;

import com.Override.Excer01.Person;

/*判断两个Person对象的内容是否相等，
* 如果两个Person对象各个属性值都一样，则返回true，反之false*/
public class EqualsExcer01 {
    public static void main(String[] args) {
        //创建两个Person类，看看属性值一样时是怎样的
        Person person1 = new Person("Jasica", 22, '男');
        Person person2 = new Person("Jasica", 22, '男');
        System.out.println(person1.equals(person2));
        /*第一种情况：(没有在Person类中重写equals方法的情况)
         *   此时(用equals)默认比较的是两个对象的地址值,因此此时为不同地址，所以为false
         * 第二种情况:(在Person类中重写了一个equals方法的情况,此时就是判断两者对象是否相同)
         * */

    }

    static class Person {
        private String name;
        private int age;
        private char gender;

        public Person(String name, int age, char gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public char getGender() {
            return gender;
        }

        public void setGender(char gender) {
            this.gender = gender;
        }

        //重写一个Object 的equals方法使其能够比较对象的属性值
        public boolean equals(Object obj) {//因为重写函数名，参数都得一样
            //this是当前类Person1，Object是Person2
            if (this == obj) {//若俩对象相同， 则直接返回真
                return true;
            }
            //判断传进来的是不是Person对象
            if (obj instanceof Person) {//如果equals()方法传参进来的参数是Person才比较
                //向下转型(原因：为了获取传进来对象的属性值)
                Person p = (Person) obj;//让原本为Object父类对象转成Person子类对象以此获得传进来的对象属性值
                return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
            }
                return false;//没必要if..else
            }
        }
    }


~~~

### 二、练习2：

![image-20220922213540446](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220922213540446.png)。

### 三、练习3：

* #### <font color="blueasd">注意：字符的本质就是一个整数(所以char c = 12可以这样赋值)</font>.

![image-20220922214708936](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220922214708936.png)。

## 三、hashcode方法

* #### 介绍hashcode：返回该对象的哈希码值，提高哈希表的性能

* ### <font color = "bluesad">提高具有哈希结构的容器的效率</font>.

* ### <font color="bluesad">两个引用，如果指向的是同一个对象，则哈希值肯定一样</font>.（不是百分之百）

* ### <font color="bluesad">两个引用，如果指向不同对象，则哈希值是不一样的</font>.

* ### <font color="bluesad">哈希值主要是根据地址号来的，但不能完全将哈希值等于地址值</font>.

  

## 四、toString方法

* ### <font color = "bluesae">toString方法：默认返回：全类名(包名+类名) + @ + 哈希值的十六进制</font>.

* ### <font color = "bluesae">子类往往重写toString方法，用于返回对象的属性信息</font>.

* ### <font color="bluesae">当输出一个对象时，toString方法会被默认的调用</font>.

### toString方法介绍案例：

~~~java
package com.Object;

import com.sun.org.apache.xpath.internal.objects.XObject;

public class toString_ {
    public static void main(String[] args){
        /*toString的原码：
        1.getclass().getName() 是toString的全类名
        2.Integer.toHexString(hashCode) 将对象的hashCode值转换成16进制字符串
            public String toString() {
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
            }
        * */

        //没有重写时，使用toString的结果
        Monster monster = new Monster("妖怪01","巡山",1000);
        System.out.println(monster.toString());//调用toString由于没有重写，所以调用的就是父类(Object)的toString方法
                                              //此时Object的toString方法是将monster对象的hashCode的值转化成十六进制的值
                                              //重写之后输出的是对象的属性值
        System.out.println("看monster的hashCode值 = " + monster.hashCode());
        System.out.println(monster);//直接调用monster，等价于调用monster.toString()
    }
}
class Monster{
    private String name;
    private String job;
    private double sal;
    //重写toString方法，输出对象的属性值
    //使用快捷键即可:alt + insert -> toString
    @Override
    //重写后，一般是把对象的属性值输出，当然程序员也可以自己制定
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }
}


~~~



## 五、finalize方法

* #### <font color= "bluesaed">当垃圾回收器确定该对象不再有更多用处的时候，由对象的垃圾回收器调用finalize()方法 </font>.

### finalize方法介绍案例

~~~java
package com.Object;
/*
* 1.演示：当对象被回收时,系统自动调用该对象的finalize方法,
* 子类可以重写该方法,做一些释放资源的操作
* 2.什么时候被回收：当某个对象没有任何引用时，则jvm就认为这个对象是垃圾对象，
* 就会用垃圾回收机制销毁该对象,在销毁前会先调用finalize方法
* 3.垃圾回收机制的调用,是由系统来决定(即有自己的GC[是一个算法]),也可以通过System.gc()
* 主动触发垃圾回收机制
* (老韩说：”无聊的面试官会问，实际开发时几乎不用”)哈哈哈哈哈哈哈哈哈！
* 
* 总结:finalize方法是用于 让垃圾回收器调用，来回收(销毁)没有用的对象的*/
public class Finalize_ {
    public static void main(String[] args){
           Car GGBox = new Car("楼徐楼徐");
           GGBox = null;//此时GGBox啥也没了，没啥用
        /*1.GGBox对象就是一垃圾，垃圾回收器就会销毁对象,
        * 销毁前就会调用对象的finalize方法.(如果重写了就用重写的finalize方法,若非重写就用Object默认的finalize方法)
        * 2.程序员可以在finalize方法中写自己的业务逻辑(比如:
        * 释放资源; 数据库连接;或者打开文件..)
        * 3.如果程序员不重写finalize方法,那么就会调用Object类的finalize,
        * 即就是默认处理*/
        System.gc();//主动调用垃圾回收器
        System.out.println("运行结束..");
    }
}
class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }
    //重写finalize方法

    @Override
    protected void finalize() throws Throwable {
        /*super.finalize();*///默认情况下调的是父类的finalize方法
        System.out.println("释放了某些资源...");
    }
}
~~~

