package com.estacionamento.acoes;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.estacionamento.visoes.PrimeiroAndar;
import com.estacionamento.visoes.SegundoAndar;
import com.estacionamento.visoes.TelaPrincipal;
import com.estacionamento.visoes.TerceiroAndar;

public class Sair extends TelaPrincipal {

	public static void acaoSaida() {

		btSaiu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				sorteioSaida();

			}
		});
	}

	public static void sorteioSaida() {

		int piso = (int) (Math.random() * 3);
		int vaga = (int) (Math.random() * 18);

		if (contador < 54) {
			if (vagas[piso][vaga] == 0) {

				sorteioSaida();

			} else if (vagas[piso][vaga] == 1) {
				vagas[piso][vaga] = 0;
				contador = contador + 1;

				lbContador.setText("Vagas Livres: " + contador + " Vagas Ocupadas: " + (diferenca - contador));

				if (piso == 0) {

					PrimeiroAndar.table1piso.getModel().setValueAt("LIVRE", vaga, 2);
					colorirVagas[0][vaga].setBackground(Color.GREEN);

				} else if (piso == 1) {

					SegundoAndar.table2piso.getModel().setValueAt("LIVRE", vaga, 2);
					colorirVagas[1][vaga + 18].setBackground(Color.GREEN);

				} else {

					TerceiroAndar.table3piso.getModel().setValueAt("LIVRE", vaga, 2);
					colorirVagas[2][vaga + 36].setBackground(Color.GREEN);

				}

			}
		} else {

			JOptionPane.showMessageDialog(null, "Todas as vagas estão livres");

		}

	}

}
