package com.calculator.app;

import javax.swing.JOptionPane;

import com.calculator.models.Calculator;

public class App {
    public static void main(String[] args) throws Exception {
        Calculator cal = new Calculator();
        String options[] = { "Multiply", "Divide", "Sum", "Subtract", "Exit" };
        int choice;
        choice = JOptionPane.showOptionDialog(
                null,
                "Choose an operation:",
                "Calculator",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]);
        if (choice == 4 || choice == JOptionPane.CLOSED_OPTION) {
            System.exit(0);
        }

        switch (choice) {
            case 0:
                cal.setNumber1(Double.parseDouble(JOptionPane.showInputDialog("Number 1:")));
                cal.setNumber2(Double.parseDouble(JOptionPane.showInputDialog("Number 2:")));
                JOptionPane.showMessageDialog(null, cal.multiply(cal.getNumber1(), cal.getNumber2()));
                break;
            case 1:
                cal.setNumber1(Double.parseDouble(JOptionPane.showInputDialog("Number 1:")));
                cal.setNumber2(Double.parseDouble(JOptionPane.showInputDialog("Number 2:")));
                JOptionPane.showMessageDialog(null, cal.divde(cal.getNumber1(), cal.getNumber2()));
                break;
            case 2:
                cal.setNumber1(Double.parseDouble(JOptionPane.showInputDialog("Number 1:")));
                cal.setNumber2(Double.parseDouble(JOptionPane.showInputDialog("Number 2:")));
                JOptionPane.showMessageDialog(null, cal.sum(cal.getNumber1(), cal.getNumber2()));
                break;
            case 3:
                cal.setNumber1(Double.parseDouble(JOptionPane.showInputDialog("Number 1:")));
                cal.setNumber2(Double.parseDouble(JOptionPane.showInputDialog("Number 2:")));
                JOptionPane.showMessageDialog(null, cal.subtract(cal.getNumber1(),cal.getNumber2() ));
                break;
        }

    }
}
