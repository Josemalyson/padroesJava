package br.com.java.padroesjava.factory;

public class Fabrica {

	public Transporte criarTransporteDoTipo(String objeto) {

		if ("carro".equalsIgnoreCase(objeto)) {
			return new Carro();
		} else if ("moto".equalsIgnoreCase(objeto)) {
			return new Moto();
		}else {
			return null;
		}

	}
}
