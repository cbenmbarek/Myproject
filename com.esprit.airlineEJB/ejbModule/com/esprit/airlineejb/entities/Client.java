package com.esprit.airlineejb.entities;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Client
 * 
 */
@Entity
public class Client extends Personne implements Serializable {

	private String codeClient;
	private String adresseClient;
	private String telClient;
	private String faxClient;
	private String mailClient;
	private static final long serialVersionUID = 1L;

	public Client() {
		super();
	}

	public String getCodeClient() {
		return this.codeClient;
	}

	public void setCodeClient(String codeClient) {
		this.codeClient = codeClient;
	}

	public String getAdresseClient() {
		return this.adresseClient;
	}

	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}

	public String getTelClient() {
		return this.telClient;
	}

	public void setTelClient(String telClient) {
		this.telClient = telClient;
	}

	public String getFaxClient() {
		return this.faxClient;
	}

	public void setFaxClient(String faxClient) {
		this.faxClient = faxClient;
	}

	public String getMailClient() {
		return this.mailClient;
	}

	public void setMailClient(String mailClient) {
		this.mailClient = mailClient;
	}

	@Override
	public String toString() {
		return "Client [codeClient=" + codeClient + ", adresseClient="
				+ adresseClient + ", telClient=" + telClient + ", faxClient="
				+ faxClient + ", mailClient=" + mailClient + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((adresseClient == null) ? 0 : adresseClient.hashCode());
		result = prime * result
				+ ((codeClient == null) ? 0 : codeClient.hashCode());
		result = prime * result
				+ ((faxClient == null) ? 0 : faxClient.hashCode());
		result = prime * result
				+ ((mailClient == null) ? 0 : mailClient.hashCode());
		result = prime * result
				+ ((telClient == null) ? 0 : telClient.hashCode());
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
		Client other = (Client) obj;
		if (adresseClient == null) {
			if (other.adresseClient != null)
				return false;
		} else if (!adresseClient.equals(other.adresseClient))
			return false;
		if (codeClient == null) {
			if (other.codeClient != null)
				return false;
		} else if (!codeClient.equals(other.codeClient))
			return false;
		if (faxClient == null) {
			if (other.faxClient != null)
				return false;
		} else if (!faxClient.equals(other.faxClient))
			return false;
		if (mailClient == null) {
			if (other.mailClient != null)
				return false;
		} else if (!mailClient.equals(other.mailClient))
			return false;
		if (telClient == null) {
			if (other.telClient != null)
				return false;
		} else if (!telClient.equals(other.telClient))
			return false;
		return true;
	}

}
