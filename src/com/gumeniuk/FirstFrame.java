package com.gumeniuk;

import javax.swing.*;
import java.awt.*;

import com.gumeniuk.Resources.Resources;

public class FirstFrame extends JFrame {

    private final JButton button;
    private final JTextField textField;
    private final JLabel label;

    public FirstFrame() throws HeadlessException {
        super(Resources.string("application.title"));

        label = new JLabel(Resources.string("label.message"),JLabel.CENTER);
        button = new JButton(Resources.string("button.push.me"));
        textField = new JTextField(16);

        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);

        Dimension dimension = new Dimension(300, 400);
        getContentPane().setPreferredSize(dimension);


        add(textField, BorderLayout.NORTH);
        add(button, BorderLayout.SOUTH);

        add(label, BorderLayout.CENTER);

        pack();
    }
}
