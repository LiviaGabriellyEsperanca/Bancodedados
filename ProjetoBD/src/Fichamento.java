import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Fichamento {
	
	@Id
	public String diaginosticos;
	
	public String exames;
	public Cidadao pessoa;

	
	

	public String getDiaginosticos() {
		return diaginosticos;
	}
	
	public void setDiaginosticos(String diaginosticos) {
		this.diaginosticos = diaginosticos;
	}
	
	public String getExames() {
		return exames;
	}
	
	public void setExames(String exames) {
		this.exames = exames;
	}
	
	public Cidadao getPessoa() {
		return pessoa;
	}
	
	public void setPessoa(Cidadao pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return "Fichamento [diaginosticos=" + diaginosticos + ", exames=" + exames + ", pessoa=" + pessoa + "]";
	}

	public Fichamento(String diaginosticos, String exames, Cidadao pessoa) {
		super();
		this.diaginosticos = diaginosticos;
		this.exames = exames;
		this.pessoa = pessoa;
	}
	
	
	
	
}
