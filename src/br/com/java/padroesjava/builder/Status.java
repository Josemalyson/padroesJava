package br.com.java.padroesjava.builder;

public enum Status {

	CADASTRADA(1L, "CADASTRADA"), PENDENTE(2L, "PENDENTE"), EM_ANALISE(3L, "EM ANÁLISE"), ANALISADA_NEGATIVA(4L,
			"ANALISADA NEGATIVA"), ANALISADA_POSITIVA(5L, "ANALISADA POSITIVA"), SOLICITACAO_EXPIRADA(6L,
					"SOLICITAÇÃO EXPIRADA"), CERTIDAO_EXPIRADA(7L,
							"CERTIDÃO EXPIRADA"), ANALISE_CANCELADA(8L, "ANÁLISE CANCELADA"), EXCLUIDA(9L, "EXCLUÍDA");

	private long id;
	private String descricao;

	private Status(long id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

}
