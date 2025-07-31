package com.mycompany.calculadora;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;

@SuppressWarnings("serial") 
public class Display extends JPanel {
    
    private JLabel label;
    
    public Display() {
        setBackground(new Color(32, 32, 32)); // Fundo cinza escuro
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createEmptyBorder(10, 10, 10, 10),
            BorderFactory.createLoweredBevelBorder()
        ));

        label = new JLabel("0");
        label.setForeground(new Color(255, 255, 255)); // Texto branco
        label.setFont(new Font("Arial", Font.BOLD, 28));

        add(label);
    }
    
    public void setText(String texto) {
        label.setText(texto);
    }
    
    public String getText() {
        return label.getText();
    }
}
