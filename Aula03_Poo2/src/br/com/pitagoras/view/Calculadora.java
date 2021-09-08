package br.com.pitagoras.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class Calculadora {
    private final JTextField jTextFieldResultado;
    private final JLabel jLabelValorA;
    private final JLabel jLabelValorB;
    private final JLabel jLabelApenasNumeros;
    private final JLabel jLabelResultado;
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



        jLabelValorA = new JLabel("Valor A");
        jLabelValorB = new JLabel("Valor B");
        jLabelApenasNumeros = new JLabel("Digite apenas números!");
        jLabelResultado = new JLabel("Resultado");
        jTextFieldResultado = new JTextField();
        jTextValorA = new JTextField();
        jTextValorB = new JTextField();

        jButtonAdd = new JButton("+");
        jButtonSub = new JButton("-");
        jButtonMul = new JButton("*");
        jButtonDiv = new JButton("/");
        jButtonLimpar = new JButton("Limpar");


        //jLabelResultado.setBackground(new Color(255,1,1,1));
        jLabelApenasNumeros.setBounds(10,15,200,20);

        jLabelValorA.setBounds(10, 40, 50, 20);
        jTextValorA.setBounds(65, 40, 200, 20);

        jLabelValorB.setBounds(10, 80, 50, 20);
        jTextValorB.setBounds(65, 80, 200, 20);

        jLabelResultado.setBounds(10, 120, 70, 20);
        jTextFieldResultado.setBounds(70, 120, 195, 20);

        jButtonAdd.setBounds(60, 160, 50, 50);
        jButtonSub.setBounds(110, 160, 50, 50);
        jButtonMul.setBounds(160, 160, 50, 50);
        jButtonDiv.setBounds(210, 160, 50, 50);
        jButtonLimpar.setBounds(60, 220, 200, 50);

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
                        executarOperacao(actionEvent.getActionCommand());
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
        jTextValorA.setDocument(new ApenasNumero());
        jTextValorB.setDocument(new ApenasNumero());
        jFrameTelaPrincipal.add(jLabelResultado);
        jFrameTelaPrincipal.add(jTextFieldResultado);
        jFrameTelaPrincipal.add(jLabelApenasNumeros);
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
        try {
        BigDecimal valorA = new BigDecimal(jTextValorA.getText());
        BigDecimal valorB = new BigDecimal(jTextValorB.getText());
        BigDecimal resultado;


            switch (actionCommand) {
                case "+":
                    resultado = valorA.add(valorB);
                    jTextFieldResultado.setText(" " + resultado);
                    break;
                case "-":
                    resultado = valorA.subtract(valorB);
                    jTextFieldResultado.setText(" " + resultado);
                    break;
                case "*":
                    resultado = valorA.multiply(valorB);
                    jTextFieldResultado.setText(" " + resultado);
                    break;
                case "/":
                    resultado = valorA.divide(valorB);
                    jTextFieldResultado.setText(" " + resultado);
                    break;
                default:
                      break;
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"O Campo não pode ser vazio!");
            }
        }


    private void acaoButtonLimpar() {
        jTextFieldResultado.setText("Informe valores para operação");
        jTextValorA.setText("");
        jTextValorB.setText("");

    }

}
