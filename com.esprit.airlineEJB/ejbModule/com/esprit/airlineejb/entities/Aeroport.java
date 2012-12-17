package com.esprit.airlineejb.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Aeroport
 * 
 */
@Entity
public class Aeroport implements Serializable {

	private String idAeroport;
	private String nomAeroport;

	// private List<Vol> listeDeparts;
	// private List<Vol> listeArrivees;
	private List<Escale> listeEscales;

	private Ville ville;

	private static final long serialVersionUID = 1L;

	public Aeroport() {

	}

	@Id
	public String getIdAeroport() {
		return this.idAeroport;
	}

	public void setIdAeroport(String idAeroport) {
		this.idAeroport = idAeroport;
	}

	public String getNomAeroport() {
		return this.nomAeroport;
	}

	public void setNomAeroport(String nomAeroport) {
		this.nomAeroport = nomAeroport;
	}

	@OneToMany(mappedBy = "aeroport")
	public List<Escale> getListeEscales() {
		return listeEscales;
	}

	public void setListeEscales(List<Escale> listeEscales) {
		this.listeEscales = listeEscales;
	}

	@ManyToOne
	@JoinColumn(name = "idVille", referencedColumnName = "idVille")
	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public Aeroport(String idAeroport, String nomAeroport,
			List<Escale> listeEscales, Ville ville) {
		super();
		this.idAeroport = idAeroport;
		this.nomAeroport = nomAeroport;
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Aeroport [idAeroport=" + idAeroport + ", nomAeroport="
				+ nomAeroport + ", ville=" + ville + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idAeroport == null) ? 0 : idAeroport.hashCode());
		result = prime * result
				+ ((listeEscales == null) ? 0 : listeEscales.hashCode());
		result = prime * result
				+ ((nomAeroport == null) ? 0 : nomAeroport.hashCode());
		result = prime * result + ((ville == null) ? 0 : ville.hashCode());
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
		Aeroport other = (Aeroport) obj;
		if (idAeroport == null) {
			if (other.idAeroport != null)
				return false;
		} else if (!idAeroport.equals(other.idAeroport))
			return false;
		if (listeEscales == null) {
			if (other.listeEscales != null)
				return false;
		} else if (!listeEscales.equals(other.listeEscales))
			return false;
		if (nomAeroport == null) {
			if (other.nomAeroport != null)
				return false;
		} else if (!nomAeroport.equals(other.nomAeroport))
			return false;
		if (ville == null) {
			if (other.ville != null)
				return false;
		} else if (!ville.equals(other.ville))
			return false;
		return true;
	}

}
