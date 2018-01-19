package com.patrycja.lengthconverter.view;

import com.patrycja.lengthconverter.service.ButtonActions;
import com.patrycja.lengthconverter.service.Converting;

import javax.swing.*;
import java.awt.*;


public class ConverterPanel extends JPanel {
    private JLabel jLabelFrom, jLabelTo;
    private JTextField jTextFieldFrom, jTextFieldTo;
    private JComboBox jComboBoxFrom, jComboBoxTo;
    private JButton clearButton, calculateButton, reverseButton;
    private String[] lengthUnits = {"Kilometre",
            "Metre",
            "Decimetre",
            "Centimetre",
            "Millimetre",
            "Micrometre",
            "Nanometre"};
    private ButtonActions buttonActions = new ButtonActions();
    private Converting converting = new Converting();

//    App in which you can write a value only to 'FromField" and you will get the answer in 'ToField'
//    'ToField' is not enabled, calculating via CalculateButton

    public ConverterPanel() {
        setLayout(new GridLayout(3, 3, 20, 20));

        jLabelFrom = new JLabel("FROM", SwingConstants.CENTER);
        add(jLabelFrom);

        jTextFieldFrom = new JTextField(SwingConstants.CENTER);
        add(jTextFieldFrom);

        jComboBoxFrom = new JComboBox(lengthUnits);
        jComboBoxFrom.setBackground(Color.lightGray);
        jComboBoxFrom.setEditable(true);
        add(jComboBoxFrom);

        jLabelTo = new JLabel("TO", SwingConstants.CENTER);
        add(jLabelTo);

        jTextFieldTo = new JTextField(SwingConstants.CENTER);
        jTextFieldTo.setEnabled(false);
        jTextFieldTo.setBackground(Color.white);
        add(jTextFieldTo);

        jComboBoxTo = new JComboBox(lengthUnits);
        jComboBoxTo.setBackground(Color.lightGray);
        jComboBoxTo.setEditable(true);
        add(jComboBoxTo);

        calculateButton = new JButton("CALCULATE");
        calculateButton.addActionListener(ActionListener -> converting.getResult(jComboBoxFrom, jComboBoxTo,
                jTextFieldFrom, jTextFieldTo));
        add(calculateButton);

        clearButton = new JButton("CLEAR");
        clearButton.addActionListener(ActionListener -> buttonActions.clearFields(jTextFieldFrom, jTextFieldTo));
        add(clearButton);

        reverseButton = new JButton("REVERSE");
        reverseButton.addActionListener(ActionListener -> buttonActions.reverse(jTextFieldFrom, jTextFieldTo,
                jComboBoxFrom, jComboBoxTo));
        add(reverseButton);

    }
}
