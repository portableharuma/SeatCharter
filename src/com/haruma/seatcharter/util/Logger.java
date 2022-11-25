package com.haruma.seatcharter.util;

import com.haruma.seatcharter.SeatCharter;
import com.haruma.seatcharter.seatcharterSys.ClassID;

public class Logger {
    public void log(ClassID classID, String report) {
        System.out.println(SeatCharter.dateTimeUtil.getTimeWithMil() + addCosmeticSpace(8) + "(" + classID.getClassID() + ")" + addCosmeticSpace(1) + report);
    }
    public String addCosmeticSpace(int numOfSpaces) {
        String spaces = "";
        for (int i = numOfSpaces; i > 0; i--) {
            spaces = spaces.concat(" ");
        }
        return spaces;
    }
}
