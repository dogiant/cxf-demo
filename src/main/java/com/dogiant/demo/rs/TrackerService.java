package com.dogiant.demo.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.dogiant.demo.rs.domain.Person;

@Path("/example")
@Produces({"application/json","application/xml"})
public interface TrackerService {

    @GET
    @Path("/{id}")
    public Person get(@PathParam("id") String id);

}
