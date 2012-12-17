package com.esprit.airlineejb.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.esprit.airlineejb.entities.Aeroport;
import com.esprit.airlineejb.entities.Agent;
import com.esprit.airlineejb.entities.Ville;
import com.esprit.airlineejb.entities.Vol;

@Stateless
public class PersistenceService implements PersistenceServiceLocal,
		PersistenceServiceRemote {

	@PersistenceContext
	EntityManager entityManager;

	public Agent findAgent(String loginAgent) {
		return entityManager.find(Agent.class, loginAgent);
	}

	// PERSISTENCE AEROPORT
	public void createAeroport(Aeroport aeroport) {
		entityManager.persist(aeroport);
	}

	public void removeAeroport(String idAeroport) {
		entityManager.remove(entityManager.find(Aeroport.class, idAeroport));
	}

	public Aeroport findAeroport(String idAeroport) {
		return entityManager.find(Aeroport.class, idAeroport);
	}

	@SuppressWarnings("unchecked")
	public List<Aeroport> findAllAeroport() {
		Query findAll = entityManager.createQuery("SELECT a FROM Aeroport a");
		return findAll.getResultList();
	}

	public void createVol(Vol vol) {
		entityManager.persist(vol);

	}

	public void removeVol(String idVol) {
		entityManager.remove(entityManager.find(Vol.class, idVol));

	}

	public Vol findVol(String idVol) {
		return entityManager.find(Vol.class, idVol);
	}

	@SuppressWarnings("unchecked")
	public List<Vol> findAllVols() {
		Query findAll = entityManager.createQuery("SELECT v FROM Vol v");
		return findAll.getResultList();
	}

	public void createVille(Ville ville) {
		entityManager.persist(ville);

	}

	public Ville findVille(String idVille) {
		return entityManager.find(Ville.class, idVille);
	}

	// @SuppressWarnings("unchecked")
	// public List<Aeroport> findAeroportLibre(){
	// Query findAll =
	// em.createQuery("SELECT * FROM Chambre c left join fetch c.clients WHERE etat='Libre'");
	// return findAll.getResultList();
	// }

	public void createAgent(Agent agent) {
		entityManager.persist(agent);
	}

}
