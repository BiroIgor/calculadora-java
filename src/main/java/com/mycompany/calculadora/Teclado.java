package com.mycompany.calculadora;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.BorderFactory;

@SuppressWarnings("serial") 
public class Teclado extends JPanel {

    public Teclado() {
        setBackground(new Color(20, 20, 20)); // Fundo escuro
        setLayout(new GridLayout(5, 4, 2, 2)); // 5 linhas, 4 colunas, espaçamento 2px
        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); // Margem interna

        adicionarBotoes();
    }
    
    private void adicionarBotoes() {
        // Primeira linha
        add(new Botao("C"));
        add(new Botao("±"));
        add(new Botao("%"));
        add(new Botao("÷"));
        
        // Segunda linha
        add(new Botao("7"));
        add(new Botao("8"));
        add(new Botao("9"));
        add(new Botao("×"));
        
        // Terceira linha
        add(new Botao("4"));
        add(new Botao("5"));
        add(new Botao("6"));
        add(new Botao("-"));
        
        // Quarta linha
        add(new Botao("1"));
        add(new Botao("2"));
        add(new Botao("3"));
        add(new Botao("+"));
        
        // Quinta linha
        add(new Botao("0"));
        add(new Botao(""));  // espaço vazio
        add(new Botao(","));
        add(new Botao("%"));
        add(new Botao("="));
    }
}
