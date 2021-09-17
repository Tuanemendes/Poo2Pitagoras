package br.com.pitagoras;

import br.com.pitagoras.view.Calculadora;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculadora();
            }
        });
    }
}
