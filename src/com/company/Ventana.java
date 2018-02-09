package com.company;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame{
    private JButton b1, b2, b3, b4, b5;

    public Ventana(){
        super("Ejemplo de BorderLayout");
        setSize(500,600);

        b1 = new JButton("Boton 1");
        b2 = new JButton("Boton 2");
        b3 = new JButton("Boton 3");
        b4 = new JButton("Boton 4");
        b5 = new JButton("Boton 5");

        setLayout(new BorderLayout());

        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.CENTER);
        add(b3,BorderLayout.SOUTH);
        add(b4,BorderLayout.EAST);
        add(b5,BorderLayout.WEST);
    }
}
