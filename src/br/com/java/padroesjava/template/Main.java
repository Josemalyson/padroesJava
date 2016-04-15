package br.com.java.padroesjava.template;

public class Main {

	public static void main(String[] args) {
		Relatorio relatorioFinanceiro = new RelatorioFinanceiro();
		relatorioFinanceiro.montarRelatorio();

		System.out.println("                           ");
		
		Relatorio relatorioRH = new RelatorioRH();
		relatorioRH.montarRelatorio();
	}
}
