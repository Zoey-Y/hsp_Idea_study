package com.stuHsp.encapsulationExcer;

import jdk.nashorn.internal.ir.CallNode;

/*题目:制作一个类，其中封装着属性,有私有的，有公共的
 * 1.现在说年龄，工资为隐私不可随意改变,
 * 若要进行内部改变 则需验证合理性,不合理的给出合理的默认值给予参考
 * 2.名字可为公共的，名字长度在(2~6)之间*/
public class encap01 {
    public static void main(String[] args) {
        /*我们不可以直接调用age 和 salary
         * 例如这样:Person person = new Person();
         *           person.age;
         *           person.salary;
         * 这样不行.
         * 正确的写法如正文.*/
        Person person = new Person();
        person.setName("Gdyasdfasd");
        person.setAge(22);
        person.setSalary(8000);
        System.out.println("姓名: " + person.getName());
        System.out.println(person.info());

        System.out.println("========joJo的构造器身份验证===========");
        //如果用构造器进行四种访问修饰符的赋值，赋值时必须经过验证的业务逻辑的方法
        Person joJo = new Person("JoJo", 2000,50000 );
        System.out.println(joJo.info());
    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    //先定义无参构造器,使其set 和 get 方法保持有效,不会被接下来的有参构造器取代
    //快捷键Alt + ins
    public Person() {
    }
    //接下来弄有参构造器


    public Person(String name, int age, double salary) {
       /*this.name = name;
        this.age = age;
        this.salary = salary;
        这样写的弊端在于绕开了private的验证的业务逻辑,因此一个构造器便破解了private的验证
        正确如下:*/
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    //直接手写set 和 get很慢,快捷键Alt + insert (ins),找到setter 和 getter
    //set方法是制作功能,验证合理性 和 安全性等
    //get方法只是负责返回对应结果的
    public String getName() {
        return name;
    }

    public void setName(String name) {//用方法来间接的对属性进行赋值，改值
        //此处可以完善业务逻辑
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("输入的名字有误,名字长度要在(2~6)之间,为你默认名字为: ");
            this.name = "诸葛GG";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("你输入的年龄不正常,为你默认的年龄为: ");
            this.age = 18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("工资输入有误,给予你默认工资值为: ");
            this.salary = 3000;
        }
    }

    public String info() {
        return "信息为：\n" + "姓名: " + this.name + " 年龄: " + this.age + " 工资: " + this.salary;
    }
}
