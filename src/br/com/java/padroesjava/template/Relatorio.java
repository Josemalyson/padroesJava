package br.com.java.padroesjava.template;

public abstract class Relatorio {

	abstract void relatorio();
	abstract void introducao();
	abstract void desenvolvimento();
	abstract void resultados();
	
	public final void montarRelatorio(){
		relatorio();
		introducao();
		desenvolvimento();
		resultados();
	}
}
