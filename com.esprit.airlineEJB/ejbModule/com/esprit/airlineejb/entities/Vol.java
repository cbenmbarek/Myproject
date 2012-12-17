package com.esprit.airlineejb.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Vol
 * 
 */
@Entity
public class Vol implements Serializable {

	private String numVol;
	private String dateDepartVol;
	private String dateArriveeVol;
	private String heureDepartVol;
	private String heureArriveeVol;
	private int nbrPlaceVacantes;

	private Aeroport aeroportDeparts;
	private Aeroport aeroportArrivees;

	private List<Escale> listeEscales;
	// private List<Reservation> listeReservations;

	private static final long serialVersionUID = 1L;

	public Vol() {
		super();
	}

	@Id
	public String getNumVol() {
		return this.numVol;
	}

	public void setNumVol(String numVol) {
		this.numVol = numVol;
	}

	public String getDateDepartVol() {
		return this.dateDepartVol;
	}

	public void setDateDepartVol(String dateDepartVol) {
		this.dateDepartVol = dateDepartVol;
	}

	public String getDateArriveeVol() {
		return this.dateArriveeVol;
	}

	public void setDateArriveeVol(String dateArriveeVol) {
		this.dateArriveeVol = dateArriveeVol;
	}

	public String getHeureDepartVol() {
		return this.heureDepartVol;
	}

	public void setHeureDepartVol(String heureDepartVol) {
		this.heureDepartVol = heureDepartVol;
	}

	public String getHeureArriveeVol() {
		return this.heureArriveeVol;
	}

	public void setHeureArriveeVol(String heureArriveeVol) {
		this.heureArriveeVol = heureArriveeVol;
	}

	public int getNbrPlaceVacantes() {
		return nbrPlaceVacantes;
	}

	public void setNbrPlaceVacantes(int nbrPlaceVacantes) {
		this.nbrPlaceVacantes = nbrPlaceVacantes;
	}

	@ManyToOne
	@JoinColumn(name = "idAeroportDepart", referencedColumnName = "idAeroport")
	public Aeroport getAeroportDeparts() {
		return aeroportDeparts;
	}

	public void setAeroportDeparts(Aeroport aeroportDeparts) {
		this.aeroportDeparts = aeroportDeparts;
	}

	@ManyToOne
	@JoinColumn(name = "idAeroportArrivee", referencedColumnName = "idAeroport")
	public Aeroport getAeroportArrivees() {
		return aeroportArrivees;
	}

	public void setAeroportArrivees(Aeroport aeroportArrivees) {
		this.aeroportArrivees = aeroportArrivees;
	}

	@OneToMany(mappedBy = "vol")
	public List<Escale> getListeEscales() {
		return listeEscales;
	}

	public void setListeEscales(List<Escale> listeEscales) {
		this.listeEscales = listeEscales;
	}

	public Vol(String numVol, String dateDepartVol, String dateArriveeVol,
			String heureDepartVol, String heureArriveeVol,
			int nbrPlaceVacantes, Aeroport aeroportDeparts,
			Aeroport aeroportArrivees, List<Escale> listeEscales) {
		super();
		this.numVol = numVol;
		this.dateDepartVol = dateDepartVol;
		this.dateArriveeVol = dateArriveeVol;
		this.heureDepartVol = heureDepartVol;
		this.heureArriveeVol = heureArriveeVol;
		this.nbrPlaceVacantes = nbrPlaceVacantes;
		this.aeroportDeparts = aeroportDeparts;
		this.aeroportArrivees = aeroportArrivees;
		this.listeEscales = listeEscales;
	}

	@Override
	public String toString() {
		return "Vol [numVol=" + numVol + ", dateDepartVol=" + dateDepartVol
				+ ", dateArriveeVol=" + dateArriveeVol + ", heureDepartVol="
				+ heureDepartVol + ", heureArriveeVol=" + heureArriveeVol
				+ ", nbrPlaceVacantes=" + nbrPlaceVacantes
				+ ", aeroportDeparts=" + aeroportDeparts
				+ ", aeroportArrivees=" + aeroportArrivees + ", listeEscales="
				+ listeEscales + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((aeroportArrivees == null) ? 0 : aeroportArrivees.hashCode());
		result = prime * result
				+ ((aeroportDeparts == null) ? 0 : aeroportDeparts.hashCode());
		result = prime * result
				+ ((dateArriveeVol == null) ? 0 : dateArriveeVol.hashCode());
		result = prime * result
				+ ((dateDepartVol == null) ? 0 : dateDepartVol.hashCode());
		result = prime * result
				+ ((heureArriveeVol == null) ? 0 : heureArriveeVol.hashCode());
		result = prime * result
				+ ((heureDepartVol == null) ? 0 : heureDepartVol.hashCode());
		result = prime * result
				+ ((listeEscales == null) ? 0 : listeEscales.hashCode());
		result = prime * result + nbrPlaceVacantes;
		result = prime * result + ((numVol == null) ? 0 : numVol.hashCode());
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
		Vol other = (Vol) obj;
		if (aeroportArrivees == null) {
			if (other.aeroportArrivees != null)
				return false;
		} else if (!aeroportArrivees.equals(other.aeroportArrivees))
			return false;
		if (aeroportDeparts == null) {
			if (other.aeroportDeparts != null)
				return false;
		} else if (!aeroportDeparts.equals(other.aeroportDeparts))
			return false;
		if (dateArriveeVol == null) {
			if (other.dateArriveeVol != null)
				return false;
		} else if (!dateArriveeVol.equals(other.dateArriveeVol))
			return false;
		if (dateDepartVol == null) {
			if (other.dateDepartVol != null)
				return false;
		} else if (!dateDepartVol.equals(other.dateDepartVol))
			return false;
		if (heureArriveeVol == null) {
			if (other.heureArriveeVol != null)
				return false;
		} else if (!heureArriveeVol.equals(other.heureArriveeVol))
			return false;
		if (heureDepartVol == null) {
			if (other.heureDepartVol != null)
				return false;
		} else if (!heureDepartVol.equals(other.heureDepartVol))
			return false;
		if (listeEscales == null) {
			if (other.listeEscales != null)
				return false;
		} else if (!listeEscales.equals(other.listeEscales))
			return false;
		if (nbrPlaceVacantes != other.nbrPlaceVacantes)
			return false;
		if (numVol == null) {
			if (other.numVol != null)
				return false;
		} else if (!numVol.equals(other.numVol))
			return false;
		return true;
	}

}
