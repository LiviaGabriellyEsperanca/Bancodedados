import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Secretaria_de_saude {
	
	private Endereco endereco;
	
	@Id
	@Column(name = "id_coord")
	private String coordenador;
	
	@OneToMany
	@JoinColumn(name="id_hosp")
	private Hospitais hospital;
	
	@OneToMany
	@JoinColumn(name = "id_USB")
	private Unidade_de_saude UDS;
	
	
	private String nfuncionarios;
	
	
	
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String getCoordenador() {
		return coordenador;
	}
	
	public void setCoordenador(String coordenador) {
		this.coordenador = coordenador;
	}
	
	public String getNfuncionarios() {
		return nfuncionarios;
	}
	
	public void setNfuncionarios(String nfuncionarios) {
		this.nfuncionarios = nfuncionarios;
	}
	

	@Override
	public String toString() {
		return "Secretaria_de_saude [endereco=" + endereco + ", coordenador=" + coordenador + ", nfuncionarios="
				+ nfuncionarios + " ]";
	}

	public Secretaria_de_saude(Endereco endereco, String coordenador, String nfuncionarios,
			ArrayList<Hospitais> hospital, ArrayList<Unidade_de_saude> ubs) {
		super();
		this.endereco = endereco;
		this.coordenador = coordenador;
		this.nfuncionarios = nfuncionarios;
		
	}
	

}
