import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {

	public static void main(String[] args) {
		DAO<Cidadao> dao = new DAO<Cidadao>();
		Cidadao p = new Cidadao();
		p.setCpf(22l);
		p.setNome("Fernanda B.");
		dao.save(p);
		Cidadao p2 = new Cidadao();
		p2.setCpf(23l);
		p2.setNome("Livia");
		dao.save(p2);
		Cidadao find = dao.find(Cidadao.class, 22l);
		System.out.println(find.getNome());
	}
	
}
	