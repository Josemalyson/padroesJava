package br.com.java.padroesjava.builder.corpohumano;

public class Corpo {

	public static class Builder {

		private String cabeca;
		private String tronco;
		private String membrosSuperior;
		private String membrosInferior;

		public Builder(String cabeca) {
			this.cabeca = cabeca;
		}

		public Builder CorpoTronco(String tronco) {
			this.tronco = tronco;
			return this;
		}

		public Builder CorpoMembrosSuperior(String membrosSuperior) {
			this.membrosSuperior = membrosSuperior;
			return this;
		}

		public Builder CorpoMembrosInferior(String membrosInferior) {
			this.membrosInferior = membrosInferior;
			return this;
		}

		public Corpo build() {
			Corpo corpo = new Corpo();
			corpo.cabeca = this.cabeca;
			corpo.membrosInferior = this.membrosInferior;
			corpo.membrosSuperior = this.membrosSuperior;
			corpo.tronco = this.tronco;
			return corpo;

		}

		public String getCabeca() {
			return cabeca;
		}

		public String getTronco() {
			return tronco;
		}

		public String getMembrosSuperior() {
			return membrosSuperior;
		}

		public String getMembrosInferior() {
			return membrosInferior;
		}

		public void setCabeca(String cabeca) {
			this.cabeca = cabeca;
		}

		public void setTronco(String tronco) {
			this.tronco = tronco;
		}

		public void setMembrosSuperior(String membrosSuperior) {
			this.membrosSuperior = membrosSuperior;
		}

		public void setMembrosInferior(String membrosInferior) {
			this.membrosInferior = membrosInferior;
		}
	}

	private String cabeca;
	private String tronco;
	private String membrosSuperior;
	private String membrosInferior;

	private Corpo() {

	}

	public String getCabeca() {
		return cabeca;
	}

	public String getTronco() {
		return tronco;
	}

	public String getMembrosSuperior() {
		return membrosSuperior;
	}

	public String getMembrosInferior() {
		return membrosInferior;
	}

	public void setCabeca(String cabeca) {
		this.cabeca = cabeca;
	}

	public void setTronco(String tronco) {
		this.tronco = tronco;
	}

	public void setMembrosSuperior(String membrosSuperior) {
		this.membrosSuperior = membrosSuperior;
	}

	public void setMembrosInferior(String membrosInferior) {
		this.membrosInferior = membrosInferior;
	}

	@Override
	public String toString() {
		return "Corpo [cabeca=" + cabeca + ", tronco=" + tronco + ", membrosSuperior=" + membrosSuperior
				+ ", membrosInferior=" + membrosInferior + "]";
	}

}
