package de.viada.services;

import de.viada.dtos.GasRaw;
import de.viada.dtos.PollutionRaw;
import io.quarkus.scheduler.Scheduled;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;

@RegisterRestClient(baseUri = "http://192.168.45.92:5000")
public interface SensorClientService {

    @GET
    @Path("/gas")
    @Consumes(MediaType.APPLICATION_JSON)
    GasRaw getGas();

    @GET
    @Path("/pollution")
    @Consumes(MediaType.APPLICATION_JSON)
    PollutionRaw getPollution();
}