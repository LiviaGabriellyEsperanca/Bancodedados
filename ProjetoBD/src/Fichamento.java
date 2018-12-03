import java.util.Date;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Fichamento {
	
	@Id
	private Long id;
	
	
	private Date data;
	

	@ManyToOne
	@JoinColumn(name = "id_cidadao")
	private Cidadao pessoa;
	
	@ManyToOne 
	@JoinColumn(name = "id_doenca")
	private Doenca doenca;

	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Doenca getDoenca() {
		return doenca;
	}


	public void setDoenca(Doenca doenca) {
		this.doenca = doenca;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public Cidadao getPessoa() {
		return pessoa;
	}


	public void setPessoa(Cidadao pessoa) {
		this.pessoa = pessoa;
	}


	@Override
	public String toString() {
		return "Fichamento [data=" + data + ", pessoa=" + pessoa + "]";
	}


}
