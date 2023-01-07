package com.haruma.seatcharter.ui;

import javax.swing.*;

public class SeatCharterWorkspace extends JPanel {
    private JPanel charterWorkspace;
    private JTable table1;

    public SeatCharterWorkspace(String name, int numOfTables, int numOfStudents, SeatCharterFrame seatCharterFrame) {
        seatCharterFrame.getSeatCharterTabs().add(this.add(charterWorkspace));
        seatCharterFrame.getSeatCharterTabs().setTitleAt(seatCharterFrame.getSeatCharterTabs().indexOfTab(""), name);
    }
}