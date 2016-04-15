package br.com.java.padroesjava.nullobject;

public class CarrinhoCustomizado extends Carrinho {

	public CarrinhoCustomizado(String nomeUsuario, Integer tamanho, Double valor) {
		this.setNomeUsuario(nomeUsuario);
		this.setTamanho(tamanho);
		this.setValor(valor);
	}

	@Override
	public String getNomeUsuario() {
		return super.getNomeUsuario();
	}

	@Override
	public Integer getTamanho() {
		return super.getTamanho();
	}

	@Override
	public Double getValor() {
		return super.getValor();
	}
}
