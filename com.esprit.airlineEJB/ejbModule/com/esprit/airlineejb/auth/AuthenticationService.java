package com.esprit.airlineejb.auth;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.esprit.airlineejb.entities.Agent;
import com.esprit.airlineejb.service.PersistenceServiceLocal;


@Stateless(name = "AuthenticationSRV")
public class AuthenticationService implements AuthenticationServiceLocal,AuthenticationServiceRemote {

	@EJB
	PersistenceServiceLocal persistenceServiceLocal;

	public void validAgent(Agent agent) throws AuthenticationException {
		System.out.println(agent.toString());

		Agent a2 = new Agent();
		a2 = persistenceServiceLocal.findAgent(agent.getLoginAgent());

		if (a2 == null)
			throw new AuthenticationException();

		if (!(a2.getPassAgent().equals(agent.getPassAgent())))

			throw new AuthenticationException();
	}

}
