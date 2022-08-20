package com.stuHsp.extend_;

/*此类汇总Pupil类 和 Graduate类的打印*/
public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.age = 10;
        pupil.name = "小明";
        pupil.setScore(79);
        pupil.testing();
        pupil.info();

        System.out.println("=============");
        Graduate graduate = new Graduate();
        graduate.age = 20;
        graduate.name = "大明";
        graduate.setScore(100);
        graduate.testing();
        graduate.info();
    }
}
