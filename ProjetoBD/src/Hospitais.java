import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table (name ="hospital")
public class Hospitais {

	private String nomehosp;
	private int cappac;
	private int nmedico;
	
	@Id
	@Column(name = "id_hosp")
	private Long id;
	
	private String diretorgeral;
	private String coorgeral;
	


	public String getNomehosp() {
		return nomehosp;
	}
	
	public void setNomehosp(String nomehosp) {
		this.nomehosp = nomehosp;
	}
	
	public int getCappac() {
		return cappac;
	}
	
	public void setCappac(int cappac) {
		this.cappac = cappac;
	}
	
	public int getNmedico() {
		return nmedico;
	}
	
	public void setNmedico(int nmedico) {
		this.nmedico = nmedico;
	}
	
	public String getDiretorgeral() {
		return diretorgeral;
	}
	
	public void setDiretorgeral(String diretorgeral) {
		this.diretorgeral = diretorgeral;
	}
	
	public String getCoorgeral() {
		return coorgeral;
	}
	
	public void setCoorgeral(String coorgeral) {
		this.coorgeral = coorgeral;
	}


	@Override
	public String toString() {
		return "Hospitais [nomehosp=" + nomehosp + ", cappac=" + cappac + ", nmedico=" + nmedico + ", diretorgeral="
				+ diretorgeral + ", coorgeral=" + coorgeral + "]";
	}


	
}
