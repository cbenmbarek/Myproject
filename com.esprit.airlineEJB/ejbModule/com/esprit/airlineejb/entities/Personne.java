package com.esprit.airlineejb.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Entity implementation class for Entity: Personne
 * 
 */
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Personne implements Serializable {

	private String cinPersonne;
	private String nomPersonne;
	private String prenomPersonne;

	private static final long serialVersionUID = 1L;

	public Personne() {
		super();
	}

	public Personne(String cinPersonne, String nomPersonne,
			String prenomPersonne) {
		super();
		this.cinPersonne = cinPersonne;
		this.nomPersonne = nomPersonne;
		this.prenomPersonne = prenomPersonne;
	}

	@Id
	public String getCinPersonne() {
		return this.cinPersonne;
	}

	public void setCinPersonne(String cinPersonne) {
		this.cinPersonne = cinPersonne;
	}

	public String getNomPersonne() {
		return this.nomPersonne;
	}

	public void setNomPersonne(String nomPersonne) {
		this.nomPersonne = nomPersonne;
	}

	public String getPrenomPersonne() {
		return this.prenomPersonne;
	}

	public void setPrenomPersonne(String prenomPersonne) {
		this.prenomPersonne = prenomPersonne;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cinPersonne == null) ? 0 : cinPersonne.hashCode());
		result = prime * result
				+ ((nomPersonne == null) ? 0 : nomPersonne.hashCode());
		result = prime * result
				+ ((prenomPersonne == null) ? 0 : prenomPersonne.hashCode());
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
		Personne other = (Personne) obj;
		if (cinPersonne == null) {
			if (other.cinPersonne != null)
				return false;
		} else if (!cinPersonne.equals(other.cinPersonne))
			return false;
		if (nomPersonne == null) {
			if (other.nomPersonne != null)
				return false;
		} else if (!nomPersonne.equals(other.nomPersonne))
			return false;
		if (prenomPersonne == null) {
			if (other.prenomPersonne != null)
				return false;
		} else if (!prenomPersonne.equals(other.prenomPersonne))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Personne [cinPersonne=" + cinPersonne + ", nomPersonne="
				+ nomPersonne + ", prenomPersonne=" + prenomPersonne + "]";
	}

}
