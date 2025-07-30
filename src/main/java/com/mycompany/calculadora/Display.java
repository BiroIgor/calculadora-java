package com.mycompany.calculadora;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;

@SuppressWarnings("serial") 
public class Display extends JPanel {
    
    private JLabel label;
    
    public Display() {
        setBackground(Color.BLACK);
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        label = new JLabel("0");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Arial", Font.BOLD, 24));
        
        add(label);
    }
    
    public void setText(String texto) {
        label.setText(texto);
    }
    
    public String getText() {
        return label.getText();
    }
}
