package com.estacionamento;

import com.estacionamento.acoes.Entrar;
import com.estacionamento.acoes.Sair;
import com.estacionamento.visoes.PanelsDasVagas;
import com.estacionamento.visoes.PrimeiroAndar;
import com.estacionamento.visoes.SegundoAndar;
import com.estacionamento.visoes.TelaPrincipal;
import com.estacionamento.visoes.TerceiroAndar;

public class Estacionamento extends TelaPrincipal {

	public static void main(String[] args) {

		TelaPrincipal.gerarTela();

		PrimeiroAndar.gerarPrimeiroAndar();
		SegundoAndar.gerarSegundoAndar();
		TerceiroAndar.gerarTerceiroAndar();

		PanelsDasVagas.gerarPanelsDasVagas();

		Entrar.acaoEntrada();
		Sair.acaoSaida();

	}

}
