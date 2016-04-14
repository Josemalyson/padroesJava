package br.com.java.padroesjava.strategy;

public class CalculoHora implements CalculoValor{

	private static final long HORA = 60;
	private double valorDaHora;
	
	public CalculoHora(long valorDaHora) {
		this.valorDaHora = valorDaHora;
	}
	
	@Override
	public double calcular(long periodo, Veiculo veiculo) {
		return valorDaHora * Math.ceil(periodo / HORA);
	}

}
