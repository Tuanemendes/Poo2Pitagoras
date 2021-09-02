package br.com.pitagoras.exemplobotao.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ExemploBotao implements ActionListener {

    private JLabel jLabelResultado;

    public ExemploBotao() {
        JFrame container = new JFrame("Exemplo de uso do botão");


        container.setLayout(new FlowLayout());

        container.setSize(200, 90);
        container.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);// define o que acontece ao clicar em fechar
        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jButtonUp = new JButton("Up");
        JButton jButtonDown = new JButton("Down");

        JButton jButtonFechar = new JButton("Fechar");
        JButton jButtonLimpar = new JButton("Limpar");


        jButtonUp.addActionListener(this);
        jButtonDown.addActionListener(this);

        jButtonFechar.addActionListener(this);
        jButtonLimpar.addActionListener(this);

        container.add(jButtonUp);
        container.add(jButtonDown);



        jLabelResultado = new JLabel("Por favor, pressione um botão");

        container.add(jLabelResultado);

        container.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getActionCommand().equals("Up"))
            jLabelResultado.setText("Você pressionou o botão UP");
        else
            jLabelResultado.setText("Você pressionou o botão DOWN");
    }
    //@Override
    //public void windowClosing(WindowEvent e) {
    //    super.windowClosing(e);

    //System.exit(0);
    //}

}
