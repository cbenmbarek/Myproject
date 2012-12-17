package com.esprit.airlineejb.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Ville
 * 
 */
@Entity
public class Ville implements Serializable {

	private String idVille;
	private String nomVille;
	private String nomPays;

	// private List<Aeroport> listeAeroport;

	private static final long serialVersionUID = 1L;

	public Ville() {
		super();
	}

	@Id
	public String getIdVille() {
		return this.idVille;
	}

	public void setIdVille(String idVille) {
		this.idVille = idVille;
	}

	public String getNomVille() {
		return this.nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	public String getNomPays() {
		return this.nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	public Ville(String idVille, String nomVille, String nomPays) {
		super();
		this.idVille = idVille;
		this.nomVille = nomVille;
		this.nomPays = nomPays;
	}

	@Override
	public String toString() {
		return "Ville [idVille=" + idVille + ", nomVille=" + nomVille
				+ ", nomPays=" + nomPays + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idVille == null) ? 0 : idVille.hashCode());
		result = prime * result + ((nomPays == null) ? 0 : nomPays.hashCode());
		result = prime * result
				+ ((nomVille == null) ? 0 : nomVille.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ville other = (Ville) obj;
		if (idVille == null) {
			if (other.idVille != null)
				return false;
		} else if (!idVille.equals(other.idVille))
			return false;
		if (nomPays == null) {
			if (other.nomPays != null)
				return false;
		} else if (!nomPays.equals(other.nomPays))
			return false;
		if (nomVille == null) {
			if (other.nomVille != null)
				return false;
		} else if (!nomVille.equals(other.nomVille))
			return false;
		return true;
	}

	// public List<Aeroport> getListeAeroport() {
	// return listeAeroport;
	// }
	// public void setListeAeroport(List<Aeroport> listeAeroport) {
	// this.listeAeroport = listeAeroport;
	// }

}
