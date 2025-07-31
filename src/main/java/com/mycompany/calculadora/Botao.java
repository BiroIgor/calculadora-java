package com.mycompany.calculadora;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;

@SuppressWarnings("serial")
public class Botao extends JButton {
    
    public Botao(String texto) {
        super(texto);
        configurarEstilo(texto);
    }

    private void configurarEstilo(String texto) {
        setFont(new Font("Arial", Font.BOLD, 18));
        setFocusPainted(false);
        setBorder(BorderFactory.createRaisedBevelBorder());

        // Definir cores baseadas no tipo de botão
        if (isNumero(texto) || texto.equals(",")) {
            // Botões de números - cinza claro
            setBackground(new Color(64, 64, 64));
            setForeground(Color.WHITE);
        } else if (isOperador(texto)) {
            // Botões de operadores - laranja
            setBackground(new Color(255, 149, 0));
            setForeground(Color.WHITE);
        } else if (texto.equals("=")) {
            // Botão igual - laranja mais escuro
            setBackground(new Color(255, 149, 0));
            setForeground(Color.WHITE);
        } else if (isFuncaoEspecial(texto)) {
            // Botões de funções especiais - cinza mais claro
            setBackground(new Color(165, 165, 165));
            setForeground(Color.BLACK);
        } else {
            // Botão vazio ou outros
            setBackground(new Color(32, 32, 32));
            setForeground(Color.WHITE);
            setEnabled(false);
        }

        // Efeito hover
        addMouseListener(new java.awt.event.MouseAdapter() {
            Color corOriginal = getBackground();

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (isEnabled()) {
                    setBackground(corOriginal.brighter());
                }
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (isEnabled()) {
                    setBackground(corOriginal);
                }
            }
        });
    }

    private boolean isNumero(String texto) {
        return texto.matches("[0-9]");
    }

    private boolean isOperador(String texto) {
        return texto.equals("+") || texto.equals("-") || texto.equals("×") || texto.equals("÷");
    }

    private boolean isFuncaoEspecial(String texto) {
        return texto.equals("C") || texto.equals("±") || texto.equals("%");
    }
}
