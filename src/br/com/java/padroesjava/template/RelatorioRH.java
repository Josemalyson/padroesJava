package br.com.java.padroesjava.template;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RelatorioRH extends Relatorio {

	@Override
	void relatorio() {
		System.out.println("Relatorio RH " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

	}

	@Override
	void introducao() {
		System.out.println("Introdução Relatorio RH");

	}

	@Override
	void desenvolvimento() {
		System.out.println("Desenvolvimento Relatorio RH");

	}

	@Override
	void resultados() {
		System.out.println("Resultados Relatorio RH");

	}

}
