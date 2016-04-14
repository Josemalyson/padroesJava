package br.com.java.padroesjava.strategy;

public class CalculoDiaria implements CalculoValor{

	private static final long DIA = 1440;
	private double valorDaDiaria;
	
	public CalculoDiaria(long valorDaDiaria) {
		this.valorDaDiaria = valorDaDiaria;
	}
	
	@Override
	public double calcular(long periodo, Veiculo veiculo) {
		return valorDaDiaria * Math.ceil(periodo / DIA);
	}

}
