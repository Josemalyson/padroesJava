package br.com.java.padroesjava.strategy;

public class ContaEstacionamento {

	private static final int VALOR_HORA = 2;
	private static final long VALOR_DIA = 24;
	private static final long VALOR_MES = 480;
	private Veiculo veiculo;
	private CalculoValor calculoValor;
	private long periodo;

	public ContaEstacionamento(Veiculo veiculo, long periodo) {
		this.veiculo = veiculo;
		this.periodo = periodo;
	}

	public void calcularValor() {

		if (veiculo instanceof Passeio) {
			if (periodo < 720) {
				calculoValor = new CalculoHora(VALOR_HORA);
			} else if (periodo > 720 && periodo < 900) {
				calculoValor = new CalculoDiaria(VALOR_DIA);
			} else {
				calculoValor = new CalculoMes(VALOR_MES);
			}
		} else if (veiculo instanceof Carga) {
			// outras regras para veículos de carga
		}
		// outras regras para outros tipos de veículo
		
		System.out.println("O valor a pagar é de R$ "+calculoValor.calcular(periodo,veiculo));
	}


	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public long getPeriodo() {
		return periodo;
	}

	public void setPeriodo(long periodo) {
		this.periodo = periodo;
	}

}
