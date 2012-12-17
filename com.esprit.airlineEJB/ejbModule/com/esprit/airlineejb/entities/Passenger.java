package com.esprit.airlineejb.entities;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Passenger
 * 
 */
@Entity
public class Passenger extends Personne implements Serializable {

	private String codePassager;
	private static final long serialVersionUID = 1L;

	public Passenger() {
		super();
	}

	public Passenger(String codePassager) {
		super();
		this.codePassager = codePassager;
	}

	public String getCodePassager() {
		return this.codePassager;
	}

	public void setCodePassager(String codePassager) {
		this.codePassager = codePassager;
	}

	@Override
	public String toString() {
		return "Passenger [codePassager=" + codePassager + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((codePassager == null) ? 0 : codePassager.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passenger other = (Passenger) obj;
		if (codePassager == null) {
			if (other.codePassager != null)
				return false;
		} else if (!codePassager.equals(other.codePassager))
			return false;
		return true;
	}

}
