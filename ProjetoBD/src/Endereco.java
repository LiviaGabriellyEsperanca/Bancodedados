public class Endereco {
	
	private  String cidade;
	private  String rua;
	private int numero;
	
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

	
	public Endereco(String cidade, String rua, int numero) {
		super();
		this.cidade = cidade;
		this.rua = rua;
		this.numero = numero;
	}
	
	


}
