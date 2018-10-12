package org.keycloak.examples.rest;

import org.keycloak.models.KeycloakSession;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class ExampleResource {

    private final KeycloakSession session;

    public ExampleResource(KeycloakSession session) {
        this.session = session;
    }

    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getCompanies() {
        return new Person("Sergej Sergejevic", "200");
    }
}
