package br.com.java.padroesjava.builder.corpohumano;

public class Main {

	public static void main(String[] args) {

		Corpo c = new Corpo.Builder("grande").CorpoTronco("pequeno").CorpoMembrosInferior("pernas longas")
				.CorpoMembrosSuperior("bra�os grandes").build();
		
		System.out.println(c);

	}

}
