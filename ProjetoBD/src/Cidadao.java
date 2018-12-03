
import java.util.Calendar;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "cidadao")
public class Cidadao {
	
	
	private String nome;
	private Endereco endereco;
	private String exames;
	
	@Id
	@Column(name = "id_cidadao")
	private Long cpf;
	
	@ManyToMany
	@JoinTable(
			name = "doenca_cidadao", 
			joinColumns = @JoinColumn(name = "id_cidadao"), 
			inverseJoinColumns = @JoinColumn(name = "id_doenca"))
	private Set<Doenca> diaginosticos;

	@ManyToMany
	@JoinTable(
			name = "cidadao_hospital", 
			joinColumns = @JoinColumn(name = "id_cidadao"), 
			inverseJoinColumns = @JoinColumn(name = "id_hosp"))
	private Set<Hospitais> hospitais;
	
	
	
	private int telefone;
	private String email;
	private int nsus;
	
	@Temporal(TemporalType.DATE)
	private Calendar nascimento;
     
	
	
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
	
	public String getExames() {
		return exames;
	}

	public void setExames(String exames) {
		this.exames = exames;
	}

	public Set<Hospitais> getHospitais() {
		return hospitais;
	}

	public void setHospitais(Set<Hospitais> hospitais) {
		this.hospitais = hospitais;
	}

	public Long getCpf() {
		return cpf;
	}
	
	public void setCpf(Long cpf) {
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
	
	public Set<Doenca> getDiaginosticos() {
		return diaginosticos;
	}

	public void setDiaginosticos(Set<Doenca> diaginosticos) {
		this.diaginosticos = diaginosticos;
	}

	@Override
	public String toString() {
		return "Cidadao [nome=" + nome + ", endereco=" + endereco + ", cpf=" + cpf + ", diaginosticos=" + diaginosticos
				+ ", telefone=" + telefone + ", email=" + email + ", nsus=" + nsus + ", nascimento=" + nascimento
				+ ", getNome()=" + getNome() + ", getEndereco()=" + getEndereco() + ", getCpf()=" + getCpf()
				+ ", getTelefone()=" + getTelefone() + ", getEmail()=" + getEmail() + ", getNsus()=" + getNsus()
				+ ", getNascimento()=" + getNascimento() + ", getDiaginosticos()=" + getDiaginosticos()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public Cidadao(String nome, Endereco endereco, Long cpf, int telefone, String email, int nsus, Calendar nascimento) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.nsus = nsus;
		this.nascimento = nascimento;
	}

	
	
}
