package com.estacionamento;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaPrincipal {
	
	static JFrame telaMenu = new JFrame("Estacionamento");
	static JLabel lbEstacionamento = new JLabel("Controle de Estacionamento");
	protected static JButton btEntrou = new JButton("Entrada");
	protected static JButton btSaiu = new JButton("Saida");
	protected static int contador = 54;
	protected static int diferenca = 54;
	protected static JLabel lbContador = new JLabel("Vagas Livres: " + contador + " Vagas Ocupadas: " + (diferenca - contador));
	protected static int[][] vagas = new int[3][18];
	protected static JPanel[][] colorirVagas = new JPanel[3][54];
	static String tipoVaga;
	
	static public void gerarTela() {
		
		telaMenu.setLayout(null);
		telaMenu.setSize(900, 700);
		telaMenu.getContentPane().setBackground(Color.WHITE);
		telaMenu.setResizable(false);
		telaMenu.setLocationRelativeTo(null);
		telaMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaMenu.setVisible(true);
		
		telaMenu.add(lbEstacionamento);
		lbEstacionamento.setBounds(245, -250, 600, 600);
		lbEstacionamento.setFont(new Font("Arial", Font.BOLD, 30));
		
		telaMenu.add(btEntrou);
		btEntrou.setBounds(230, 110, 200, 70);
		
		telaMenu.add(btSaiu);
		btSaiu.setBounds(480, 110, 200, 70);
		
		telaMenu.add(lbContador);
		lbContador.setBounds(280, 300, 600, 600);
		lbContador.setFont(new Font("Arial", Font.BOLD, 20));
	}

}
