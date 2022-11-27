package com.haruma.seatcharter.ui;

import com.haruma.seatcharter.SeatCharter;
import com.haruma.seatcharter.seatcharterSys.ClassID;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SeatCharterFrame extends JFrame {
    private ClassID classID;

    private JPanel formPanel;
    private JTabbedPane seatCharterTabs;
    private JButton createANewChartButton;
    private JButton openAnExistingChartButton;
    private JPanel getStartedTab;
    private JPanel chart1;

    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem newItem;
    private JMenuItem openItem;
    private JMenuItem saveItem;
    private JMenuItem exportItem;
    private JMenu editMenu;
    private JMenuItem copyItem;
    private JMenuItem pasteItem;
    private JMenuItem cutItem;
    private JMenuItem deleteItem;
    private JMenu navigateMenu;
    private JMenu helpMenu;
    private JMenuItem aboutItem;
    private JMenuItem repItem;
    private JMenuItem wikiItem;
    private JMenu shareMenu;
    private JMenuItem chartItem;
    private JMenuItem linkItem;

    public SeatCharterFrame() {
        classID = new ClassID("SSFrame");

        //window
        setTitle("Seat Charter (v0.1.0) by Haruma");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(840, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMenuBar();
        addForm();
        setVisible(true);
        listeners();
    }
    public void addMenuBar() {
        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        newItem = new JMenuItem("New");
        newItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SeatCharter.logger.log(classID, "JMenuItem 'New' was pressed");
            }
        });
        fileMenu.add(newItem);
        openItem = new JMenuItem("Open");
        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SeatCharter.logger.log(classID, "JMenuItem 'Open' was pressed");
            }
        });
        fileMenu.add(openItem);
        saveItem = new JMenuItem("Save");
        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SeatCharter.logger.log(classID, "JMenuItem 'Save' was pressed");
            }
        });
        fileMenu.add(saveItem);
        exportItem = new JMenuItem("Export");
        exportItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SeatCharter.logger.log(classID, "JMenuItem 'Export' was pressed");
            }
        });
        fileMenu.add(exportItem);

        editMenu = new JMenu("Edit");
        copyItem = new JMenuItem("Copy");
        copyItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SeatCharter.logger.log(classID, "JMenuItem 'Copy' was pressed");
            }
        });
        editMenu.add(copyItem);
        pasteItem = new JMenuItem("Paste");
        pasteItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SeatCharter.logger.log(classID, "JMenuItem 'Paste' was pressed");
            }
        });
        editMenu.add(pasteItem);
        cutItem = new JMenuItem("Cut");
        cutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SeatCharter.logger.log(classID, "JMenuItem 'Cut' was pressed");
            }
        });
        editMenu.add(cutItem);
        deleteItem = new JMenuItem("Delete");
        deleteItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SeatCharter.logger.log(classID, "JMenuItem 'Delete' was pressed");
            }
        });
        editMenu.add(copyItem);

        navigateMenu = new JMenu("Navigate");
        helpMenu = new JMenu("Help");
        shareMenu = new JMenu("Share");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(navigateMenu);
        menuBar.add(helpMenu);
        menuBar.add(shareMenu);
        setJMenuBar(menuBar);
    }
    public void addForm() {
        setContentPane(formPanel);
        UIManager.put("TabbedPane.tabSeparatorsFullHeight", true);

//        seatCharterTabs.set
//        seatCharterTabs.removeTabAt(1);
    }
    public void listeners() {
        createANewChartButton.addActionListener(e -> createNewWorkspace());
    }
    public void createNewWorkspace() {

    }
}
