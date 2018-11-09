public class Unidade_de_saude {
	
	public int anodeabertura;
	public String nomeposto;
	public Endereco endereco;
	
	public int getAnodeabertura() {
		return anodeabertura;
	}
	
	public void setAnodeabertura(int anodeabertura) {
		this.anodeabertura = anodeabertura;
	}
	
	public String getNomeposto() {
		return nomeposto;
	}
	
	public void setNomeposto(String nomeposto) {
		this.nomeposto = nomeposto;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Unidade_de_saude [anodeabertura=" + anodeabertura + ", nomeposto=" + nomeposto + ", endereco="
				+ endereco + "]";
	}

	
	
}
