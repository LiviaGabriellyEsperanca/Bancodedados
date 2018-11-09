public class Cidadao {
	
	public String nome;
	public Endereco endereco;
	public int cpf;
	public int telefone;
	public String email;
	public int nsus;
	public int nascimento;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public int getTelefone() {
		return telefone;
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getNsus() {
		return nsus;
	}
	
	public void setNsus(int nsus) {
		this.nsus = nsus;
	}
	
	public int getNascimento() {
		return nascimento;
	}
	
	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public String toString() {
		return "Cidadao [nome=" + nome + ", endereco=" + endereco + ", cpf=" + cpf + ", telefone=" + telefone
				+ ", email=" + email + ", nsus=" + nsus + ", nascimento=" + nascimento + "]";
	}
	
	

	
}
