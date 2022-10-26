package com.HomeWorkChapter08.Home11;
/*现有一个Person类,里面有run(),eat(),
 * Student继承了Person类,并重写了run(),
 * 自定义了study().
 * 试写出对象向上转型 和 向下转型的代码,
 * 并写出各自都可以调用哪些方法 和 写出方法输出什么*/
public class HomeWork11 {
    public static void main(String[] args){
        //向上转型:父类的引用指向了子类对象
        Person person = new Student();
        /*person 可以调用【（Person和Students的）run()】、eat()、study()*/
        person.eat();//Person eat
        person.run();//student.run
        ((Student) person).study();//student study...

        //向下转型子类的引用强行转指向父类，父类要强制类型转换
        Student student = (Student) person;
        /*student 可以调用[student的run()]、eat()、study()*/
        student.run();//student run
        student.study();//student study...
        student.eat();//Person eat
    }
}
