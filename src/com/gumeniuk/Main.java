package com.gumeniuk;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale ru = Locale.forLanguageTag("ru");
        Locale.setDefault(ru);
        new FirstFrame().setVisible(true);
    }
}
