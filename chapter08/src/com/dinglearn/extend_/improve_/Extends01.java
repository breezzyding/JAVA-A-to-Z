package com.dinglearn.extend_.improve_;

import com.dinglearn.extend_.Graduate;
import com.dinglearn.extend_.Pupil;

public class Extends01 {
    public static void main(String[] args) {
        com.dinglearn.extend_.Pupil pupil = new Pupil();
        pupil.name = "~银角大王~";
        pupil.age = 100;
        pupil.testing();
        pupil.setScore(95);
        pupil.showInfo();

        System.out.println("========");
        com.dinglearn.extend_.Graduate graduate = new Graduate();
        graduate.name = "~~金角大王~~";
        graduate.age = 220;
        graduate.testing();
        graduate.setScore(68);
        graduate.showInfo();
    }
}
