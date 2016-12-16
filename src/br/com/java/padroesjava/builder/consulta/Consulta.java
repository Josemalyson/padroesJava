package br.com.java.padroesjava.builder.consulta;

public class Consulta {

	private String select;
	private String nomeTabela;
	private String and;
	private String or;
	private String where;
	private String orderby;

	public Consulta(ConsultaBuilder builder) {
		this.select = builder.getSelect();
		this.nomeTabela = builder.getNomeTabela();
		this.and = builder.getAnd();
		this.or = builder.getOr();
		this.where = builder.getWhere();
		this.orderby = builder.getOrderby();
	}

	public String getSelect() {
		return select;
	}

	public void setSelect(String select) {
		this.select = select;
	}

	public String getNomeTabela() {
		return nomeTabela;
	}

	public void setNomeTabela(String nomeTabela) {
		this.nomeTabela = nomeTabela;
	}

	public String getAnd() {
		return and;
	}

	public void setAnd(String and) {
		this.and = and;
	}

	public String getOr() {
		return or;
	}

	public void setOr(String or) {
		this.or = or;
	}

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}

	public String getOrderby() {
		return orderby;
	}

	public void setOrderby(String orderby) {
		this.orderby = orderby;
	}

	public String construirConsulta() {
		StringBuilder consulta = new StringBuilder();
		
		consulta.append( select).append(nomeTabela);
		
		if (where != null) {
			consulta.append(where);
		}

		if (and != null && or != null) {
			consulta.append(and).append(or);
		}
		
		if (and != null && or == null) {
			consulta.append(and);
		} else if (and == null && or != null) {
			consulta.append(or);
		}
		

		if (orderby != null) {
			consulta.append(orderby);
		}

		return consulta.toString();
	}

}
