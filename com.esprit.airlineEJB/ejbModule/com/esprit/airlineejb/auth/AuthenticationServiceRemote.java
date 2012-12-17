package com.esprit.airlineejb.auth;

import javax.ejb.Remote;

import com.esprit.airlineejb.entities.Agent;

@Remote
public interface AuthenticationServiceRemote {
	void validAgent(Agent agent) throws AuthenticationException;
}
