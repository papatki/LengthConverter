package com.patrycja.lengthconverter.view;

import javax.swing.*;


public class UserInterface extends JFrame {
    public UserInterface(){
        add(new ConverterPanel());
        pack();
        setVisible(true);
    }
}
