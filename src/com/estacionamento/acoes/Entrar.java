package com.estacionamento.acoes;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.estacionamento.visoes.PrimeiroAndar;
import com.estacionamento.visoes.SegundoAndar;
import com.estacionamento.visoes.TelaPrincipal;
import com.estacionamento.visoes.TerceiroAndar;

public class Entrar extends TelaPrincipal {

	public static void acaoEntrada() {

		btEntrou.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				sorteioEntrada();

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

					PrimeiroAndar.table1piso.getModel().setValueAt("OCUPADO", vaga, 2);
					colorirVagas[0][vaga].setBackground(Color.RED);

				} else if (piso == 1) {

					SegundoAndar.table2piso.getModel().setValueAt("OCUPADO", vaga, 2);
					colorirVagas[1][vaga + 18].setBackground(Color.RED);

				} else {

					TerceiroAndar.table3piso.getModel().setValueAt("OCUPADO", vaga, 2);
					colorirVagas[2][vaga + 36].setBackground(Color.RED);

				}

			}
		} else {

			JOptionPane.showMessageDialog(null, "Todas as vagas estão ocupadas");

		}

	}

}
