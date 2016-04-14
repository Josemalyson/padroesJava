package br.com.java.padroesjava.strategy;

public class CalculoMes implements CalculoValor{

	private static final long MES = 43830;
	private double valorMes;
	
	public CalculoMes(long valorMes) {
		this.valorMes = valorMes;
	}
	
	@Override
	public double calcular(long periodo, Veiculo veiculo) {
		return valorMes * Math.ceil(periodo / MES);
	}

}
