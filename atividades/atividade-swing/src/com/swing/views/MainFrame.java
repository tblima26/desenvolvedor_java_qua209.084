package com.swing.views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class MainFrame extends JFrame {
  private CardLayout cardLayout;
  private JPanel panelCards;

  public MainFrame() {
    setTitle("Sistema");
    setSize(500, 500);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    cardLayout = new CardLayout();
    panelCards = new JPanel(cardLayout);

    JPanel pessoaPanel = new PainelPessoa();

    JPanel carroPanel = new JPanel();
    carroPanel.add(new JLabel("Tela Carro"));

    panelCards.add(pessoaPanel, "PESSOA");
    panelCards.add(carroPanel, "CARRO");

    JButton btnPessoa = new JButton("Pessoa");
    JButton btnCarro = new JButton("Carro");

    btnPessoa.addActionListener(e -> cardLayout.show(panelCards, "PESSOA"));
    btnCarro.addActionListener(e -> cardLayout.show(panelCards, "CARRO"));

    JPanel topPanel = new JPanel();
    topPanel.add(btnPessoa);
    topPanel.add(btnCarro);

    setLayout(new BorderLayout());
    add(topPanel, BorderLayout.NORTH);
    add(panelCards, BorderLayout.CENTER);

    setLocationRelativeTo(null);
    setVisible(true);
  }

}
