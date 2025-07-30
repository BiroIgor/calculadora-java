package com.mycompany.calculadora;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton {
    
    public Botao(String texto) {
        super(texto);
        setFont(getFont().deriveFont(16f));
    }
}
