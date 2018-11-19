import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;


@Entity
public class Fichamento {
	
	@Id
	public int id;
	@ManyToMany
	@JoinColumn (name= "id")
	public ArrayList<Hospitais> hospitais;
	
	@ManyToMany
	@JoinColumn (name= "id")
	public ArrayList<Diaginostico> diaginost;
	
	public String exames;
	public Cidadao pessoa;

	

	public int getId() {
		return id;
	}
	
	public void setDiaginosticos(int id) {
		this.id = id;
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
		return "Fichamento [ exames=" + exames + ", pessoa=" + pessoa + "]";
	}

	public Fichamento(String diaginosticos, String exames, Cidadao pessoa) {
		super();
		this.exames = exames;
		this.pessoa = pessoa;
	}
	
	
	
	
}
