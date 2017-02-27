package com.estacionamento;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SegundoAndar extends TelaPrincipal {

	static JLabel lb2piso = new JLabel("2º Piso");

	public static JTable table2piso = new JTable();
	static JScrollPane scroll2piso = new JScrollPane();
	static JPanel panel2piso = new JPanel();

	@SuppressWarnings("serial")
	static void gerarSegundoAndar() {

		telaMenu.add(lb2piso);
		lb2piso.setBounds(350, -75, 600, 600);
		lb2piso.setFont(new Font("Arial", Font.BOLD, 25));

		table2piso.setLayout(null);
		table2piso.revalidate();
		table2piso.setBounds(0, 0, 300, 500);
		table2piso.setModel(new DefaultTableModel(new Object[] { "Nº da Vaga", "Tipo", "Status" }, 0) {
			// bloqueando a edição das linhas
			@Override
			public boolean isCellEditable(int row, int col) {
				return false;
			}

		});

		scroll2piso.add(table2piso);
		scroll2piso.setViewportView(table2piso);
		scroll2piso.setBounds(0, 0, 200, 360);

		telaMenu.add(panel2piso);
		panel2piso.add(scroll2piso);
		panel2piso.setLayout(null);
		panel2piso.setBounds(350, 250, 200, 310);

		for (int i = 0; i < 18; i++) {
			DefaultTableModel valores = (DefaultTableModel) table2piso.getModel();
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
