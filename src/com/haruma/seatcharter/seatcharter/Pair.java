package com.haruma.seatcharter.seatcharter;

import java.util.ArrayList;

public class Pair extends ArrayList<Student> {
    private Student student;
    private Student student1;
    private int assist;

    public Pair(Student student, Student student1, int assist) {
        this.student = student;
        this.student1 = student1;
        this.assist = assist;
        this.add(student);
        this.add(student1);
    }
    public ArrayList<Student> getPair() {
        return this;
    }
    public int getAssist() {
        return assist;
    }
}
