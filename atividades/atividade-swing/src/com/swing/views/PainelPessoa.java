package com.swing.views;

import javax.swing.*;
import java.awt.*;

public class PainelPessoa extends JPanel {
  private JTextField txtNome;
  private JTextField txtSobrenome;
  private JTextField txtCpf;
  private JTextField txtTelefone;

  public PainelPessoa() {

    setLayout(new GridBagLayout());

    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(8, 8, 8, 8);
    gbc.fill = GridBagConstraints.HORIZONTAL;

    txtNome = new JTextField(20);
    txtSobrenome = new JTextField(20);
    txtCpf = new JTextField(20);
    txtTelefone = new JTextField(20);

    JButton btnEnviar = new JButton("Enviar");
    JButton btnResetar = new JButton("Resetar");

    gbc.gridx = 0;
    gbc.gridy = 0;
    add(new JLabel("Nome:"), gbc);

    gbc.gridx = 1;
    add(txtNome, gbc);

    gbc.gridx = 0;
    gbc.gridy = 1;
    add(new JLabel("Sobrenome:"), gbc);

    gbc.gridx = 1;
    add(txtSobrenome, gbc);

    gbc.gridx = 0;
    gbc.gridy = 2;
    add(new JLabel("CPF:"), gbc);

    gbc.gridx = 1;
    add(txtCpf, gbc);

    gbc.gridx = 0;
    gbc.gridy = 3;
    add(new JLabel("Telefone:"), gbc);

    gbc.gridx = 1;
    add(txtTelefone, gbc);

    gbc.gridy = 4;
    gbc.gridx = 0;
    gbc.gridwidth = 1;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    add(btnResetar, gbc);

    gbc.gridx = 1;
    gbc.gridwidth = 2;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    add(btnEnviar, gbc);

    btnResetar.addActionListener(e -> {
      txtNome.setText("");
      txtSobrenome.setText("");
      txtCpf.setText("");
      txtTelefone.setText("");
    });

    btnEnviar.addActionListener(e -> {
      JOptionPane.showMessageDialog(this,
          "Nome: " + txtNome.getText() + "\n" +
              "Sobrenome: " + txtSobrenome.getText() + "\n" +
              "CPF: " + txtCpf.getText() + "\n" +
              "Telefone: " + txtTelefone.getText());
    });
  }
}