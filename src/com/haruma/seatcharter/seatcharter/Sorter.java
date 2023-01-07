package com.haruma.seatcharter.seatcharter;

import com.haruma.seatcharter.seatchartersystem.ClassID;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Properties;

public class Sorter {
    private ClassID classID;
    private ArrayList<Table> tables;
    private ArrayList<Table> usedTables;
    private ArrayList<Student> students;
    private ArrayList<Student> usedStudents;
    private ArrayList<Pair> pairs;
    private ArrayList<Pair> usedPairs;

    private ArrayList<Table> oddTables;

    public static final int TEACHERMONITORIZATIONREQ = 2;
    public static final int VISIONAIDREQ = 1;
    public static final int NOREQ = 0;

    public Sorter(ArrayList<Table> tables, ArrayList<Student> students) {
        classID = new ClassID("SorterClass");
        this.tables = tables;
        this.students = students;

        pairs = new ArrayList<>();
        oddTables = new ArrayList<>();
        usedStudents = new ArrayList<>();
        usedTables = new ArrayList<>();
        usedPairs = new ArrayList<>();

        Collections.shuffle(students);
    }

    public ArrayList<Table> basicSort() {
        //checking for odd tables
        for (Table table : tables) {
            if (!table.returnIfEvenSeats()) {
                oddTables.add(table);
            }
        }
        //fixing odd tables to even ones
        int i = 0;
        for (Table table : oddTables) {
            table.addStudent(students.get(i));
            students.remove(students.get(i));
            usedStudents.add(students.get(i));
            oddTables.remove(table);
            i++;
        }
        int j = 0;
        int req;

        while (!(usedStudents.size() == students.size())) {
            for (Student student : students) {
                if (!usedStudents.contains(student)) {
                    for (Student student1 : students) {
                        if (!usedStudents.contains(student1)) {
                            if (student1 != student) {
                                if (student.getAssist() > student1.getAssist()) {
                                    req = student.getAssist();
                                } else {
                                    req = student1.getAssist();
                                }
                                if (j == 0) {
                                    if (student.getGroupWorkability() + student1.getGroupWorkability() == 4) {
                                        pairs.add(new Pair(student, student1, req));
                                        usedStudents.add(student);
                                        usedStudents.add(student1);
                                        break;
                                    }
                                } else if (j == 1) {
                                    if (student.getGroupWorkability() + student1.getGroupWorkability() == 3) {
                                        pairs.add(new Pair(student, student1, req));
                                        usedStudents.add(student);
                                        usedStudents.add(student1);
                                        break;
                                    }
                                } else if (j == 2) {
                                    if (student.getGroupWorkability() + student1.getGroupWorkability() == 5) {
                                        pairs.add(new Pair(student, student1, req));
                                        usedStudents.add(student);
                                        usedStudents.add(student1);
                                        break;
                                    }
                                } else if (j == 3) {
                                    if (student.getGroupWorkability() + student1.getGroupWorkability() == 6) {
                                        pairs.add(new Pair(student, student1, req));
                                        usedStudents.add(student);
                                        usedStudents.add(student1);
                                        break;
                                    }
                                } else if (j == 4) {
                                    if (student.getGroupWorkability() + student1.getGroupWorkability() == 2) {
                                        pairs.add(new Pair(student, student1, req));
                                        usedStudents.add(student);
                                        usedStudents.add(student1);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            j++;
        }
        j = 0;
        while (!(usedTables.size() == tables.size())) {
            for (Table table : tables) {
                if (!usedTables.contains(table)) {
                    for (Pair pair : pairs) {
                        if (!usedPairs.contains(pair)) {
                            if (j == 0) {
                                if (pair.getAssist() == TEACHERMONITORIZATIONREQ && table.isTeacherMonitored()) {
                                    table.addPair(pair);
                                    usedPairs.add(pair);
                                    break;
                                } else if (pair.getAssist() == VISIONAIDREQ && table.isVisionFriendly()) {
                                    table.addPair(pair);
                                    usedPairs.add(pair);
                                    break;
                                } else if (pair.getAssist() == NOREQ && !table.isTeacherMonitored() && !table.isVisionFriendly()) {
                                    table.addPair(pair);
                                    usedPairs.add(pair);
                                    break;
                                }
                            } else if (j == 1) {
                                table.addPair(pair);
                                usedPairs.add(pair);
                                break;
                            }
                        }
                    }
                    if (table.getRemainingSeats() == 0) {
                        usedTables.add(table);
                    }
                }
            }
            j++;
        }
        return usedTables;
    }
}
