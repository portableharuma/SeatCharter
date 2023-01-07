package com.haruma.seatcharter;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLaf;
import com.haruma.seatcharter.seatcharter.Sorter;
import com.haruma.seatcharter.seatcharter.Student;
import com.haruma.seatcharter.seatcharter.Table;
import com.haruma.seatcharter.ui.SeatCharterFrame;
import com.haruma.seatcharter.util.Logger;
import com.haruma.seatcharter.seatchartersystem.ClassID;
import com.haruma.seatcharter.util.DateTimeUtil;

import javax.swing.*;
import java.util.ArrayList;

public class SeatCharter {
    private ClassID classID;

    public static Logger logger;
    public static DateTimeUtil dateTimeUtil;

    private Sorter sorter;
    public static void main(String[] args) {
        new SeatCharter();
    }
    public SeatCharter() {
        ArrayList tables = new ArrayList<Table>();
        Table table = new Table(2, false, false, 0);
        Table table1 = new Table(4, false, false, 1);
        Table table2 = new Table(2, false, true, 2);
        Table table3 = new Table(4, true, false, 3);
        Table table4 = new Table(2, true, true, 4);
        Table table5 = new Table(4, true, false, 5);
        Table table6 = new Table(2, false, false, 6);
        Table table7 = new Table(2, false, false, 7);
        tables.add(table);
        tables.add(table1);
        tables.add(table2);
        tables.add(table3);
        tables.add(table4);
        tables.add(table5);
        tables.add(table6);
        tables.add(table7);

        ArrayList students = new ArrayList<Student>();
        Student student = new Student(1, Sorter.TEACHERMONITORIZATIONREQ, "a");
        Student student1 = new Student(3, Sorter.NOREQ, "b");
        Student student2 = new Student(2, Sorter.TEACHERMONITORIZATIONREQ, "c");
        Student student3 = new Student(3, Sorter.NOREQ, "d");
        Student student4 = new Student(2, Sorter.VISIONAIDREQ, "e");
        Student student5 = new Student(2, Sorter.NOREQ, "f");
        Student student6 = new Student(2, Sorter.NOREQ, "g");
        Student student7 = new Student(1, Sorter.TEACHERMONITORIZATIONREQ, "h");
        Student student8 = new Student(1, Sorter.TEACHERMONITORIZATIONREQ, "i");
        Student student9 = new Student(2, Sorter.NOREQ, "j");
        Student student10 = new Student(3, Sorter.NOREQ, "k");
        Student student11 = new Student(3, Sorter.NOREQ, "l");
        Student student12 = new Student(3, Sorter.NOREQ, "m");
        Student student13 = new Student(2, Sorter.NOREQ, "n");
        Student student14 = new Student(1, Sorter.NOREQ, "o");
        Student student15 = new Student(2, Sorter.NOREQ, "p");
        Student student16 = new Student(2, Sorter.TEACHERMONITORIZATIONREQ, "q");
        Student student17 = new Student(1, Sorter.NOREQ, "r");
        Student student18 = new Student(3, Sorter.NOREQ, "s");
        Student student19 = new Student(3, Sorter.NOREQ, "t");
        Student student20 = new Student(3, Sorter.NOREQ, "u");
        Student student21 = new Student(3, Sorter.NOREQ, "v");
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);
        students.add(student13);
        students.add(student14);
        students.add(student15);
        students.add(student16);
        students.add(student17);
        students.add(student18);
        students.add(student19);
        students.add(student20);
        students.add(student21);

        System.out.println("hi");
        sorter = new Sorter(tables, students);
        System.out.println("hey");
        for (Table tableToPrint : sorter.basicSort()) {
            tableToPrint.printTestResults();
        }


        classID = new ClassID("SeatCharterMain");

        logger = new Logger();
        dateTimeUtil = new DateTimeUtil();
        logger.log(classID, "utils loaded");
        //testing GUI

        UIManager.put("TabbedPane.showTabSeparators", true);

        FlatLaf.setup(new FlatDarculaLaf());
        new SeatCharterFrame();
        logger.log(classID, "UI started");
    }
}
