package com.esprit.airlineejb.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Reservation
 * 
 */
@Entity
public class Reservation implements Serializable {

	private String idReservation;
	private String dateReservation;

	private Vol vol;

	private Passenger passenger;
	private Client client;

	private static final long serialVersionUID = 1L;

	public Reservation() {

	}

	public Reservation(String idReservation, String dateReservation, Vol vol,
			Passenger passenger, Client client) {
		super();
		this.idReservation = idReservation;
		this.dateReservation = dateReservation;
		this.vol = vol;
		this.passenger = passenger;
		this.client = client;
	}

	@Id
	public String getIdReservation() {
		return this.idReservation;
	}

	public void setIdReservation(String idReservation) {
		this.idReservation = idReservation;
	}

	public String getDateReservation() {
		return this.dateReservation;
	}

	public void setDateReservation(String dateReservation) {
		this.dateReservation = dateReservation;
	}

	@ManyToOne
	@JoinColumn(name = "numVol", referencedColumnName = "numVol")
	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	@ManyToOne
	@JoinColumn(name = "cinpPassager", referencedColumnName = "cinPersonne")
	public Passenger getPassager() {
		return passenger;
	}

	public void setPassager(Passenger passenger) {
		this.passenger = passenger;
	}

	@ManyToOne
	@JoinColumn(name = "cinClient", referencedColumnName = "cinPersonne")
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation
				+ ", dateReservation=" + dateReservation + ", vol=" + vol
				+ ", passenger=" + passenger + ", client=" + client + "]";
	}

}
