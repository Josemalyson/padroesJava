package br.com.java.padroesjava.nullobject;

public class CriarCarrinho {
	
	public static Carrinho construirCarrinho(String nomeUsuario, Integer tamanho, Double valor){
		
		if (nomeUsuario == null || tamanho == null || valor == null) {
			return new CarrinhoNulo();
		}else {
			return new CarrinhoCustomizado(nomeUsuario,tamanho, valor);
		}
	}
}
