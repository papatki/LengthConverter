package com.patrycja.lengthconverter.service;

import javax.swing.*;
import java.text.DecimalFormat;


public class Converting {

    public void getResult(JComboBox comboBoxFrom, JComboBox comboBoxTo,
                          JTextField textFieldFrom, JTextField textFieldTo) {

        Object whichItemIsSelectedFrom = comboBoxFrom.getSelectedItem();
        Object whichItemIsSelectedTo = comboBoxTo.getSelectedItem();

        if (textFieldFrom.getText().isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "Please, enter a value.", "Warning",
                    JOptionPane.WARNING_MESSAGE);
        } else if (!isNum(textFieldFrom.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "Please, enter a number.", "Warning",
                    JOptionPane.WARNING_MESSAGE);
        } else if (whichItemIsSelectedFrom == "Kilometre") {
            double number = Double.parseDouble(textFieldFrom.getText());
            if (whichItemIsSelectedTo == "Kilometre") {
                textFieldTo.setText("" + Double.parseDouble(textFieldFrom.getText()));
            } else if (whichItemIsSelectedTo == "Metre") {
                textFieldTo.setText("" + convert(number, 3));
            } else if (whichItemIsSelectedTo == "Decimetre") {
                textFieldTo.setText("" + convert(number, 4));
            } else if (whichItemIsSelectedTo == "Centimetre") {
                textFieldTo.setText("" + convert(number, 5));
            } else if (whichItemIsSelectedTo == "Millimetre") {
                textFieldTo.setText("" + convert(number, 6));
            } else if (whichItemIsSelectedTo == "Micrometre") {
                textFieldTo.setText("" + convert(number, 9));
            } else if (whichItemIsSelectedTo == "Nanometre") {
                textFieldTo.setText("" + convert(number, 12));
            }
        } else if (whichItemIsSelectedFrom == "Metre") {
            double number = Double.parseDouble(textFieldFrom.getText());
            if (whichItemIsSelectedTo == "Kilometre") {
                textFieldTo.setText("" + convert(number, -3));
            } else if (whichItemIsSelectedTo == "Metre") {
                textFieldTo.setText("" + Double.parseDouble(textFieldFrom.getText()));
            } else if (whichItemIsSelectedTo == "Decimetre") {
                textFieldTo.setText("" + convert(number, 1));
            } else if (whichItemIsSelectedTo == "Centimetre") {
                textFieldTo.setText("" + convert(number, 2));
            } else if (whichItemIsSelectedTo == "Millimetre") {
                textFieldTo.setText("" + convert(number, 3));
            } else if (whichItemIsSelectedTo == "Micrometre") {
                textFieldTo.setText("" + convert(number, 6));
            } else if (whichItemIsSelectedTo == "Nanometre") {
                textFieldTo.setText("" + convert(number, 9));
            }
        } else if (whichItemIsSelectedFrom == "Decimetre") {
            double number = Double.parseDouble(textFieldFrom.getText());
            if (whichItemIsSelectedTo == "Kilometre") {
                textFieldTo.setText("" + convert(number, -4));
            } else if (whichItemIsSelectedTo == "Metre") {
                textFieldTo.setText("" + convert(number, -1));
            } else if (whichItemIsSelectedTo == "Decimetre") {
                textFieldTo.setText("" + Double.parseDouble(textFieldFrom.getText()));
            } else if (whichItemIsSelectedTo == "Centimetre") {
                textFieldTo.setText("" + convert(number, 1));
            } else if (whichItemIsSelectedTo == "Millimetre") {
                textFieldTo.setText("" + convert(number, 2));
            } else if (whichItemIsSelectedTo == "Micrometre") {
                textFieldTo.setText("" + convert(number, 5));
            } else if (whichItemIsSelectedTo == "Nanometre") {
                textFieldTo.setText("" + convert(number, 8));
            }
        } else if (whichItemIsSelectedFrom == "Centimetre") {
            double number = Double.parseDouble(textFieldFrom.getText());
            if (whichItemIsSelectedTo == "Kilometre") {
                textFieldTo.setText("" + convert(number, -5));
            } else if (whichItemIsSelectedTo == "Metre") {
                textFieldTo.setText("" + convert(number, -2));
            } else if (whichItemIsSelectedTo == "Decimetre") {
                textFieldTo.setText("" + convert(number, -1));
            } else if (whichItemIsSelectedTo == "Centimetre") {
                textFieldTo.setText("" + Double.parseDouble(textFieldFrom.getText()));
            } else if (whichItemIsSelectedTo == "Millimetre") {
                textFieldTo.setText("" + convert(number, 1));
            } else if (whichItemIsSelectedTo == "Micrometre") {
                textFieldTo.setText("" + convert(number, 4));
            } else if (whichItemIsSelectedTo == "Nanometre") {
                textFieldTo.setText("" + convert(number, 7));
            }
        } else if (whichItemIsSelectedFrom == "Millimetre") {
            double number = Double.parseDouble(textFieldFrom.getText());
            if (whichItemIsSelectedTo == "Kilometre") {
                textFieldTo.setText("" + convert(number, -6));
            } else if (whichItemIsSelectedTo == "Metre") {
                textFieldTo.setText("" + convert(number, -3));
            } else if (whichItemIsSelectedTo == "Decimetre") {
                textFieldTo.setText("" + convert(number, -2));
            } else if (whichItemIsSelectedTo == "Centimetre") {
                textFieldTo.setText("" + convert(number, -1));
            } else if (whichItemIsSelectedTo == "Millimetre") {
                textFieldTo.setText("" + Double.parseDouble(textFieldFrom.getText()));
            } else if (whichItemIsSelectedTo == "Micrometre") {
                textFieldTo.setText("" + convert(number, 3));
            } else if (whichItemIsSelectedTo == "Nanometre") {
                textFieldTo.setText("" + convert(number, 6));
            }
        } else if (whichItemIsSelectedFrom == "Micrometre") {
            double number = Double.parseDouble(textFieldFrom.getText());
            if (whichItemIsSelectedTo == "Kilometre") {
                textFieldTo.setText("" + convert(number, -9));
            } else if (whichItemIsSelectedTo == "Metre") {
                textFieldTo.setText("" + convert(number, -6));
            } else if (whichItemIsSelectedTo == "Decimetre") {
                textFieldTo.setText("" + convert(number, -5));
            } else if (whichItemIsSelectedTo == "Centimetre") {
                textFieldTo.setText("" + convert(number, -4));
            } else if (whichItemIsSelectedTo == "Millimetre") {
                textFieldTo.setText("" + convert(number, -3));
            } else if (whichItemIsSelectedTo == "Micrometre") {
                textFieldTo.setText("" + Double.parseDouble(textFieldFrom.getText()));
            } else if (whichItemIsSelectedTo == "Nanometre") {
                textFieldTo.setText("" + convert(number, 3));
            }
        } else if (whichItemIsSelectedFrom == "Nanometre") {
            double number = Double.parseDouble(textFieldFrom.getText());
            if (whichItemIsSelectedTo == "Kilometre") {
                textFieldTo.setText("" + convert(number, -12));
            } else if (whichItemIsSelectedTo == "Metre") {
                textFieldTo.setText("" + convert(number, -9));
            } else if (whichItemIsSelectedTo == "Decimetre") {
                textFieldTo.setText("" + convert(number, -8));
            } else if (whichItemIsSelectedTo == "Centimetre") {
                textFieldTo.setText("" + convert(number, -7));
            } else if (whichItemIsSelectedTo == "Millimetre") {
                textFieldTo.setText("" + convert(number, -6));
            } else if (whichItemIsSelectedTo == "Micrometre") {
                textFieldTo.setText("" + convert(number, -3));
            } else if (whichItemIsSelectedTo == "Nanometre") {
                textFieldTo.setText("" + Double.parseDouble(textFieldFrom.getText()));
            }
        }
    }

    public double convert(double number, double exponent) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##########");
        double result = Math.pow(10, exponent) * number;
        return Double.valueOf(decimalFormat.format(result));
    }

    public boolean isNum(String strNum) {
        boolean ret = true;
        try {
            Double.parseDouble(strNum);
        } catch (NumberFormatException e) {
            ret = false;
        }
        return ret;
    }
}
