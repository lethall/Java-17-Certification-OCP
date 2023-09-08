package com.javafoundry.ocpJava17.project.c;

import javax.swing.*;
import java.awt.event.*;

public class SwingInterface {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                JFrame frame = new JFrame("Simple GUI");
                JFrame frame2 = new JFrame("Another Window");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


                var panel = new JPanel();
                var btn = new JButton("Push Me (this is now a much bigger button just to make the frame bigger");

                btn.addActionListener(new ActionListener() {
                    @Override
                    public void
                    actionPerformed(ActionEvent e) {
                        System.out.println("Clicked");
                    }
                });

                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("something else");
                    }
                });

                panel.add(btn);
                frame.setContentPane(panel);
                frame.pack();
                frame.setVisible(true);
                frame2.pack();
                frame2.setVisible(true);
            }
        });
    }
}