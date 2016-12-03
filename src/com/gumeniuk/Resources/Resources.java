package com.gumeniuk.Resources;

import java.util.ResourceBundle;

public final class Resources {
    static final ResourceBundle strings;

    static {
        strings = ResourceBundle.getBundle("com.gumeniuk.Resources.strings");
    }

    private Resources() {
    }

    public static String string(String name) {
        return strings.getString(name);
    }
}
