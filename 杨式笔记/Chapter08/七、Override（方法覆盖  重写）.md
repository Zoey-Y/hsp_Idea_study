# 七、Override（方法覆盖 \ 重写）

## 一、Override基本介绍

* ### <font color = "bluesda">Override（方法覆盖 \ 重写）指的是子类 内有方法与父类或者更上级的存在的方法名、返回类型、参数一样，那么就称这种情况为 子类Override父类(或者更上一级的类)</font>.

## 二、覆盖的例子

~~~java
package com.Override;

public class Animal {//父类
    public void Cry() {
        System.out.println("动物的哭声...");
    }
}

~~~

~~~java
package com.Override;

public class Dog extends Animal{//子类
    //1.此时这个Cry方法与父类的Cry方法书写形式(名称、返回类型、参数)一样,
    //2.所有就说这个Dog类的Cry方法覆盖了父类的Cry方法
    public void Cry(){
        //如果写成Cry(String name)就不一样了，就没有重写关系了
        System.out.println("狗的哭声");
    }
}

~~~

~~~java
package com.Override;

public class Override01 {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.Cry();
    }
}

~~~



## 三、Detail

### 细节一：

~~~java
package com.Override;

public class Animal {//父类
    public void Cry() {
        System.out.println("动物的哭声...");
    }
}

~~~

~~~java
package com.Override;

public class Dog extends Animal{//子类
     /*细节一：(子类和父类的参数和方法名要完全一样才满足覆盖)
         1.此时这个Cry方法与父类的Cry方法书写形式(名称、返回类型、参数)一样,
         2.所以就说这个Dog类的Cry方法覆盖了父类的Cry方法
     */
    public void Cry(){
        //如果写成Cry(String name)就不一样了，就没有重写关系了
        System.out.println("狗的哭声");
    }
}
~~~

### 细节二：

~~~java
package com.Override;

public class Animal {
    public Object m1(){
        return null;
    }
    
   /* public String m2(){
        return null;
    }*/
}

~~~

~~~java
package com.Override;

public class Dog extends Animal{
    public String m1(){//此时也满足重写的条件
         /*细节二：
        * 1.子类 和 父类 方法返回的类型一样,则满足重写
        * 2.或者 父类 返回的类型是Object 子类是 String，
        	则也满足重写*/
        return null;
    }
    
    //若返回类型反过来
   /* public Object m2(){
        returm null;
    }
    则不行,会报错
    
    解释:因为Object的子类里有String这个返回类型所有可以*/
}
~~~

### 细节三：

~~~java
package com.Override;

public class Animal {//父类
    /*public A m3(){
    	return null;
    }*/
    //第三部分
    public B m3(){
        return null;
    }
}

~~~

~~~java
package com.Override;

public class Dog extends Animal{//子类
    //这样可以
    /*public A m3(){//如果父类的返回类型是B就不行因为父类只调用了B没有A的部分
        return null;
    }*/
    //这样可以
    /*public B m3(){//因为A被B继承了，父类只是调用了A类
        return null;
    }*/
}
//第三部分：同理当创建一个类
class A{
    
}
class B extends A{
    
}
~~~

### 细节四：

~~~java
package com.Override;

public class Animal {//父类
    //第四部分
   /* public String m4(){
        return null;
    }*/
      //但子类可以扩大父类的访问权限
    private String m4(){
        return  null;
    }
}

~~~

~~~java
package com.Override;

public class Dog extends Animal{//子类
    //第四部分
    /*细节四：子类的方法不能缩小父类的访问权限
    * private String m4(){...}
    */
    //细节四:但子类可以扩大父类的访问权限
    public String m4(){
        return  null;
    }
}

~~~

## 四、方法重写和方法重载的比较

|                     名称                      |              发生范围               |                方法名                 |                           形参列表                           |                           返回类型                           |                          访问修饰符                          |
| :-------------------------------------------: | :---------------------------------: | :-----------------------------------: | :----------------------------------------------------------: | :----------------------------------------------------------: | :----------------------------------------------------------: |
| <font color="bluesdf">重载(overload)</font>.  |  <font color="Orange">本类</font>.  | <font color="Orange">必须相同</font>. | <font color="Orange">方法类型、个数、顺序至少一个不同</font>. |             <font color="Orange">不影响</font>.              |             <font color="Orange">不影响</font>.              |
| <font color="bluesdf">重写 (override)</font>. | <font color="Orange">父子类</font>. | <font color="Orange">必须相同</font>. |            <font color="Orange">必须相同</font>.             | <font color="Orange">子类与父类返回类型要么一样，要么子类的返回类型继承了父类的返回类型</font>. | <font color="Orange">子类的访问修饰符不能缩小了父类的访问修饰符，但是子类可放大父类的访问修饰符</font>. |

## 四、练习：

* #### 一、综合封装、继承（super的使用、重写、访问修饰符的使用）

### 父类：



~~~java
package com.Override.Excer01;
/*编写一个Person类,包括属性/private(name、age),
 * 构造器、方法say(返回自我介绍的字符串)*/
public class Person {
    //属性
    private String name;
    private int age;
    //父类构造器
    public Person(String name,int age){
        setAge(age);
        setName(name);
    }
    public void say(){//只输出父类的say()
        System.out.println("name: " + getName() + "  age: " + getAge());
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
}
~~~

### 子类：

~~~java
package com.Override.Excer01;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/*编写一个Student类，继承Person类，增加id、score属性/private，
* 以及构造器，定义say方法(返回自我介绍的信息)*/
public class Student extends Person{
    private int id;
    private int score;
    //构造体初始化属性，别忘记传参父类的属性，因为开头要super到父类对应的构造器
    public Student(int id,int score,String name,int age){
        super(name,age);
        setId(id);
        setScore(score);
    }
    /*子类的say方法目的是要输出子类的个人信息和父类的个人信息
      因此在方法的首行必须标明super在找父类的哪个输出方法*/
    public void say(){//输出父子类的say()
        super.say();//复用
        System.out.println("id: " + getId() + "   score: " + getScore());
    }
//由于属性private 所有需要 get(返回属性的作用) & set,set可以设置访问属性门槛(增加业务逻辑维护功能的可用性)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}

~~~

### 主类：

~~~java
package com.Override.Excer01;
/*在main中，分别创建Person 和 Student对象，
* 调用say方法输出自我介绍*/
public class Excer_01 {
    public static void main(String[] args){
        Person person = new Person("yzl",22);
        person.say();
        System.out.println("=============================");
        Student student = new Student(12342312,100,"lzy",23);
        student.say();
    }
}

~~~

