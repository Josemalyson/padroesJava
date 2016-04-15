package br.com.java.padroesjava.nullobject;

public class Main {

	public static void main(String[] args) {


		Carrinho carrinho = CriarCarrinho.construirCarrinho("josemalyson", 1, 1.0);
		
		Carrinho carrinho2 = CriarCarrinho.construirCarrinho(null, null, null);

		System.out.println(carrinho.getNomeUsuario() +" "+ carrinho.getTamanho() +" "+ carrinho.getValor());
		System.out.println(carrinho2.getNomeUsuario() +" "+ carrinho2.getTamanho() +" "+ carrinho2.getValor());
		

	}

}
