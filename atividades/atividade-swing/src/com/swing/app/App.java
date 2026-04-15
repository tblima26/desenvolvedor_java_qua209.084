package com.swing.app;

import com.swing.views.MainFrame;

public class App {
    public static void main(String[] args) throws Exception {
       javax.swing.SwingUtilities.invokeLater(() -> new MainFrame());
    }
}
