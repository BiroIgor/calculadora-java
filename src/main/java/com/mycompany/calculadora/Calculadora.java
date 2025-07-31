package com.mycompany.calculadora;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{
    
    private Display display;
    private Teclado teclado;

    public Calculadora()  {
        
        setTitle("Calculadora");
        setSize(232, 322);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());
        
        // Definir cor de fundo da janela
        getContentPane().setBackground(new Color(20, 20, 20));
        
        // Criar e adicionar componentes
        display = new Display();
        teclado = new Teclado();
        
        add(display, BorderLayout.NORTH);
        add(teclado, BorderLayout.CENTER);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Calculadora();
    }
}
