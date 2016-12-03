package com.gumeniuk;

import javax.swing.*;
import java.awt.*;
public class FirstFrame extends JFrame{
    public FirstFrame() throws HeadlessException {
        super(com.gumeniuk.Resources.Resources.string("application.title"));
        
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        Dimension dimension = new Dimension(300,400);
        setSize(dimension);
    }
}
