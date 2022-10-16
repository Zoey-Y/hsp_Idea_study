package com.HomeWorkChapter08.Home03;
/*      3.编写老师类的三个子类：a.教授类  b.副教授类 c.讲师类
 *         工资级别：教授:1.3w 副教授:1.2w  讲师类:1.1w
 *         三个子类内：都重写父类的introduce()
 *       4.定义并初始化一个老师的对象，调用业务方法，实现对象的基本信息的后台打印*/
public class Professor extends Teacher{
    private String salary = "1.3w";
    //继承类要写上父类的任意构造器
    public Professor(String name, int age, String post) {
        super(name, age, post);//引用父类的属性,作为子类的属性,并要写在开头
        setSalary(salary);
    }
    @Override
    public String introduce() {
        return super.introduce() + "\t教授工资为：" + getSalary();
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
