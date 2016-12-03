package com.gumeniuk;

import javax.swing.*;
import java.awt.*;
import java.util.Locale;

import static javax.swing.UIManager.setLookAndFeel;
import static javax.swing.UIManager.getSystemLookAndFeelClassName;

public class Main {


    public static void main(String[] args) {
        try {
            setLookAndFeel(getSystemLookAndFeelClassName());
//            setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.fillInStackTrace();
            System.err.println(e.getMessage());
        }

//        Locale ru = Locale.forLanguageTag("ru");
//        Locale.setDefault(ru);
        FirstFrame frame = new FirstFrame();

        Dimension dimension = new Dimension(350, 100);

        frame.setMinimumSize(dimension);

        frame.setVisible(true);
    }
}
