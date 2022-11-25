package com.haruma.seatcharter.seatcharter;

import com.haruma.seatcharter.seatcharterSys.ClassID;

public class Student {
    private ClassID classID;

    private int groupWorkability;
    private boolean teacherMonitorizationReq;

    public Student() {
        classID = new ClassID("StudentClass");
    }
}
