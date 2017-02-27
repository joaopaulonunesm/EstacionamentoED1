package com.estacionamento.visoes;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PrimeiroAndar extends TelaPrincipal {

	static JLabel lb1piso = new JLabel("1º Piso");

	public static JTable table1piso = new JTable();
	static JScrollPane scroll1piso = new JScrollPane();
	static JPanel panel1piso = new JPanel();

	@SuppressWarnings("serial")
	public
	static void gerarPrimeiroAndar() {

		telaMenu.add(lb1piso);
		lb1piso.setBounds(100, -75, 600, 600);
		lb1piso.setFont(new Font("Arial", Font.BOLD, 25));

		table1piso.setLayout(null);
		table1piso.revalidate();
		table1piso.setBounds(0, 0, 300, 500);
		table1piso.setModel(new DefaultTableModel(new Object[] { "Nº da Vaga", "Tipo", "Status" }, 0) {
			// bloqueando a edição das linhas
			@Override
			public boolean isCellEditable(int row, int col) {
				return false;
			}

		});

		scroll1piso.add(table1piso);
		scroll1piso.setViewportView(table1piso);
		scroll1piso.setBounds(0, 0, 200, 360);

		telaMenu.add(panel1piso);
		panel1piso.add(scroll1piso);
		panel1piso.setLayout(null);
		panel1piso.setBounds(100, 250, 200, 310);

		for (int i = 0; i < 18; i++) {
			DefaultTableModel valores = (DefaultTableModel) table1piso.getModel();
			if (i < 3) {
				valores.addRow(new Object[] { (i + 1), "ESPECIAL", "LIVRE" });
			} else if (i >= 3 && i <= 7) {
				valores.addRow(new Object[] { (i + 1), "MOTO", "LIVRE" });
			} else {
				valores.addRow(new Object[] { (i + 1), "CARRO", "LIVRE" });
			}

		}

	}

}
