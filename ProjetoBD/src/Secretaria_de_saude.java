import java.util.ArrayList;

public class Secretaria_de_saude {
	
	public Endereco endereco;
	public String coordenador;
	public String nfuncionarios;
	public ArrayList<Hospitais> hospital;
	public ArrayList<Unidade_de_saude> ubs;
	
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
	
	public ArrayList<Hospitais> getHospital() {
		return hospital;
	}
	
	public void setHospital(ArrayList<Hospitais> hospital) {
		this.hospital = hospital;
	}
	
	public ArrayList<Unidade_de_saude> getUbs() {
		return ubs;
	}
	
	public void setUbs(ArrayList<Unidade_de_saude> ubs) {
		this.ubs = ubs;
	}

	@Override
	public String toString() {
		return "Secretaria_de_saude [endereco=" + endereco + ", coordenador=" + coordenador + ", nfuncionarios="
				+ nfuncionarios + ", hospital=" + hospital + ", ubs=" + ubs + "]";
	}
	
	

}
