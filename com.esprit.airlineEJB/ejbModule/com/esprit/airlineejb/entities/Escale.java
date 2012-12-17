package com.esprit.airlineejb.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Entity implementation class for Entity: Escale
 * 
 */
@Entity
@IdClass(EscaleId.class)
public class Escale implements Serializable {

	private String dateDepart;
	private String dateArrivee;
	private String heureDepart;
	private String heureArrivee;

	private String idAeroport;
	private String numVol;

	private Aeroport aeroport;
	private Vol vol;

	private static final long serialVersionUID = 1L;

	public Escale() {
		super();
	}

	@Id
	public String getIdAeroport() {
		return idAeroport;
	}

	public void setIdAeroport(String idAeroport) {
		this.idAeroport = idAeroport;
	}

	@Id
	public String getNumVol() {
		return numVol;
	}

	public void setNumVol(String numVol) {
		this.numVol = numVol;
	}

	public String getDateDepart() {
		return this.dateDepart;
	}

	public void setDateDepart(String dateDepart) {
		this.dateDepart = dateDepart;
	}

	public String getDateArrivee() {
		return this.dateArrivee;
	}

	public void setDateArrivee(String dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public String getHeureDepart() {
		return this.heureDepart;
	}

	public void setHeureDepart(String heureDepart) {
		this.heureDepart = heureDepart;
	}

	public String getHeureArrivee() {
		return this.heureArrivee;
	}

	public void setHeureArrivee(String heureArrivee) {
		this.heureArrivee = heureArrivee;
	}

	@ManyToOne
	@PrimaryKeyJoinColumn(name = "idAeroport", referencedColumnName = "idAeroport")
	public Aeroport getAeroport() {
		return aeroport;
	}

	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}

	@ManyToOne
	@PrimaryKeyJoinColumn(name = "numVol", referencedColumnName = "numVol")
	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	public Escale(String dateDepart, String dateArrivee, String heureDepart,
			String heureArrivee, String idAeroport, String numVol,
			Aeroport aeroport, Vol vol) {
		super();
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		this.heureDepart = heureDepart;
		this.heureArrivee = heureArrivee;
		this.idAeroport = idAeroport;
		this.numVol = numVol;
		this.aeroport = aeroport;
		this.vol = vol;
	}

	@Override
	public String toString() {
		return "Escale [dateDepart=" + dateDepart + ", dateArrivee="
				+ dateArrivee + ", heureDepart=" + heureDepart
				+ ", heureArrivee=" + heureArrivee + ", idAeroport="
				+ idAeroport + ", numVol=" + numVol + ", aeroport=" + aeroport
				+ ", vol=" + vol + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((aeroport == null) ? 0 : aeroport.hashCode());
		result = prime * result
				+ ((dateArrivee == null) ? 0 : dateArrivee.hashCode());
		result = prime * result
				+ ((dateDepart == null) ? 0 : dateDepart.hashCode());
		result = prime * result
				+ ((heureArrivee == null) ? 0 : heureArrivee.hashCode());
		result = prime * result
				+ ((heureDepart == null) ? 0 : heureDepart.hashCode());
		result = prime * result
				+ ((idAeroport == null) ? 0 : idAeroport.hashCode());
		result = prime * result + ((numVol == null) ? 0 : numVol.hashCode());
		result = prime * result + ((vol == null) ? 0 : vol.hashCode());
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
		Escale other = (Escale) obj;
		if (aeroport == null) {
			if (other.aeroport != null)
				return false;
		} else if (!aeroport.equals(other.aeroport))
			return false;
		if (dateArrivee == null) {
			if (other.dateArrivee != null)
				return false;
		} else if (!dateArrivee.equals(other.dateArrivee))
			return false;
		if (dateDepart == null) {
			if (other.dateDepart != null)
				return false;
		} else if (!dateDepart.equals(other.dateDepart))
			return false;
		if (heureArrivee == null) {
			if (other.heureArrivee != null)
				return false;
		} else if (!heureArrivee.equals(other.heureArrivee))
			return false;
		if (heureDepart == null) {
			if (other.heureDepart != null)
				return false;
		} else if (!heureDepart.equals(other.heureDepart))
			return false;
		if (idAeroport == null) {
			if (other.idAeroport != null)
				return false;
		} else if (!idAeroport.equals(other.idAeroport))
			return false;
		if (numVol == null) {
			if (other.numVol != null)
				return false;
		} else if (!numVol.equals(other.numVol))
			return false;
		if (vol == null) {
			if (other.vol != null)
				return false;
		} else if (!vol.equals(other.vol))
			return false;
		return true;
	}

}
