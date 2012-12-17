package com.esprit.airlineejb.service;

import java.util.List;

import javax.ejb.Local;

import com.esprit.airlineejb.entities.Aeroport;
import com.esprit.airlineejb.entities.Agent;
import com.esprit.airlineejb.entities.Ville;
import com.esprit.airlineejb.entities.Vol;

@Local
public interface PersistenceServiceLocal {

	// PERSISTENCE AGENT
	public void createAgent(Agent agent);

	public Agent findAgent(String loginAgent);

	// PERSISTENCE AEROPORT
	public void createAeroport(Aeroport aeroport);

	public void removeAeroport(String idAeroport);

	public Aeroport findAeroport(String idAeroport);

	public List<Aeroport> findAllAeroport();

	// PERSISTENCE VOLS
	public void createVol(Vol vol);

	public void removeVol(String idVol);

	public Vol findVol(String idVol);

	public List<Vol> findAllVols();

	// persistence VILLE
	public void createVille(Ville ville);

	public Ville findVille(String idVille);

}
