import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class estacionamento {

	static JFrame telaMenu = new JFrame("Estacionamento");

	static JLabel lbEstacionamento = new JLabel("Controle de Estacionamento");
	static JLabel lb1piso = new JLabel("1º Piso");
	static JLabel lb2piso = new JLabel("2º Piso");
	static JLabel lb3piso = new JLabel("3º Piso");

	static JButton btEntrou = new JButton("Entrada");
	static JButton btSaiu = new JButton("Saida");

	static JTable table1piso = new JTable();
	static JScrollPane scroll1piso = new JScrollPane();
	static JPanel panel1piso = new JPanel();

	static JTable table2piso = new JTable();
	static JScrollPane scroll2piso = new JScrollPane();
	static JPanel panel2piso = new JPanel();

	static JTable table3piso = new JTable();
	static JScrollPane scroll3piso = new JScrollPane();
	static JPanel panel3piso = new JPanel();

	static int[][] vagas = new int[3][18];
	static JPanel[][] colorirVagas = new JPanel[3][54];

	static int contador = 54;
	static int diferenca = 54;
	static JLabel lbContador = new JLabel("Vagas Livres: " + contador + " Vagas Ocupadas: " + (diferenca - contador));
	static String tipoVaga;

	public static void main(String[] args) {

		janelaMenu();
		acaoEntrada();
		acaoSaida();

	}

	static void janelaMenu() {

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

		componentesMenu();

	}

	static void componentesMenu() {

		telaMenu.add(btEntrou);
		btEntrou.setBounds(230, 110, 200, 70);

		telaMenu.add(btSaiu);
		btSaiu.setBounds(480, 110, 200, 70);

		telaMenu.add(lbContador);
		lbContador.setBounds(280, 300, 600, 600);
		lbContador.setFont(new Font("Arial", Font.BOLD, 20));

		primeiroPiso();
		segundoPiso();
		terceiroPiso();
		criandoPanels();

	}

	static void criandoPanels() {

		int pos0 = 271;
		int pos1 = 271;
		int pos2 = 271;

		for (int i = 0; i < 54; i++) {

			if (i <= 17) {

				colorirVagas[0][i] = new JPanel();
				telaMenu.add(colorirVagas[0][i]);
				colorirVagas[0][i].setBounds(85, pos0, 15, 15);
				colorirVagas[0][i].setBackground(Color.GREEN);
				pos0 = pos0 + 16;

			} else if (i > 17 && i <= 35) {

				colorirVagas[1][i] = new JPanel();
				telaMenu.add(colorirVagas[1][i]);
				colorirVagas[1][i].setBounds(335, pos1, 15, 15);
				colorirVagas[1][i].setBackground(Color.GREEN);
				pos1 = pos1 + 16;

			} else {

				colorirVagas[2][i] = new JPanel();
				telaMenu.add(colorirVagas[2][i]);
				colorirVagas[2][i].setBounds(585, pos2, 15, 15);
				colorirVagas[2][i].setBackground(Color.GREEN);
				pos2 = pos2 + 16;

			}

		}

	}

	@SuppressWarnings("serial")
	static void primeiroPiso() {

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

	@SuppressWarnings("serial")
	static void segundoPiso() {

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

	@SuppressWarnings("serial")
	static void terceiroPiso() {

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

	static void acaoEntrada() {

		btEntrou.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				sorteioEntrada();

			}
		});
	}

	static void acaoSaida() {

		btSaiu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				sorteioSaida();

			}
		});
	}

	static void sorteioEntrada() {

		int piso = (int) (Math.random() * 3);
		int vaga = (int) (Math.random() * 18);

		if (contador > 0) {
			if (vagas[piso][vaga] == 1) {

				sorteioEntrada();

			} else {
				vagas[piso][vaga] = 1;
				contador = contador - 1;
				
				lbContador.setText("Vagas Livres: " + contador + " Vagas Ocupadas: " + (diferenca - contador)); 

				if (piso == 0) {

					table1piso.getModel().setValueAt("OCUPADO", vaga, 2);
					colorirVagas[0][vaga].setBackground(Color.RED);

				} else if (piso == 1) {

					table2piso.getModel().setValueAt("OCUPADO", vaga, 2);
					colorirVagas[1][vaga+18].setBackground(Color.RED);

				} else {

					table3piso.getModel().setValueAt("OCUPADO", vaga, 2);
					colorirVagas[2][vaga+36].setBackground(Color.RED);

				}

			}
		} else {

			JOptionPane.showMessageDialog(null, "Todas as vagas estão ocupadas");

		}

	}

	static void sorteioSaida() {

		int piso = (int) (Math.random() * 3);
		int vaga = (int) (Math.random() * 18);

		if (contador < 54) {
			if (vagas[piso][vaga] == 0) {

				sorteioSaida();

			} else if (vagas[piso][vaga] == 1) {
				JOptionPane.showMessageDialog(null, "Vaga Liberada");
				vagas[piso][vaga] = 0;
				contador = contador + 1;
				
				lbContador.setText("Vagas Livres: " + contador + " Vagas Ocupadas: " + (diferenca - contador)); 

				if (piso == 0) {

					table1piso.getModel().setValueAt("LIVRE", vaga, 2);
					colorirVagas[0][vaga].setBackground(Color.GREEN);

				} else if (piso == 1) {

					table2piso.getModel().setValueAt("LIVRE", vaga, 2);
					colorirVagas[1][vaga+18].setBackground(Color.GREEN);

				} else {

					table3piso.getModel().setValueAt("LIVRE", vaga, 2);
					colorirVagas[2][vaga+36].setBackground(Color.GREEN);

				}

			}
		} else {

			JOptionPane.showMessageDialog(null, "Todas as vagas estão livres");

		}

	}

}
