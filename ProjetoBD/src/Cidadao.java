
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class Cidadao {
	
	
	public String nome;
	public Endereco endereco;
	
	@Id
	public int cpf;
	
	public int telefone;
	public String email;
	public int nsus;
	
	@Temporal(TemporalType.DATE)
	public Calendar nascimento;
    
	@OneToOne
	public Fichamento ficha;

	
	
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
	
	
	public Calendar getNascimento() {
		return nascimento;
	}

	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public String toString() {
		return "Cidadao [nome=" + nome + ", endereco=" + endereco + ", cpf=" + cpf + ", telefone=" + telefone
				+ ", email=" + email + ", nsus=" + nsus + ", nascimento=" + nascimento + "]";
	}
	
	

	public Cidadao(String nome, Endereco endereco, int cpf, int telefone, String email, int nsus, Calendar nascimento) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.nsus = nsus;
		this.nascimento = nascimento;
	}

	public Cidadao() {
		super();
		// TODO Auto-generated constructor stub
	}


	
}
