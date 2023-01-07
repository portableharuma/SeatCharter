package com.haruma.seatcharter.ui;

import com.haruma.seatcharter.SeatCharter;
import com.haruma.seatcharter.seatchartersystem.ClassID;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SeatCharterCreationPane extends JFrame {
    ClassID classID;
    private JPanel creationPanePanel;
    private JSpinner numOfTableSpinner;
    private JSpinner numOfStudentsSpinner;
    private JTextField chartNameField;
    private JButton cancelButton;
    private JButton finishButton;

    private SeatCharterFrame seatCharterFrame;

    public SeatCharterCreationPane(SeatCharterFrame seatCharterFrame) {
        classID = new ClassID("SeatCharterCreationMenubarClass");

        setTitle("New seating chart");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(840, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        addForm();
        setVisible(true);
        addListeners();

        this.seatCharterFrame = seatCharterFrame;
    }
    public void addForm() {
        setContentPane(creationPanePanel);
    }
    public void addListeners() {
        chartNameField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        numOfTableSpinner.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });
        numOfStudentsSpinner.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeWindow();
            }
        });
        finishButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (chartNameField.getText().contains(" ")) {
                    SeatCharter.logger.log(classID, "error, illegal character; check for spaces");
                } else if (chartNameField.getText().equals("")) {
                    SeatCharter.logger.log(classID, "error, no name found");
                } else if (numOfTableSpinner.getValue().equals(0)) {
                    SeatCharter.logger.log(classID, "error, table value must be more than 0");
                } else if (numOfStudentsSpinner.getValue().equals(0)) {
                    SeatCharter.logger.log(classID, "error, student value must be more than 0");
                } else {
                    new SeatCharterWorkspace(chartNameField.getText(), (int) numOfTableSpinner.getValue(), (int) numOfStudentsSpinner.getValue(), seatCharterFrame);
                    closeWindow();
                }
            }
        });
    }
    public void closeWindow() {
        this.setVisible(false);
        this.dispose();
    }

}
