package com.estacionamento;

import com.estacionamento.acoes.Entrar;
import com.estacionamento.acoes.Saida;

public class Estacionamento extends TelaPrincipal {

	public static void main(String[] args) {

		TelaPrincipal.gerarTela();
		PrimeiroAndar.gerarPrimeiroAndar();
		SegundoAndar.gerarSegundoAndar();
		TerceiroAndar.gerarTerceiroAndar();

		GerarPanels.criandoPanels();

		Entrar.acaoEntrada();
		Saida.acaoSaida();

	}

}
