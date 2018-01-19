package com.patrycja.lengthconverter.service;

import javax.swing.*;


public class ButtonActions {

    public void clearFields(JTextField fromField, JTextField toField) {
        fromField.setText("");
        toField.setText("");
    }

    public void reverse(JTextField fromField, JTextField toField,
                        JComboBox fromBox, JComboBox toBox) {

        String newTo = fromField.getText();
        String newFrom = toField.getText();
        fromField.setText(newFrom);
        toField.setText(newTo);

        Object objectTo = toBox.getSelectedItem();
        Object objectFrom = fromBox.getSelectedItem();
        fromBox.setSelectedItem(objectTo);
        toBox.setSelectedItem(objectFrom);
    }
}
