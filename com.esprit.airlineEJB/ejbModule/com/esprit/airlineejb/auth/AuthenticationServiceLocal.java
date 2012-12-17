package com.esprit.airlineejb.auth;

import javax.ejb.Local;

import com.esprit.airlineejb.entities.Agent;

@Local
public interface AuthenticationServiceLocal {
	void validAgent(Agent agent) throws AuthenticationException;
}
