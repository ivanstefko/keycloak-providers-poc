package org.keycloak.examples.rest;

import org.keycloak.models.KeycloakSession;
import org.keycloak.services.managers.AppAuthManager;
import org.keycloak.services.managers.AuthenticationManager;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class UserResource {

    private final KeycloakSession session;
    private final AuthenticationManager.AuthResult auth;

    public UserResource(KeycloakSession session) {
        this.session = session;
//        org.keycloak.services.managers.AppAuthManager test = new org.keycloak.services.managers.AppAuthManager();
        this.auth = new AppAuthManager().authenticateBearerToken(session, session.getContext().getRealm());
//        this.auth = null;
    }

    @Path("id")
    public ExampleResource getCompanyResource() {
        return new ExampleResource(session);
    }
}
