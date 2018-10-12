package org.keycloak.examples.rest;

import org.keycloak.models.KeycloakSession;
import org.keycloak.services.resource.RealmResourceProvider;
import org.keycloak.services.managers.AppAuthManager;

public class HelloResourceProvider implements RealmResourceProvider {

    private AppAuthManager.AuthResult auth;
    private KeycloakSession session;

    public HelloResourceProvider(KeycloakSession session) {
        this.session = session;
        this.auth = new AppAuthManager().authenticateBearerToken(session, session.getContext().getRealm());
        System.out.println(auth.getToken());
    }

    public Object getResource() {
        return new UserResource(this.session);
    }

    public void close() {

    }

}
