package br.com.java.padroesjava.nullobject;

public class CarrinhoNulo extends Carrinho {

	@Override
	public String getNomeUsuario() {
		return "vazio";
	}
	
	@Override
	public Integer getTamanho() {
		return 0;
	}
	
	@Override
	public Double getValor() {
		return 0.0;
	}

}
