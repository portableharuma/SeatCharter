package com.haruma.seatcharter.seatcharter;

import com.haruma.seatcharter.seatchartersystem.ClassID;

public class Student {
    private ClassID classID;

    private int groupWorkability;
    private int assist;

    private String name;

    public Student(int groupWorkability, int assist, String name) {
        classID = new ClassID("StudentClass");

        this.assist = assist;
        this.name = name;
        this.groupWorkability = groupWorkability;
    }
    public int getGroupWorkability() {
        return groupWorkability;
    }
    public int getAssist() {
        return assist;
    }
    public void printName() {
        System.out.println(name);
    }
}
