package br.com.java.padroesjava.template;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RelatorioFinanceiro extends Relatorio {

	@Override
	void relatorio() {
		System.out.println("Relatorio Financeiro " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

	}

	@Override
	void introducao() {
		System.out.println("Introdução Relatorio Financeiro");

	}

	@Override
	void desenvolvimento() {
		System.out.println("Desenvolvimento Relatorio Financeiro");

	}

	@Override
	void resultados() {
		System.out.println("Resultados Relatorio Financeiro");

	}

}
