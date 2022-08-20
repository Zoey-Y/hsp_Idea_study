package com.stuHsp.extend_.impove_;

import com.stuHsp.extend_.Graduate;
import com.stuHsp.extend_.Pupil;

public class Extends01 {
    public static void main(String[] args){
        com.stuHsp.extend_.Pupil pupil = new Pupil();
        pupil.age = 10;
        pupil.name = "小明~";
        pupil.setScore(79);
        pupil.testing();
        pupil.info();

        System.out.println("=============");
        com.stuHsp.extend_.Graduate graduate = new Graduate();
        graduate.age = 30;
        graduate.name = "大明~";
        graduate.setScore(110);
        graduate.testing();
        graduate.info();
    }
}
