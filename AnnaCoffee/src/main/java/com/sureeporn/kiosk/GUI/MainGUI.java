package com.sureeporn.kiosk.GUI;

import com.sureeporn.kiosk.ui.MainFrame;

public class MainGUI {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            MainFrame f = new MainFrame();
            f.setVisible(true);
        });
    }
}
