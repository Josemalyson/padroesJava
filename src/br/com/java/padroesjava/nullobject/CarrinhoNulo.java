package br.com.java.padroesjava.nullobject;

public class CarrinhoNulo extends Carrinho {

	public String getNomeUsuario() {

		if (super.getNomeUsuario() == null) {
			return "";
		}

		return super.getNomeUsuario();
	}

	public Integer getTamanho() {

		if (super.getTamanho() == null) {
			return 0;
		}
		return super.getTamanho();
	}

	public Double getValor() {
		if (super.getValor() == null) {
			return 0.0;
		}

		return super.getValor();
	}

}
