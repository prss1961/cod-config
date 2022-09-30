package dev.ifrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/aluno")
public class Configuration {

    @ConfigProperty(name = "PW2.message")
    String message;
    

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
       return "Nome do aluno: "+message;
    }
    
}