package br.com.java.padroesjava.builder.consulta;

public enum CondicionaisSQL {

	AND("AND"), OR("OR"), WHERE("WHERE"), ASC("ASC"), DESC("DESC"), ORDERBY("ORDER BY");

	private String descricao;

	private CondicionaisSQL(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
