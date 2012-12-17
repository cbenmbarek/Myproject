package com.esprit.airlineejb.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Agent
 * 
 */
@Entity
public class Agent implements Serializable {

	private String loginAgent;
	private String passAgent;
	private static final long serialVersionUID = 1L;

	public Agent() {
	}

	public Agent(String loginAgent, String passAgent) {
		super();
		this.loginAgent = loginAgent;
		this.passAgent = passAgent;
	}

	@Id
	public String getLoginAgent() {
		return loginAgent;
	}

	public void setLoginAgent(String loginAgent) {
		this.loginAgent = loginAgent;
	}

	public String getPassAgent() {
		return this.passAgent;
	}

	public void setPassAgent(String passAgent) {
		this.passAgent = passAgent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((loginAgent == null) ? 0 : loginAgent.hashCode());
		result = prime * result
				+ ((passAgent == null) ? 0 : passAgent.hashCode());
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
		Agent other = (Agent) obj;
		if (loginAgent == null) {
			if (other.loginAgent != null)
				return false;
		} else if (!loginAgent.equals(other.loginAgent))
			return false;
		if (passAgent == null) {
			if (other.passAgent != null)
				return false;
		} else if (!passAgent.equals(other.passAgent))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Agent [loginAgent=" + loginAgent + ", passAgent=" + passAgent
				+ "]";
	}

}
