package com.HomeWorkChapter08.Home10;
/*编写一个Doctor类(name,age,job,gender,sal)
 * 具有相应的setter和getter方法，五个参数的构造器，
 * 重写父类的equals(),
 * 方法：public boolean equals(Object obj),
 * 并判断测试类中创建的两个对象是否相等。(就是判断属性是否相等)
 * */
public class HomeWork10 {
    public static void main(String[] args){
        Doctor Alax = new Doctor("Alax",23,"医学博士",'男',12345);
        Doctor Alin = new Doctor("Alin", 22, "Programmer", '男', 100000);
        Doctor Alin2 = new Doctor("Alin", 22, "Programmer", '男', 100000);
        System.out.println(Alax.equals(Alin));//false
        System.out.println(Alin.equals(Alin2));//ture
    }
}
