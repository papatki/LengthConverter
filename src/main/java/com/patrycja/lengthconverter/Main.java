package com.patrycja.lengthconverter;

import com.patrycja.lengthconverter.view.UserInterface;

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            UserInterface frame = new UserInterface();
            frame.setTitle("Length Converter");
            frame.setVisible(true);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
        });
    }
}
