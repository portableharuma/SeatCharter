package com.haruma.seatcharter.seatcharter;

import com.haruma.seatcharter.seatchartersystem.ClassID;

import java.util.ArrayList;

public class Table {
    private ClassID classID;
    private ArrayList<Student> students;
    private int numOfSeats;
    private boolean teacherMonitored;
    private boolean visionFriendly;

    private int number;

    public Table(int numOfSeats, boolean teacherMonitored, boolean visionFriendly, int number) {
        classID = new ClassID("TableClass");
        this.numOfSeats = numOfSeats;
        this.teacherMonitored = teacherMonitored;
        this.visionFriendly = visionFriendly;
        this.number = number;
        students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        if (students.size() < numOfSeats) {
            students.add(student);
        }
    }
    public void addPair(Pair pair) {
        for (Student student : pair) {
            if (students.size() <= numOfSeats) {
                students.add(student);
            }
        }
    }
    public int getNumOfSeats() {
        return numOfSeats;
    }
    public int getRemainingSeats() {
        return numOfSeats - students.size();
    }
    public boolean returnIfEvenSeats() {
        return (getNumOfSeats() % 2 == 0) ? true : false;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public boolean isTeacherMonitored() {
        return teacherMonitored;
    }
    public boolean isVisionFriendly() {
        return visionFriendly;
    }
    public int getNumber() {
        return number;
    }
    public void printTestResults() {
        for (Student student : students) {
            student.printName();
        }
        System.out.println(number + "- " + students);
    }
}
