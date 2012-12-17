package com.esprit.airlineejb.entities;

import java.io.Serializable;

public class EscaleId implements Serializable {

	private static final long serialVersionUID = 1L;
	private String idAeroport;
	private String numVol;

	public String getIdAeroport() {
		return idAeroport;
	}

	public void setIdAeroport(String idAeroport) {
		this.idAeroport = idAeroport;
	}

	public String getNumVol() {
		return numVol;
	}

	public void setNumVol(String numVol) {
		this.numVol = numVol;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idAeroport == null) ? 0 : idAeroport.hashCode());
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
		EscaleId other = (EscaleId) obj;
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
		return true;
	}

	@Override
	public String toString() {
		return "EscaleId [idAeroport=" + idAeroport + ", numVol=" + numVol
				+ "]";
	}

}
