package br.com.java.padroesjava.factory;

public class Main {

	public static void main(String[] args) {
	
		Fabrica fabrica = new Fabrica();
		
		Transporte carro = fabrica.getObterObject("carro");
		carro.mover();
		
		Transporte moto = fabrica.getObterObject("moto");
		moto.mover();
	}
}
