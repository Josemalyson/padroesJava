package br.com.java.padroesjava.nullobject;

public class CriarCarrinho {

	public Carrinho criarCarrinho(Carrinho carrinho){
		if (carrinho == null) {
			return new CarrinhoNulo();
		}
		else {
			return carrinho;
		}
	}
}
