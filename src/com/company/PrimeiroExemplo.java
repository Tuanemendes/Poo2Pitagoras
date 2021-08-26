package com.company;

import javax.swing.*;
import java.awt.*;

public class PrimeiroExemplo {

    PrimeiroExemplo(){
        //Criando nosso container(organizador do layout
        JFrame container = new JFrame( "Nosso Primeiro Exemplo");
        container.setLayout(new FlowLayout());

        //DEfine  o tamanho da janela
        container.setSize(300, 100);

        // Ação padrão ao fechar
        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Rotulo exibido na tela
        JLabel jLabelMsn = new JLabel( "OLá ");
        JLabel jLabelMsn2 = new JLabel( "SEgundo rodulo");

        //vincula o componente ao container
        container.add(jLabelMsn);
        container.add(jLabelMsn2);
        // Define a exibição do container
        container.setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PrimeiroExemplo();
            }
        });
    }
}
