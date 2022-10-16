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
public class HomeWork03 {
    public static void main(String[] args){
        Teacher[] teacher = new Teacher[3];
        teacher[0] = new Professor("张三",22,"数学");
        teacher[1] = new AssoProfessor("里尔",33,"数据结构");
        teacher[2] = new Instructor("刘武",42,"政治");
        System.out.println(teacher[0].introduce());
        System.out.println(teacher[1].introduce());
        System.out.println(teacher[2].introduce());
    }
}

