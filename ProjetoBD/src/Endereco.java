public class Endereco {
	
	public String cidade;
	public String rua;
	public int numero;
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Endereco [cidade=" + cidade + ", rua=" + rua + ", numero=" + numero + "]";
	}
	
	


}
