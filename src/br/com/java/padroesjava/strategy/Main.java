package br.com.java.padroesjava.strategy;

public class Main {

	public static void main(String[] args) {

		Veiculo passeio = new Passeio();
		passeio.setCor("vermelho");
		passeio.setMarca("Gol");
		passeio.setPlaca("mxj - 1234");
		
		long periodoHora = 1;
		
		ContaEstacionamento contaEstacionamento = new ContaEstacionamento(passeio,periodoHora);
		contaEstacionamento.calcularValor();
	}

}
