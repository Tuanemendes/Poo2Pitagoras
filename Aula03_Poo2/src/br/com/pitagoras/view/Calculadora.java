package br.com.pitagoras.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class Calculadora {
    private final JTextField jLabelResultado;
    private final JLabel jLabelValorA;
    private final JLabel jLabelValorB;
    private final JTextField jTextValorA;
    private final JTextField jTextValorB;

    private final JButton jButtonAdd;
    private final JButton jButtonSub;
    private final JButton jButtonMul;
    private final JButton jButtonDiv;
    private final JButton jButtonLimpar;

    public Calculadora() {
        JFrame jFrameTelaPrincipal = new JFrame("Calculadora Simples");
        jFrameTelaPrincipal.setLayout(null);
        jFrameTelaPrincipal.setSize(300, 400);

        jFrameTelaPrincipal.setResizable(false);

        jLabelResultado = new JTextField("Resultado");

        jLabelValorA = new JLabel("Valor A");
        jLabelValorB = new JLabel("Valor B");

        jTextValorA = new JTextField();
        jTextValorB = new JTextField();

        jButtonAdd = new JButton("+");
        jButtonSub = new JButton("-");
        jButtonMul = new JButton("*");
        jButtonDiv = new JButton("/");
        jButtonLimpar = new JButton("Limpar");

        jLabelResultado.setBounds(10, 80, 255, 20);
        //jLabelResultado.setBackground(new Color(255,1,1,1));

        jLabelValorA.setBounds(10, 20, 50, 20);
        jTextValorA.setBounds(65, 20, 200, 20);

        jLabelValorB.setBounds(10, 50, 50, 20);
        jTextValorB.setBounds(65, 50, 200, 20);

        jButtonAdd.setBounds(60, 140, 50, 50);
        jButtonSub.setBounds(110, 140, 50, 50);
        jButtonMul.setBounds(160, 140, 50, 50);
        jButtonDiv.setBounds(210, 140, 50, 50);
        jButtonLimpar.setBounds(60, 200, 200, 50);

        jButtonLimpar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        acaoButtonLimpar();
                        //jLabelResultado.setText("Limpar acionado ");
                    }
                }

        );
        jButtonAdd.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        try {
                            executarOperacao(actionEvent.getActionCommand());
                            // new java.io.FileInputStream("arquivo.txt");
                        } catch (Exception e) {

                        }

                    }
                }
        );

        jButtonSub.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        executarOperacao(actionEvent.getActionCommand());
                    }
                }
        );

        jButtonMul.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        executarOperacao(actionEvent.getActionCommand());
                    }
                }
        );

        jButtonDiv.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        executarOperacao(actionEvent.getActionCommand());
                    }
                }
        );


        jFrameTelaPrincipal.add(jLabelResultado);
        jFrameTelaPrincipal.add(jLabelValorA);
        jFrameTelaPrincipal.add(jTextValorA);
        jFrameTelaPrincipal.add(jLabelValorB);
        jFrameTelaPrincipal.add(jTextValorB);
        jFrameTelaPrincipal.add(jButtonAdd);
        jFrameTelaPrincipal.add(jButtonSub);
        jFrameTelaPrincipal.add(jButtonMul);
        jFrameTelaPrincipal.add(jButtonDiv);
        jFrameTelaPrincipal.add(jButtonLimpar);
        jFrameTelaPrincipal.setResizable(false);
        jFrameTelaPrincipal.setVisible(true);
        jFrameTelaPrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    private void executarOperacao(String actionCommand) {
        BigDecimal valorA = new BigDecimal(jTextValorA.getText());
        BigDecimal valorB = new BigDecimal(jTextValorB.getText());
        BigDecimal resultado;
        switch (actionCommand) {
            case "+":
                resultado = valorA.add(valorB);
                jLabelResultado.setText(" " + resultado);
                break;
            case "-":
                resultado = valorA.subtract(valorB);
                jLabelResultado.setText(" " + resultado);
                break;
            case "*":
                resultado = valorA.multiply(valorB);
                jLabelResultado.setText(" " + resultado);
                break;
            case "/":
                resultado = valorA.divide(valorB);
                jLabelResultado.setText(" " + resultado);
                break;
            default:
                break;
        }

    }

    private void acaoButtonLimpar() {
        jLabelResultado.setText("Informe valores para operação");
        jTextValorA.setText("");
        jTextValorB.setText("");

    }

}
