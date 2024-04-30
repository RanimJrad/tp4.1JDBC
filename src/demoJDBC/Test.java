package demoJDBC;

import java.util.List;

import JDBCProjet.beans.Client;
import JDBCProjet.connexion.Connexion;
import JDBCProjet.service.ClientService;

public class Test {

	public static void main(String[] args) {
		Connexion.getConn();
		
		ClientService cs = new ClientService ();
		cs.create(new Client("Sami","jrad"));
		List<Client> l = cs.findAll();
		
		for (Client lc :l) {
			System.out.println(lc.toString());
		}
		
		Client c=cs.findById(2);
		System.out.println(c.toString());
		
		cs.delete(new Client(4,"sami","jrad"));
		
		cs.update(new Client(3,"rami","jrad"));
	
		
	}

}
