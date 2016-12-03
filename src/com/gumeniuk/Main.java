package com.gumeniuk;

import java.awt.*;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
//        Locale ru = Locale.forLanguageTag("ru");
//        Locale.setDefault(ru);
        FirstFrame frame = new FirstFrame();

        Dimension dimension = new Dimension(300, 400);

        frame.setMinimumSize(dimension);

        frame.setVisible(true);
    }
}
