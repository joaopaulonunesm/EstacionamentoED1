package com.estacionamento;

import java.awt.Color;

import javax.swing.JPanel;

public class GerarPanels extends TelaPrincipal {

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
}
