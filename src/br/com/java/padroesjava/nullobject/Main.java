package br.com.java.padroesjava.nullobject;

public class Main {

	public static void main(String[] args) {

		CriarCarrinho criarCarrinho = new CriarCarrinho();
		
		Carrinho carrinho = null;
		carrinho = criarCarrinho.criarCarrinho(carrinho);
		carrinho.setNomeUsuario("asdjksajdgh");
		System.out.println(carrinho.getNomeUsuario() + " " + carrinho.getTamanho() + " " + carrinho.getValor());
		
		Carrinho carrinho2 = new Carrinho(1.0,1,"Josemalyson");
		criarCarrinho.criarCarrinho(carrinho2);
		System.out.println(carrinho2.getNomeUsuario() + " " + carrinho2.getTamanho() + " " + carrinho2.getValor());
		
	}

}
