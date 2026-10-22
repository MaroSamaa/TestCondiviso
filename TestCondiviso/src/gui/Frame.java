package TestCondiviso.src.gui;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame 
{
    public Frame()
    {
        super("TestFrame");
        setLayout(new BorderLayout());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton btn = new JButton("Bottone");
        this.getContentPane().add(btn);
    }
}
