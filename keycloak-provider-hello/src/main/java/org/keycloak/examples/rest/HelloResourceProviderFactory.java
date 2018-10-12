package org.keycloak.examples.rest;

import org.keycloak.Config;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.services.managers.AppAuthManager;
import org.keycloak.services.resource.RealmResourceProvider;
import org.keycloak.services.resource.RealmResourceProviderFactory;

public class HelloResourceProviderFactory implements RealmResourceProviderFactory {

    public static final String ID = "users";
    private AppAuthManager auth = null;

    public RealmResourceProvider create(KeycloakSession session) {
        return new HelloResourceProvider(session);
    }

    public void init(Config.Scope scope) {

    }

    public void postInit(KeycloakSessionFactory keycloakSessionFactory) {
    }

    public void close() {

    }

    public String getId() {
        return ID;
    }
}
