package com.esprit.airlineClientRMI.test;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.esprit.airlineejb.entities.Agent;
import com.esprit.airlineejb.entities.Ville;
import com.esprit.airlineejb.service.PersistenceServiceRemote;

public class TestVille {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {

			Context context = new InitialContext();

			// System.out.println("salam3");

			// com.esprit.airline/com.esprit.airlineEJB/PersistenceService!com.esprit.airlineejb.service.PersistenceServiceRemote
			PersistenceServiceRemote persistenceServiceRemote = (PersistenceServiceRemote) context
					.lookup("com.esprit.airline/com.esprit.airlineEJB/PersistenceService!com.esprit.airlineejb.service.PersistenceServiceRemote");

			Ville ville = new Ville();
			ville.setIdVille("23sdsd");
			ville.setNomPays("aoooa");
			ville.setNomVille("aaa");
			persistenceServiceRemote.createVille(ville);

			Agent agent = new Agent();
			agent.setLoginAgent("admin");
			agent.setPassAgent("admin");

			persistenceServiceRemote.createAgent(agent);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
