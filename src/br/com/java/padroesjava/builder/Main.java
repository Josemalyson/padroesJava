package br.com.java.padroesjava.builder;

public class Main {

	public static void main(String[] args) {

		Consulta consulta = new ConsultaBuilder().select().nomeTabela("TB_STATUS").build();
		System.out.println(consulta.construirConsulta());

		Consulta consulta2 = new ConsultaBuilder().select().nomeTabela("TB_STATUS").where("id = 1").build();
		System.out.println(consulta2.construirConsulta());

		Consulta consulta3 = new ConsultaBuilder().select().nomeTabela("TB_STATUS").where("id = 1")
				.and("descricao = 'CADASTRADA'").build();
		System.out.println(consulta3.construirConsulta());

		Consulta consulta4 = new ConsultaBuilder().select().nomeTabela("TB_STATUS").where("id = 1")
				.and("descricao = 'CADASTRADA'").or("descricao = 'CERTIDÃO EXPIRADA'").build();
		System.out.println(consulta4.construirConsulta());

		Consulta consulta5 = new ConsultaBuilder().select().nomeTabela("TB_STATUS").where("id = 1")
				.and("descricao = 'CADASTRADA'").or("descricao = 'CERTIDÃO EXPIRADA'").orderby(CondicionaisSQL.ASC)
				.build();
		System.out.println(consulta5.construirConsulta());
	}

}
