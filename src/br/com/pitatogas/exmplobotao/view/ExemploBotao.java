package br.com.pitatogas.exmplobotao.view;

import javax.swing.*;
import java.awt.*;

public class ExemploBotao {
    public ExemploBotao(){
        JFrame container = new JFrame("Exemplo botão");
        container.setLayout(new FlowLayout());

        container.setSize(200,90);

        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jButtonUp = new JButton("Up");
        JButton jButtonDown = new JButton("Down");

        container.add(jButtonUp);
        container.add(jButtonDown);


        JLabel jLabelResultado = new JLabel("Por favor, pressione um botão");

        container.add(jLabelResultado);
        container.setVisible(true);
    }
}
