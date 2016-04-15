package br.com.java.padroesjava.factory;

public class Main {

	public static void main(String[] args) {
	
		Fabrica fabrica = new Fabrica();
		
		Mover carro = fabrica.getObterObject("carro");
		carro.mover();
		
		Mover moto = fabrica.getObterObject("moto");
		moto.mover();
	}
}
