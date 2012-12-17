package com.esprit.airlineClientRMI.test;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.esprit.airlineejb.entities.Aeroport;
import com.esprit.airlineejb.service.PersistenceServiceRemote;

public class TestAerport {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {

			Context context = new InitialContext();

			PersistenceServiceRemote persistenceServiceRemote = (PersistenceServiceRemote) context
					.lookup("com.esprit.airline/com.esprit.airlineEJB/PersistenceService!com.esprit.airlineejb.service.PersistenceServiceRemote");

			Aeroport aeroport = new Aeroport();
			aeroport.setIdAeroport("AIR_P_UAS");
			aeroport.setNomAeroport("United Arab States");

			// Ville ville = persistenceServiceRemote.findVille("12");
			// aeroport.setVille(ville);
			// aeroport.setListeEscales(null);
			// persistenceServiceRemote.createAeroport(aeroport);
			//
			// Agent agent = new Agent();
			// agent.setLoginAgent("a");
			// agent.setPassAgent("a");

			persistenceServiceRemote.createAeroport(aeroport);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
