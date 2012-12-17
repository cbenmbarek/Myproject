package com.esprit.airlineClientRMI.test;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.esprit.airlineejb.entities.Aeroport;
import com.esprit.airlineejb.entities.Agent;
import com.esprit.airlineejb.entities.Escale;
import com.esprit.airlineejb.entities.Ville;
import com.esprit.airlineejb.service.PersistenceServiceRemote;

public class TestInitDB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();

			PersistenceServiceRemote persistenceServiceRemote = (PersistenceServiceRemote) context
					.lookup("com.esprit.airline/com.esprit.airlineEJB/PersistenceService!com.esprit.airlineejb.service.PersistenceServiceRemote");

			Aeroport aeroport = new Aeroport();
			aeroport.setIdAeroport("air_p_tun");
			aeroport.setNomAeroport("carthage");

			Aeroport aeroport2 = new Aeroport();
			aeroport2.setIdAeroport("air_p_mar");
			aeroport2.setNomAeroport("marseille");

			Aeroport aeroport3 = new Aeroport();
			aeroport3.setIdAeroport("air_p_qub");
			aeroport3.setNomAeroport("quebec");

			persistenceServiceRemote.createAeroport(aeroport);
			persistenceServiceRemote.createAeroport(aeroport2);
			persistenceServiceRemote.createAeroport(aeroport3);

			Ville ville = new Ville();
			ville.setIdVille("tun");
			ville.setNomVille("tunis");

			Ville ville2 = new Ville();
			ville2.setIdVille("fr");
			ville2.setNomVille("marseille");

			Ville ville3 = new Ville();
			ville3.setIdVille("qub");
			ville3.setNomVille("quebec");

			persistenceServiceRemote.createVille(ville);
			persistenceServiceRemote.createVille(ville2);
			persistenceServiceRemote.createVille(ville3);

			Agent agent = new Agent();
			agent.setLoginAgent("admin");
			agent.setPassAgent("admin");

			persistenceServiceRemote.createAgent(agent);
			
			

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
