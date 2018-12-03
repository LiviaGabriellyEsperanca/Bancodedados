 
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
	
	public Hospitais addhospitais(String nomehosp, int cappac);
	
	public void removehospitais(String diretorgeral);
	
	
}
