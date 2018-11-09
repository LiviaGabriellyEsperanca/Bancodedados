import java.util.ArrayList;

public class Hospitais {

	public String nomehosp;
	public int cappac;
	public int nmedico;
	public String diretorgeral;
	public String coorgeral;
	public ArrayList<Fichamento> ficha;
	
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
	
	
	

	
}
