package gui;

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
    }
}
