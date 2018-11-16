import java.util.ArrayList;

public interface IICadastroSecretaria {
	
	/**Unidade de saude
	 * 
	 * @param anodeabertura
	 * @param nomeposto
	 * @param endereco
	 * @return
	 */
	
	public Unidade_de_saude addunidade_de_saude(int anodeabertura, String nomeposto, Endereco endereco);
	
	public void removeunidade_de_saude(String nomeposto);
	
	/**Hospitais
	 * 
	 * @param nomehosp
	 * @param cappac
	 * @param nmedico
	 * @param diretorgeral
	 * @param coorgeral
	 * @param ficha
	 * @return
	 */
	
	public Hospitais addhospitais(String nomehosp, int cappac, int nmedico, String diretorgeral,String coorgeral, ArrayList<Fichamento> ficha);
	
	public void removehospitais(String diretorgeral);
	
	/**Fichamento
	 * 
	 * @param diaginosticos
	 * @param exames
	 * @param pessoa
	 * @return
	 */
	
	public Fichamento addfichamento(String diaginosticos, String exames, Cidadao pessoa);
	
	public void removefichamento(String diaginosticos);
	
}
