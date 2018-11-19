import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Unidade_de_saude {
	
	public int anodeabertura;
	
	@Id
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

	public Unidade_de_saude(int anodeabertura, String nomeposto, Endereco endereco) {
		super();
		this.anodeabertura = anodeabertura;
		this.nomeposto = nomeposto;
		this.endereco = endereco;
	}

	
	
}
