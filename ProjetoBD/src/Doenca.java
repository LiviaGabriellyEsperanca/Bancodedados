import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Table(name = "doenca_hospital")
public class Doenca {
	
	@Id
	@Column(name = "id_doenca")
	private  int id;
	
	private  String doenca;
	
	@ManyToMany
	@JoinTable(
			name = "cidadao_ficha", 
			joinColumns = @JoinColumn(name = "id_doenca"), 
			inverseJoinColumns = @JoinColumn(name = "id_cidadao"))
	private Set<Cidadao> pessoa;
	

	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getDoenca() {
		return doenca;
	}

	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}

	
	
	@Override
	public String toString() {
		return "Doenca [id=" + id + ", doenca=" + doenca + ", pessoa=" + pessoa + ", getId()=" + getId()
				+ ", getDoenca()=" + getDoenca() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((doenca == null) ? 0 : doenca.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doenca other = (Doenca) obj;
		if (doenca == null) {
			if (other.doenca != null)
				return false;
		} else if (!doenca.equals(other.doenca))
			return false;
		if (id != other.id)
			return false;
		return true;
	}


}
