package com.HomeWorkChapter08.Home03;
/*题目: 编写老师的类
 *   要求：
 *       1.属性：姓名(name) 年龄(age) 职称(post) 基本工资(salary)
 *       2.方法：introduce(),实现一个教师的信息
 *       3.编写老师类的三个子类：a.教授类  b.副教授类 c.讲师类
 *         工资级别：教授:1.3w 副教授:1.2w  讲师类:1.1w
 *         三个子类内：都重写父类的introduce()
 *       4.定义并初始化一个老师的对象，调用业务方法，实现对象的基本信息的后台打印
 *  */
public class Teacher {
    public String name;
    public int age;
    public String post;//职称

    public Teacher(String name, int age, String post) {
        setName(name);
        setAge(age);
        setPost(post);
    }
    public String introduce(){//实现一个教师的信息
        return getName() + "\t老师的年龄为：" + getAge() +
                "\t教的是：" + getPost() ;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
