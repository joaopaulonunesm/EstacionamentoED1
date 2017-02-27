package com.estacionamento;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TerceiroAndar extends TelaPrincipal {

	static JLabel lb3piso = new JLabel("3º Piso");

	public static JTable table3piso = new JTable();
	static JScrollPane scroll3piso = new JScrollPane();
	static JPanel panel3piso = new JPanel();

	@SuppressWarnings("serial")
	static void gerarTerceiroAndar() {

		telaMenu.add(lb3piso);
		lb3piso.setBounds(600, -75, 600, 600);
		lb3piso.setFont(new Font("Arial", Font.BOLD, 25));

		table3piso.setLayout(null);
		table3piso.revalidate();
		table3piso.setBounds(0, 0, 300, 500);
		table3piso.setModel(new DefaultTableModel(new Object[] { "Nº da Vaga", "Tipo", "Status" }, 0) {
			// bloqueando a edição das linhas
			@Override
			public boolean isCellEditable(int row, int col) {
				return false;
			}

		});

		scroll3piso.add(table3piso);
		scroll3piso.setViewportView(table3piso);
		scroll3piso.setBounds(0, 0, 200, 360);

		telaMenu.add(panel3piso);
		panel3piso.add(scroll3piso);
		panel3piso.setLayout(null);
		panel3piso.setBounds(600, 250, 200, 310);

		for (int i = 0; i < 18; i++) {
			DefaultTableModel valores = (DefaultTableModel) table3piso.getModel();
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
