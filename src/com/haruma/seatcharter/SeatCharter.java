package com.haruma.seatcharter;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLaf;
import com.haruma.seatcharter.ui.SeatCharterFrame;
import com.haruma.seatcharter.util.Logger;
import com.haruma.seatcharter.seatcharterSys.ClassID;
import com.haruma.seatcharter.util.DateTimeUtil;

import javax.swing.*;

public class SeatCharter {
    private ClassID classID;

    public static Logger logger;
    public static DateTimeUtil dateTimeUtil;
    public static void main(String[] args) {
        new SeatCharter();
    }
    public SeatCharter() {
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
