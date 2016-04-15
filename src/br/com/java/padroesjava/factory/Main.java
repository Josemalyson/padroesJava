package br.com.java.padroesjava.factory;

public class Main {

	public static void main(String[] args) {
		MoverFabrica fabrica = new MoverFabrica();
		Mover carro = fabrica.getObterObject("carro");
		carro.andar();
		Mover moto = fabrica.getObterObject("moto");
		moto.andar();
	}
}
