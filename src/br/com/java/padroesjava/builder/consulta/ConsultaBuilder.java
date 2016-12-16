package br.com.java.padroesjava.builder.consulta;

public class ConsultaBuilder {

	private String select;
	private String nomeTabela;
	private String and;
	private String or;
	private String where;
	private String orderby;

	public ConsultaBuilder select() {
		this.select = "Select * from ";
		return this;
	}

	public ConsultaBuilder nomeTabela(String nomeTabela) {
		this.nomeTabela = nomeTabela;
		return this;
	}

	public ConsultaBuilder where(String campo) {

		if (campo != null && !campo.isEmpty()) {
			this.where = " " + CondicionaisSQL.WHERE.getDescricao() + " " + campo;
			return this;
		}
		return this;
	}

	public ConsultaBuilder and(String campo) {

		if (campo != null && !campo.isEmpty()) {
			this.and = " " + CondicionaisSQL.AND.getDescricao() + " " + campo;
			return this;
		}
		return this;
	}

	public ConsultaBuilder or(String campo) {

		if (campo != null && !campo.isEmpty()) {
			this.or = " " + CondicionaisSQL.OR.getDescricao() + " " + campo;
			return this;
		}
		return this;

	}

	public ConsultaBuilder orderby(CondicionaisSQL condicionaisSQL) {

		if (condicionaisSQL.getDescricao().equalsIgnoreCase(CondicionaisSQL.DESC.getDescricao())) {
			this.orderby = " " + CondicionaisSQL.ORDERBY.getDescricao() + " " + condicionaisSQL.getDescricao();
			return this;
		} else if (condicionaisSQL.getDescricao().equalsIgnoreCase(CondicionaisSQL.ASC.getDescricao())) {
			this.orderby = " " + CondicionaisSQL.ORDERBY.getDescricao() + " " + condicionaisSQL.getDescricao();
			return this;
		}
		return this;

	}

	public Consulta build() {
		return new Consulta(this);
	}

	public String getSelect() {
		return select;
	}

	public String getNomeTabela() {
		return nomeTabela;
	}

	public String getAnd() {
		return and;
	}

	public String getOr() {
		return or;
	}

	public String getWhere() {
		return where;
	}

	public String getOrderby() {
		return orderby;
	}

	public void setSelect(String select) {
		this.select = select;
	}

	public void setNomeTabela(String nomeTabela) {
		this.nomeTabela = nomeTabela;
	}

	public void setAnd(String and) {
		this.and = and;
	}

	public void setOr(String or) {
		this.or = or;
	}

	public void setWhere(String where) {
		this.where = where;
	}

	public void setOrderby(String orderby) {
		this.orderby = orderby;
	}

}
