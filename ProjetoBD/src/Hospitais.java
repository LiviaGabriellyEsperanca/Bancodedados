import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;



@Entity
public class Hospitais {

	public String nomehosp;
	public int cappac;
	public int nmedico;
	
	@Id
	public String diretorgeral;
	
	public String coorgeral;
	


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
	
	public ArrayList<Fichamento> getFicha() {
		return ficha;
	}
	
	public void setFicha(ArrayList<Fichamento> ficha) {
		this.ficha = ficha;
	}

	@Override
	public String toString() {
		return "Hospitais [nomehosp=" + nomehosp + ", cappac=" + cappac + ", nmedico=" + nmedico + ", diretorgeral="
				+ diretorgeral + ", coorgeral=" + coorgeral + ", ficha=" + ficha + "]";
	}

	public Hospitais(String nomehosp, int cappac, int nmedico, String diretorgeral, String coorgeral,
			ArrayList<Fichamento> ficha) {
		super();
		this.nomehosp = nomehosp;
		this.cappac = cappac;
		this.nmedico = nmedico;
		this.diretorgeral = diretorgeral;
		this.coorgeral = coorgeral;
		this.ficha = ficha;
	}

	
}
