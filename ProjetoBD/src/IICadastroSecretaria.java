import java.util.ArrayList;

public interface IICadastroSecretaria {
	
	/**Unidade de saude
	 */
	
	public Unidade_de_saude addunidade_de_saude(int anodeabertura, String nomeposto, Endereco endereco);
	
	public void removeunidade_de_saude(String nomeposto);
	
	/**Hospitais
	 */
	
	public Hospitais addhospitais(String nomehosp, int cappac, int nmedico, String diretorgeral,String coorgeral, ArrayList<Fichamento> ficha);
	
	public void removehospitais(String diretorgeral);
	
	
}
